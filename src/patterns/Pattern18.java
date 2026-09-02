package patterns;

import java.util.*;

//E
//DE
//CDE
//BCDE
//ABCDE

public class Pattern18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0 ; i<N; i++){

            for(char ch=(char)('A'+ N-1-i); ch<= (char)('A'+ N-1); ch++){

                System.out.print(ch);
            }
            System.out.println();

        }
        sc.close();
    }
}
