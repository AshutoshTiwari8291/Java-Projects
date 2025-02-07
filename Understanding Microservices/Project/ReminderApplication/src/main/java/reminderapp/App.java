package reminderapp;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        Reminder reminder = new Reminder();

        Reminder playCricket = new Reminder(10, "Play cricket", LocalDateTime.of(2023,01,16,10,15));
        Reminder codeForHours = new Reminder(102, "Code", LocalDateTime.of(2023,01,16,10,15));
        Reminder doWorkout = new Reminder(103, "Workout for 2 hr", LocalDateTime.of(2023,01,16,10,15));

        reminder.addReminder(playCricket);
        reminder.addReminder(codeForHours);
        reminder.addReminder(doWorkout);
        reminder.printReminders();

        try {
            reminder.saveReminders("MondayReminder");
            reminder.saveReminders("TuesReminder");
            reminder.saveReminders("FridayReminder");
        } catch (FileNotFoundException f) {
            System.out.println("File not found do something....");
        }

    }
}
