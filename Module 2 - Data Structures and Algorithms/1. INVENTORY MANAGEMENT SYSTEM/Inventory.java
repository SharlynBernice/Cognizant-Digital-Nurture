import java.util.ArrayList;

public class Inventory {

    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    // Add a product
    public void addProduct(Product product) {

        products.add(product);

        System.out.println(product.getProductName()
                + " added successfully.");

    }

    // Display all products
    public void displayProducts() {

        System.out.println("\nInventory Details");
        System.out.println("-------------------------");

        for (Product product : products) {

            System.out.println(product);
            System.out.println("-------------------------");

        }

    }

    // Search product using Linear Search
    public void searchProduct(int productId) {

        for (Product product : products) {

            if (product.getProductId() == productId) {

                System.out.println("\nProduct Found");
                System.out.println("-------------------------");
                System.out.println(product);
                return;

            }

        }

        System.out.println("\nProduct Not Found.");

    }

}