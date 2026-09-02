package patterns;

import java.util.*;

//1        1
//12      21
//123    321
//1234  4321
//1234554321

public class Pattern12 {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        for(int i=0; i<N; i++) {

            for(int j=0; j<=i; j++){
                System.out.print(j+1);
            }

            for(int j=0; j<((2*(N-i))-2); j++){
                System.out.print(" ");
            }

            for(int j=i+1; j>=1; j--){
                System.out.print(j);

            }

            System.out.println();
        }
        sc.close();
    }


//Better approach

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        // Initial number of spaces in the first row
//        int spaces = 2 * (N - 1);
//
//        // Outer loop for the number of rows
//        for (int i = 1; i <= N; i++) {
//
//            // Inner loop to print numbers in increasing order
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//
//            // Inner loop to print spaces in the middle
//            for (int j = 1; j <= spaces; j++) {
//                System.out.print(" ");
//            }
//
//            // Inner loop to print numbers in decreasing order
//            for (int j = i; j >= 1; j--) {
//                System.out.print(j);
//            }
//
//            // Move to the next line after printing the row
//            System.out.println();
//
//            // Decrease spaces by 2 after each row
//            spaces -= 2;
//        }
//     sc.close();
//    }

}