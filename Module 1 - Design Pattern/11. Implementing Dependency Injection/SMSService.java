// SMS Service Implementation
public class SMSService implements NotificationService {

    @Override
    public void sendNotification(String message) {

        System.out.println("Sending SMS Notification...");
        System.out.println("Message : " + message);

    }

}