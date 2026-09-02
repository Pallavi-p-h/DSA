package patterns;

import java.util.*;

//Square pattern
public class Pattern01 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number of rows and colums should pattern be constructed");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");

            }
            System.out.println();
        }
        sc.close();
    }
}
