package patterns;

import java.util.*;

//*        *
//**      **
//***    ***
//****  ****
//**********
//****  ****
//***    ***
//**      **
//*        *

public class Pattern20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int spaces=2*N-2;
        //using only one outer loop for rows
        for(int i=1; i<= 2*N -1; i++){

            int stars=i;

            if(i>N){
                stars=2*N -i;
            }

        //Print stars
             for(int j=1; j<=stars; j++){
                 System.out.print("*");
             }

         //Print spaces
             for(int j=1; j<=spaces; j++){
                 System.out.print(" ");
            }

         //Print stars
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }

            System.out.println();

            if(i<N) spaces-=2;
            else spaces+=2;
        }

        //My approach using two outer loops for upward and downward pattern not recommended
//        int spaces=2*(N-1);
//        for(int i=0 ; i< N; i++){
//
//            for(int j=0; j<=i; j++){
//                System.out.print("*");
//            }
//
//            for(int j=0; j< spaces; j++){
//                System.out.print(" ");
//            }
//
//            for(int j=0; j<=i; j++){
//                System.out.print("*");
//            }
//
//            spaces-=2;
//            System.out.println();
//        }
//
//        spaces=2;
//
//        for(int i=0 ; i< N-1; i++){
//
//            for(int j=0; j< (N-i-1); j++){
//                System.out.print("*");
//            }
//
//            for(int j=0; j< spaces; j++){
//                System.out.print(" ");
//            }
//
//            for(int j=(N-i-1); j>=1; j--){
//                System.out.print("*");
//            }
//            spaces+=2;
//            System.out.println();
//
//        }
        sc.close();
    }
}

