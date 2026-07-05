public class EmailAdapter implements NotificationSender {

    private EmailService emailService;

    public EmailAdapter() {
        emailService = new EmailService();
    }

    @Override
    public void sendNotification(String message) {
        emailService.sendEmail(message);
    }
}
