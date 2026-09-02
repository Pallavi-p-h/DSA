package sorting;
import java.util.*;

//Insertion Sort algorithm

public class Insertion_sort {

    public static void insertionSort(int[] arr){
        int n=arr.length;

        for(int i=0;i<n;i++){
            int j=i;
            int key=arr[i];
            while(j>0 && arr[j-1]>key){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=key;
        }

        System.out.println("sorted array");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};

        System.out.println("Before Using Insertion Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        Insertion_sort sorter = new Insertion_sort();
        sorter.insertionSort(arr);
    }
}
