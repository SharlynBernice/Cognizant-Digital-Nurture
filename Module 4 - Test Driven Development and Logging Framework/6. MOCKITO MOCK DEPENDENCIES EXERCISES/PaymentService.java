public class PaymentService {

    private PaymentGateway paymentGateway;

    public PaymentService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public String makePayment(double amount) {

        if (paymentGateway.processPayment(amount)) {
            return "Payment Successful";
        }

        return "Payment Failed";
    }

}