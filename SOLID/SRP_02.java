package SOLID;

public class SRP_02 {

    public static class Employee {

        private int employeeID;
        private String designation;
        private double salary;
        private String email;

        public Employee(int employeeID, String designation, double salary, String email) {
            this.employeeID = employeeID;
            this.designation = designation;
            this.salary = salary;
            this.email = email;
        }

        public int getEmployeeID() {
            return employeeID;
        }

        public String getDesignation() {
            return designation;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public String getEmail() {
            return email;
        }
    }

    public static class SalaryService {

        public void updateSalary(Employee employee, double newSalary) {
            // Business logic to update salary
            employee.setSalary(newSalary);
            System.out.println("Salary updated to: " + newSalary);
        }
    }

    public static class MailService {

        public void sendMail(Employee employee, String message) {
            // Email sending logic here
            System.out.println("Sending email to " + employee.getEmail());
            System.out.println("Message: " + message);
        }
    }
}
