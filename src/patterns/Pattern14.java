package patterns;

import java.util.*;

//A
//AB
//ABC
//ABCD
//ABCDE

public class Pattern14 {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        //Better and clean approach
        for(int i=0; i<N; i++){

            for(char ch='A'; ch<= 'A' + i; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }

//       My approach
//        for(int i=1; i<=N; i++) {
//            int s=65;
//            for (int j = 1; j <= i; j++) {
//                System.out.print((char)s);
//                s++;
//            }
//            System.out.println();
//        }
        sc.close();
    }
}