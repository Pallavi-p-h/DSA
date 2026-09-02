package basicRecursion;
import java.util.*;

//Problem Statement: Given a number X,  print its factorial.

public class Factorial {
    public static int factorial(int N){

 ///////////////////////// Iterative solution with O(N) TC & O(1) SC ///////////////
//        int ans=1;
//        for(int i=1;i<=N;i++){
//            ans*=i;
//        }
//        return ans;

   /////////////////Recursive solution with O(N) TC & O(N) SC ///////////////
        if(N<=0){
            return 1;
        }
        return N*factorial(N-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int ans=factorial(num);
        System.out.println(ans);
    }
}
