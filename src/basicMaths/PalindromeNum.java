package basicMaths;
import java.util.*;

//Check if a number is Palindrome or Not
//Problem Statement: Given an integer N, return true if it is a palindrome else return false.

public class PalindromeNum {

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reversedNum=0;
        int originalNum=num;   //Duplicate of given number

        while(num>0){
            int lastDigit=num%10;
            reversedNum=(reversedNum*10)+lastDigit;
            num=num/10;
        }
        System.out.println(reversedNum);

        //comparing duplicate with reversed number
         if(reversedNum == originalNum){
             System.out.println("true");
         }
         else System.out.println("false");

    }
}
