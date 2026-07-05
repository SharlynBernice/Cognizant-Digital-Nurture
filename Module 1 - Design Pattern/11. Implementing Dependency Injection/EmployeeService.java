// Client Class
public class EmployeeService {

    private NotificationService notificationService;

    // Dependency Injection using Constructor
    public EmployeeService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyEmployee(String message) {

        notificationService.sendNotification(message);

    }

}