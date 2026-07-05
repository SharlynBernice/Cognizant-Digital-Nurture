public class SMSAdapter implements NotificationSender {

    private SMSService smsService;

    public SMSAdapter() {
        smsService = new SMSService();
    }

    @Override
    public void sendNotification(String message) {
        smsService.sendSMS(message);
    }
}
