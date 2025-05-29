package SOLID;

public class DIP_02 {

    public static interface Notification {

        void doNotify();
    }

    public static class EmailNotification implements Notification {

        @Override
        public void doNotify() {
            System.out.println("Sending notification via email!");
        }
    }

    public static class SMSNotification implements Notification {

        @Override
        public void doNotify() {
            System.out.println("Sending notification via SMS!");
        }
    }

    public static class Employee {

        private Notification notification;

        // Constructor Injection (DIP Compliant)
        public Employee(Notification notification) {
            this.notification = notification;
        }

        public void notifyEmployee() {
            notification.doNotify();
        }
    }

    public static void main(String[] args) {
        Notification emailNotification = new EmailNotification();
        Employee employee1 = new Employee(emailNotification);
        employee1.notifyEmployee();

        Notification smsNotification = new SMSNotification();
        Employee employee2 = new Employee(smsNotification);
        employee2.notifyEmployee();
    }
}
