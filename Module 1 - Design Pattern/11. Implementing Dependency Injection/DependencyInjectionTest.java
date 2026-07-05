// Main Class
public class DependencyInjectionTest {

    public static void main(String[] args) {

        System.out.println("Using Email Service\n");

        NotificationService emailService = new EmailService();

        EmployeeService employee =
                new EmployeeService(emailService);

        employee.notifyEmployee("Your leave request has been approved.");

        System.out.println();

        System.out.println("Using SMS Service\n");

        NotificationService smsService = new SMSService();

        EmployeeService employee2 =
                new EmployeeService(smsService);

        employee2.notifyEmployee("Your salary has been credited.");

    }

}