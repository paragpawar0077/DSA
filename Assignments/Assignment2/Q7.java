/*Calculate Average Of N Numbers */
package ASS2;
import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        
        if(n <= 0){
            System.out.println("Please enter a valid positive number!");
        }
        else{
            int sum = 0;
            for(int i = 0; i < n; i++){
                System.out.println("Enter number " + (i+1) + ": ");
                int num = sc.nextInt();
                sum += num;
            }
            double average = (double)sum / n;
            System.out.println("The average of the entered numbers is: " + average);
        }
        
        sc.close();
    }
}