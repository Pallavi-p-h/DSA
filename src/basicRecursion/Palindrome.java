package basicRecursion;
import java.util.*;

//Problem Statement: Given a string, check if the string is palindrome or not.
// A string is said to be palindrome if the reverse of the string is the same as the string.

public class Palindrome {

    static boolean palindrome(String str, int low, int high){

        if(low>=high){
            return true;
        }
        if(str.charAt(low)!=str.charAt(high)){
            return false;
        }
        return palindrome(str,low+1,high-1);
    }

//    static boolean palindrome(String str){
//        int low=0;
//        int high=str.length()-1;
//        while(low<high){
//            if(str.charAt(low)!=str.charAt(high)){
//                return false;
//            }
//            low++; high--;
//        }
//        return true;
//    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=str.length();
//        boolean ans=palindrome(str);
        boolean ans=palindrome(str,0, n-1);

        System.out.println(ans);

    }
}
