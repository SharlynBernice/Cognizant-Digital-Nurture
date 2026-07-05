public class QuickSort {

    public static void quickSort(CustomerOrder[] orders, int low, int high) {

        if (low < high) {

            int pivot = partition(orders, low, high);

            quickSort(orders, low, pivot - 1);
            quickSort(orders, pivot + 1, high);
        }
    }

    private static int partition(CustomerOrder[] orders, int low, int high) {

        double pivot = orders[high].getOrderAmount();

        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (orders[j].getOrderAmount() <= pivot) {

                i++;

                CustomerOrder temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }

        CustomerOrder temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;

        return i + 1;
    }
}