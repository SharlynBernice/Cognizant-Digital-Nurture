public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {

                new Product(104, "Laptop", 65000),
                new Product(101, "Mouse", 800),
                new Product(103, "Keyboard", 1500),
                new Product(102, "Monitor", 12000)

        };

        System.out.println("LINEAR SEARCH");

        Product result =
                ProductSearch.linearSearch(products, 103);

        if (result != null)
            System.out.println(result);

        System.out.println();

        System.out.println("BINARY SEARCH");

        result =
                ProductSearch.binarySearch(products, 103);

        if (result != null)
            System.out.println(result);

    }

}