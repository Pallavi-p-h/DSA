package basicRecursion;
import java.util.*;


//Print name N times


class Solution {
    public void printName(int N, String name, int count) {
        if (count==N) {
            return;
        }
        System.out.println("Pal");
        printName(N,name,count+1);
    }
}

//Main class
 public class Print_nTimes{
    public static void main(String[] args) {
        Solution sol=new Solution();
        int N=5;
        String name="Pal";
        sol.printName(N,name,0);
    }
}
