class Quick {
    private int[] arr;

    public Quick(int[] arr) {
        this.arr = arr;
    }

    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public void sorted_arr() {
        int n = arr.length;
        quickSort(arr, 0, n - 1);
    }

    public void print_arr() {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6, 2, 9, 0, 3, 5, 1};
        Quick q = new Quick(arr);
        q.sorted_arr(); // Sort the array
        System.out.println("The sorted array: ");
        q.print_arr(); // Print the sorted array
    }
}
