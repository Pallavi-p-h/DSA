package sorting;

public class RecursiveInsertionSort {

    public static void insertionSort(int[] arr, int n, int selectedIndex) {
        if (selectedIndex == n) {
            return;
        }

        int key = arr[selectedIndex];
        int j = selectedIndex;

        while (j > 0 && arr[j-1] > key) {
            arr[j] = arr[j-1];
            j--;
        }
        arr[j] = key;

        insertionSort(arr, n, selectedIndex + 1);

    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};

        int n=arr.length;

        System.out.println("Before Using Insertion Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        insertionSort(arr, n, 0);

        System.out.println("After Using Insertion Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
