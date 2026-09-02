package patterns;

import java.util.*;

// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *
public class Pattern10 {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        //Better approach with clean code

        //outer loop for rows
        for(int i=1 ; i <= 2*N -1; i++){

            //stars would be equal to no.of rows uptill first half
            int stars=i;

             //for the second half of the triangle
            if(i>N) {
                stars= 2*N -i;
            }

            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }




        //My initial approach with two outer loops

//        for(int i=1; i<=N; i++){
//
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        for(int i=N-1; i>0; i--){
//
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            //Move to next row
//            System.out.println();
//        }
        sc.close();
    }
}