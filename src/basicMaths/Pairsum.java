package basicMaths;

import java.util.ArrayList;
import java.util.Arrays;

//Google mock interview youtube question
public class Pairsum {

    public static boolean targetSum(ArrayList<Integer> arr, int target){
        int low=0;
        int high=arr.size()-1;
        int sum=0;

        while(low<high){
            sum=arr.get(low)+arr.get(high);
            if(sum==target){
                return true;
            }
            if(sum< target){
                low++;
            }
            else{
                high--;
            }
        }
        return true;
    }

    public static void main(String []args){

        int target=10;
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,9,2,3));
        Boolean yes=targetSum(arr, target);

    }
}
