package patterns;

import java.util.*;

//*********
// *******
//  *****
//   ***
//    *
public class Pattern08 {

//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int N=sc.nextInt();
//
//        //Outer loop for rows
//        for(int i=N-1; i>=0; i--){
//
//            for(int j=0; j < N-i-1; j++){
//                System.out.print(" ");
//            }
//
//            for(int j=0; j < 2*i+1 ;j++){
//                System.out.print("*");
//            }
//
//            //Move to next row
//            System.out.println();
//        }
//     sc.close();
//    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        //If we want to run outer loop from 0 not from backwards use this approach
        for(int i=0; i<N; i++){

            for(int j=0; j < i; j++){
                System.out.print(" ");
            }

            for(int j=0; j < 2*(N-i)-1 ;j++){
                System.out.print("*");
            }

            //Move to next row
            System.out.println();
        }
        sc.close();
    }
}