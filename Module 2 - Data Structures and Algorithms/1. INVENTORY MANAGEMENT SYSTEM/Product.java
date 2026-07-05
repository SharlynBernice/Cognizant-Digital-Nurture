public class Product {

    private int productId;
    private String productName;
    private int quantity;

    public Product(int productId, String productName, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {

        return "Product ID   : " + productId +
               "\nProduct Name : " + productName +
               "\nQuantity     : " + quantity;

    }
}