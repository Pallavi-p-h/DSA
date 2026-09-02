package basicRecursion;
import java.util.*;

//Problem Statement: You are given an array. The task is to reverse the array and print it.
//Examples
//Input: N = 5, arr[] = {5,4,3,2,1}
//Output: {1,2,3,4,5}

public class Reverse_array {

    /////////////Recursive approach O(N) & O(N)////////////
    static int[] reverseArray(int[] arr, int low,int high){
        if(low>=high){
            return arr;
        }
        int temp=arr[low];
            arr[low]= arr[high];
            arr[high]=temp;
        return reverseArray(arr,low+1,high-1);
    }

    //////////////////Iterative O(N) TC & O(1) SC///////////////

//    static int[] reverseArray(int[] arr, int n){
//        int lo=0;
//        int hi =n-1;
//        while(lo< hi){
//            int temp=arr[lo];
//            arr[lo]= arr[hi];
//            arr[hi]=temp;
//            lo++;
//            hi--;
//        }
//        return arr;
//    }


    //////   Collections.reverse() method can be used to reverse a list in-place. O(N) tc & O(1)sc
    /// Arrays need to be converted to a list first, as the Collections utility works with List types,
    /// not primitive arrays.

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter number of elements in an array");
        int n=sc.nextInt();

        //We can use Arraylist instead of primitive array.
        int[] arr=new int[n];
        int[] ans=new int[n];

        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

//        ans=reverseArray(arr,n); //for iterative approach
        ans=reverseArray(arr,0,n-1); //for recursive

        System.out.println("Reversed array is:");
        for(int i:ans){
            System.out.print(i+" ");
        }

    }
}
