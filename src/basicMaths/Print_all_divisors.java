package basicMaths;
import java.util.*;

//Problem Statement: Given an integer N, return all divisors of N.
//A divisor of an integer N is a positive integer that divides N without leaving a remainder.
//In other words, if N is divisible by another integer without any remainder, then that integer is considered a divisor of N.
//Input: N = 36
//Output: [1, 2, 3, 4, 6, 9, 12, 18, 36]

public class Print_all_divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //create a list to store divisors.
        List<Integer> ans=new ArrayList<>();

        //optimized approach
        for(int divisor=1;divisor<=Math.sqrt(num);divisor++){
            if(num%divisor==0){
                ans.add(divisor);
                if(divisor!=(num/divisor))  //Here if num/divisor is distinct, add that to the list of divisors as well.
                    ans.add(num/divisor);
            }
        }

        for(int i:ans){
            System.out.print(i+", ");
        }
    }
}
