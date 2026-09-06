package binarySearch.bs1Darray;

public class Search_in_X_sortedArray {


    //Time complexity: O(logn)
    private static int iterativeSearch(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(target==nums[mid]) return mid;

            else if(target>nums[mid])  low=mid+1;

            else  high=mid-1;
        }
        return -1;
    }

    //O(logN) time
    private static int resursiveBinarySearch(int[] nums, int target, int low, int high) {
        if(low>high) return -1;
        int mid=(low+high)/2;
        if(target==nums[mid]){
            return mid;
        }
        else if(target>nums[mid]){
            return resursiveBinarySearch(nums, target, mid+1, high);
        }
        return resursiveBinarySearch(nums, target, low, mid-1);
    }

    public static void main(String[] args) {
        int[] nums=new int[]{-1,0,3,5,9,12};
        int target=9;
        int ans=-1;
//       int ans=iterativeSearch(nums,target);
         ans=resursiveBinarySearch(nums,target,0,nums.length-1);
        System.out.println(ans);
    }


}
