package basicMaths;
import java.util.*;


//Problem Statement: Given two integers N1 and N2, find their greatest common divisor.

//solution:
//1) Euclidean algorithm by subtraction
//2) Modulo operator in Euclidean algorithm.(efficient solution)


public class GcdOf_2_number {

    public static void main(String []args){
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt(), b=sc.nextInt();


//     /////////(1)Subtraction /////////////////

//        while(a!=b){
//            if(a>b){
//                a=a-b;
//            }
//            else{
//                b=b-a;
//            }
//        }
//        System.out.println(a);

//        /////////(2)Modulo operator ///////////////

        while(a>0 && b>0){
            if(a>b)
                a=a%b;
            else
                b=b%a;

        }
        System.out.println(a);

    }

}
