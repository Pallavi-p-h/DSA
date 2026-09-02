package sorting;

import java.util.*;

public class Merge_sort {

    static void merge(int[] arr, int low, int mid, int high){
        int left =low;
        int right =mid+1;
        //int k=low;
        List<Integer> temp=new ArrayList<>();
        //int[] temp= new int[arr.length]; //declaring array with size same as original array

        while(left <=mid && right <=high){
            if(arr[left]<=arr[right])
                temp.add(arr[left++]);
            else
                temp.add(arr[right++]);
        }

        while(left <=mid){
            temp.add(arr[left++]);
        }

        while(right <=high){
            temp.add(arr[right++]);
        }

        //copying the sorted elements from temp array to original array
        for(int i = low; i <=high; i++){
            arr[i]=temp.get(i -low);
        }

    }

    static void mergeSort(int[] arr,int low,int high) {
        if(low>=high) return;
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n=arr.length;

        System.out.println("Before Using Merge Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        mergeSort(arr,0,n-1);
        System.out.println("After Using Merge Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
