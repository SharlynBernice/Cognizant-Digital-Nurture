public class SortingTest {

    public static void printOrders(CustomerOrder[] orders) {

        for (CustomerOrder order : orders)
            System.out.println(order);
    }

    public static void main(String[] args) {

        CustomerOrder[] mergeOrders = {

                new CustomerOrder(101, "Alice", 2500),
                new CustomerOrder(102, "Bob", 1200),
                new CustomerOrder(103, "Charlie", 5400),
                new CustomerOrder(104, "David", 1800)

        };

        CustomerOrder[] quickOrders = {

                new CustomerOrder(101, "Alice", 2500),
                new CustomerOrder(102, "Bob", 1200),
                new CustomerOrder(103, "Charlie", 5400),
                new CustomerOrder(104, "David", 1800)

        };

        System.out.println("===== Merge Sort =====\n");

        MergeSort.mergeSort(mergeOrders, 0, mergeOrders.length - 1);

        printOrders(mergeOrders);

        System.out.println("===== Quick Sort =====\n");

        QuickSort.quickSort(quickOrders, 0, quickOrders.length - 1);

        printOrders(quickOrders);
    }
}