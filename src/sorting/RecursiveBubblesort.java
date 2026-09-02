package sorting;
import java.util.*;


public class RecursiveBubblesort {

    static void bubbleSort(int[] arr, int n){
        if(n==1)
            return;

        boolean flag = false;  //track if any swaps were made in this pass

        for(int j=0;j<n-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                flag=true;
            }
        }

        // If no swaps were made, the array is already sorted TC=O(n)
        if(!flag)
            return;
        bubbleSort(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};

        int n=arr.length;

        System.out.println("Before Using Bubble Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        bubbleSort(arr, n);

        System.out.println("After Using Bubble Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
