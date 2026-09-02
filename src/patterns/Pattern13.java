package patterns;

import java.util.*;

//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15

public class Pattern13 {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int s=1;
        for(int i=1; i<=N; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(s+" ");
                s++;
            }
            System.out.println();
        }
        sc.close();
    }
}