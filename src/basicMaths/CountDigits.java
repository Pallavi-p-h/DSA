package basicMaths;
import java.util.*;

//Count Digits in a number.
//Example 1:
//Input:N = 12345
//Output:5
//Explanation:  The number 12345 has 5 digits.

public class CountDigits {
    public static void main(String []args) {
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int count=0;

      while(num!=0){
          count++;
          num=num/10;
      }
        System.out.println(count);
    }
}
