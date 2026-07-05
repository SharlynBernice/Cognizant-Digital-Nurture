public class NotificationTest {

    public static void main(String[] args) {

        NotificationSender email = new EmailAdapter();
        NotificationSender sms = new SMSAdapter();
        NotificationSender whatsapp = new WhatsAppAdapter();

        System.out.println("----- Email Notification -----");
        email.sendNotification("Your order has been placed.");

        System.out.println();

        System.out.println("----- SMS Notification -----");
        sms.sendNotification("Your OTP is 456789.");

        System.out.println();

        System.out.println("----- WhatsApp Notification -----");
        whatsapp.sendNotification("Your package will arrive tomorrow.");
    }
}
