package sorting;
import java.util.*;

public class Quick_sort {
    public static void quickSort(int[] arr, int low, int high){


    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n=arr.length;

        System.out.println("Before Using Quick Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
    }
        System.out.println();
        quickSort(arr,0,n-1);
        System.out.println("After Using Quick Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
