package sorting;
import java.util.*;

//Selection Sort Algorithm
//Problem Statement: Given an array of N integers, write a program to implement the Selection sorting algorithm.
///Example 1:
/// Input: N = 6, array[] = {13,46,24,52,20,9}
/// Output: 9,13,20,24,46,52


public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n=arr.length;


        for(int i=0;i<n;i++){
            int minIndex=i;

            for(int j=i;j<n;j++){
                if(arr[j]<arr[minIndex])
                   minIndex=j;
            }

            //swap the minIndex element with first element of the unsorted part.
              int temp=arr[minIndex];
             arr[minIndex]=arr[i];
             arr[i]=temp;
        }

        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
