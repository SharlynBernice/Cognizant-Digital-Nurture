public class CustomerOrder {

    private int orderId;
    private String customerName;
    private double orderAmount;

    public CustomerOrder(int orderId, String customerName, double orderAmount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderAmount = orderAmount;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    @Override
    public String toString() {
        return "Order ID : " + orderId +
               "\nCustomer : " + customerName +
               "\nAmount   : ₹" + orderAmount + "\n";
    }
}