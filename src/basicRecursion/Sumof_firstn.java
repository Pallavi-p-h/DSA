package basicRecursion;
import java.util.*;

//Problem Statement: Given a number ‘N’, find out the sum of the first N natural numbers .
//3 ways to solve this
//1) for loop from 1 to n
//2) using formula: N*(N+1)/2 ----> O(1)
//3) recursive approach

public class Sumof_firstn {

    static int sumOfNum(int N){
        if(N==1){
            return 1;
        }
        return N+sumOfNum(N-1);
    }


    public static void main(String[] args) {
        int N=9;
        int ans=sumOfNum(N);
        System.out.println(ans);
    }
}
