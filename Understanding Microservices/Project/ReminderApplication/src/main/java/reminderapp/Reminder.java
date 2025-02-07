package reminderapp;


import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Reminder {
    private int reminderId;
    private String note;
    private LocalDateTime time;

    public static List<Reminder> reminders = new ArrayList<Reminder>();

    public Reminder() {
    }

    public Reminder(int reminderId, String note, LocalDateTime time) {
        this.reminderId = reminderId;
        this.note = note;
        this.time = time;
    }

    public void addReminder(Reminder reminder) {
        boolean invalidReminder = validateReminder(reminder);
        if (!invalidReminder) {
            throw new RuntimeException("Reminder entered is not valid; Please check again: " + reminder);
        }
        reminders.add(reminder);
    }

    public void removeReminder(int reminderId) {
        reminders.remove(reminderId);
    }

    public void saveReminders(String fileName) throws FileNotFoundException {
        try(PrintStream writer = new PrintStream("C:/Users/Ashutosh_Tiwari/Desktop/Learn Java/ThingOnGithub/Java/Selenium Express/Solid/"+fileName)) {
            reminders.forEach(writer::println);
        }
    }

    public boolean validateReminder(Reminder reminder) {
        if (reminder.getReminderId() <= 0) {
            return false;
        }
        if (reminder.getNote().isBlank()) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return "Reminder{" +
                "reminderId=" + reminderId +
                ", note='" + note + '\'' +
                ", time=" + time;
    }

    public int getReminderId() {
        return reminderId;
    }

    public void setReminderId(int reminderId) {
        this.reminderId = reminderId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
