package binarySearch.bs1Darray;


//O(logn) TC
public class Upperbound {
    public static int upperBound(int[] arr, int x) {
        int n=arr.length;
        int ans=n;
        int low=0, high=n-1;

        while(low<=high){
            int mid=(low+high)/2;
            if (arr[mid] > x) {
                ans = mid;        // Store current index as potential answer
                high = mid - 1;   // Move left
            } else {
                low = mid + 1;    // Move right
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,8,9,15,19};
        int x=9;
        int ans=upperBound(arr,x);
        System.out.println(ans);
    }
}
