package binarySearch.bs1Darray;

//Bruteforce approach would be linear search which takes O(n) Tc
//O(logn)
public class LowerBound {
    public static int lowerBound(int[] arr, int x) {
        int n=arr.length;
        int ans=n;
        int low=0, high=n-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]>=x){
                ans=mid;   //store possible answer
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int x=9;
        int ans=lowerBound(arr,x);
        System.out.println(ans);
    }
}
