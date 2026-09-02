package patterns;

import java.util.*;

//    A
//   ABA
//  ABCBA
// ABCDCBA
//ABCDEDCBA

public class Pattern17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0 ; i<N; i++){
            for(int j=0; j< N-i-1; j++){
                System.out.print(" ");
            }

            char ch='A';
            int breakpoint=(2*i+1) /2;

            for(int j=1; j<= 2*i+1; j++){
                System.out.print(ch);
                // Increment or decrement character
                if (j <= breakpoint) ch++;
                else ch--;
            }

            System.out.println();
        }
        sc.close();
    }
}
