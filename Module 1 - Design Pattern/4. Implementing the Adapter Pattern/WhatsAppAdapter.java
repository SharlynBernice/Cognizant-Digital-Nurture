public class WhatsAppAdapter implements NotificationSender {

    private WhatsAppService whatsappService;

    public WhatsAppAdapter() {
        whatsappService = new WhatsAppService();
    }

    @Override
    public void sendNotification(String message) {
        whatsappService.sendWhatsAppMessage(message);
    }
}
