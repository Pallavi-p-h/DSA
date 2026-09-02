package patterns;

import java.util.*;

//     *
//    ***
//   *****
//  *******
// *********
//***********
public class Pattern07 {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        //Outer loop for rows
        for(int i=0; i<N; i++){

            for(int j=0; j < N-i-1; j++){
                System.out.print(" ");
            }

            for(int j=0; j < 2*i+1 ;j++){
                System.out.print("*");
            }

            //not needed
//            for(int j=0; j < N-i-1; j++){
//                System.out.print(" ");
//            }

            //Move to next row
            System.out.println();
        }
        sc.close();
    }
}