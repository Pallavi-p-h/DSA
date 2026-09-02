package patterns;

import java.util.*;

//A
//BB
//CCC
//DDDD
//EEEEE

public class Pattern16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0 ; i<N; i++){

            char ch= (char) ('A' + i);

            for(int j=0; j<=i; j++){
                System.out.print(ch);
            }

            System.out.println();
        }
        sc.close();
    }
}
