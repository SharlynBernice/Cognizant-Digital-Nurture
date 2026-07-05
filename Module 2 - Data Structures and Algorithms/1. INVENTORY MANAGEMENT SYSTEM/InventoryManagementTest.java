public class InventoryManagementTest {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        inventory.addProduct(new Product(101, "Laptop", 15));
        inventory.addProduct(new Product(102, "Keyboard", 40));
        inventory.addProduct(new Product(103, "Mouse", 30));
        inventory.addProduct(new Product(104, "Monitor", 10));

        inventory.displayProducts();

        inventory.searchProduct(103);

    }

}