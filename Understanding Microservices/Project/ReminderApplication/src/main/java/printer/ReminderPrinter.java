package printer;

import reminderapp.Reminder;

public class ReminderPrinter {

    public void printReminders() {
        Reminder.reminders.forEach(System.out::println);
    }

}
