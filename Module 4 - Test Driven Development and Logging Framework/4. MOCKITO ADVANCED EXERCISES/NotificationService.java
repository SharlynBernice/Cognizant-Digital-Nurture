public class NotificationService {

    private EmailService emailService;

    public NotificationService(EmailService emailService) {
        this.emailService = emailService;
    }

    public String sendNotification(String recipient, String message) {

        boolean status = emailService.sendEmail(recipient, message);

        if (status) {
            return "Notification Sent Successfully";
        }

        return "Notification Failed";

    }

}