// Email Service Implementation
public class EmailService implements NotificationService {

    @Override
    public void sendNotification(String message) {

        System.out.println("Sending Email Notification...");
        System.out.println("Message : " + message);

    }

}