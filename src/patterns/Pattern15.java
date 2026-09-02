package patterns;

import java.util.*;

//ABCDE
//ABCD
//ABC
//AB
//A

public class Pattern15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0 ; i<N; i++){

            for(char ch='A'; ch<= 'A'+ (N-i-1) ; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
        sc.close();
    }
}
