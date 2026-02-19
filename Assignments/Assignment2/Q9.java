/*Write a program to print the sum of negative numbers, sum of positive even numbers 
and the sum of positive odd numbers from a list of numbers (N) entered by the user. 
The list terminates when the user enters a zero. */
package ASS2;
import java.util.*;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers (0 to terminate): ");
        int user =sc.nextInt();
        int negSum=0;
        int posEvenSum=0;
        int posOddSum=0;
        while (user!=0) {
            if(user<0){
                negSum+=user;
            }
            else if(user%2==0){
                posEvenSum+=user;
            }
            else{
                posOddSum+=user;
            }
            user = sc.nextInt();
        }
        System.out.println("Sum of negative numbers: " + negSum);
        System.out.println("Sum of positive even numbers: " + posEvenSum);
        System.out.println("Sum of positive odd numbers: " + posOddSum);
        sc.close();
    }
    
}
