package sorting;
import java.util.*;

//Bubble Sort Algorithm
//Problem Statement: Given an array of N integers, write a program to implement the Selection sorting algorithm.
///Example 1:
/// Input: N = 6, array[] = {13,46,24,52,20,9}
/// Output: 9,13,20,24,46,52

public class Bubble_sort {

    public static void bubbleSort(int[] arr) {
      int n=arr.length;


        for(int i=0;i<n;i++){
            boolean didSwap=false;

            for(int j=0;j<n-i-1;j++){

                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    didSwap=true;
                }
            }
            if(!didSwap)
                break;
        }
        System.out.println("After sorting");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};

        System.out.println("Before Using Bubble Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        Bubble_sort sorter = new Bubble_sort();
        sorter.bubbleSort(arr);
    }
}
