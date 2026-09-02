package basicRecursion;
import  java.util.*;

//Problem Description: Given an integer N, write a program to print numbers from 1 to N.

class Solution_print1toN {
    public void printName(int current, int N) {

       if(current>N) {
           return;
       }
       // System.out.print(current+" "); //Forward recursion

        printName(current+1, N);
        System.out.print(current+" ");  //Backtracking
    }
}

public class Print_1toN {
    public static void main(String[] args) {
        Solution_print1toN sol=new Solution_print1toN();
        int N=10;

        sol.printName(1,N);
    }
}
