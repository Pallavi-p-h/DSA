package basicMaths;
import java.util.*;

//Problem Statement:Given an integer N, return true it is an Armstrong number otherwise return false.
//An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
//Example 1:
//Input:N = 153
//Output:True
//Explanation: 1^3+5^3+3^3 = 1 + 125 + 27 = 153

public class Armstrong_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num_of_digits=String.valueOf(n).length();
        int sum=0;
        int num=n;

        while(n>0){
            int rem=n%10;
            sum+= Math.pow(rem,num_of_digits);
            n/=10;
        }
            System.out.println(sum==num);
    }
}
