package basicMaths;
import java.util.*;

//Reverse Digits of A Number
//Problem Statement: Given an integer N return the reverse of the given number.
//Note: If a number has trailing zeros, then its reverse will not include them.
//For e.g , reverse of 10400 will be 401 instead of 00401.

//Ex= 12345
//output= 54321

public class ReverseNum {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reversedNum=0;

        while(num>0){
            int lastDigit=num%10;
            reversedNum=(reversedNum*10)+lastDigit;
            num=num/10;
        }
        System.out.println(reversedNum);
    }
}
