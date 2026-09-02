package basicRecursion;
//import java.uitl.*;

import java.util.Scanner;

//Problem Statement: Given an integer N. Print the Fibonacci series up to the Nth term.
public class Fibonacci {

    //Recursive solution

    static void fibonacci(int N){
        int fib=0;
        int first;
        if(N<=1)
            return;
        System.out.print(fib+" ");
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();


        //Iterative solution
//        int first=0, second=1;
//        System.out.print(first+" "+second+" ");
//        int fib=0;
//        for(int i=2;i<N;i++){
//            fib=first+second;
//            first=second;
//            second=fib;
//            System.out.print(fib+ " ");
    //    }
    }
}
