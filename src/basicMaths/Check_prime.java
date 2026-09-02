package basicMaths;
import java.util.*;

//Check if a number is prime or not
//time complexity: O(sqrt(N))

public class Check_prime {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //Brute force approach would be looping from 1 to num and increasing count.
        //optimal approach
        int count=0;
        for(int i=1; i<= Math.sqrt(num); i++){
            if(num%i ==0){
                count++;
                if(i!=num/i) count++;
            }
        }

        System.out.println(count==2);

    }
}
