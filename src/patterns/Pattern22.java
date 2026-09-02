package patterns;
import java.util.*;

//4 4 4 4 4 4 4
//4 3 3 3 3 3 4
//4 3 2 2 2 3 4
//4 3 2 1 2 3 4
//4 3 2 2 2 3 4
//4 3 3 3 3 3 4
//4 4 4 4 4 4 4

public class Pattern22 {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();


        for(int i=0; i< (2*N)-1; i++){

            for(int j=0; j< (2*N)-1; j++){
                int top=i;
                int left=j;
                int bottom=(2*N-2) -i;
                int right=(2*N-2) -j;

                int minDist= Math.min(Math.min(top,bottom), Math.min(left,right));

                System.out.print((N-minDist)+ " ");
            }

            System.out.println();
        }
        sc.close();
    }
}
