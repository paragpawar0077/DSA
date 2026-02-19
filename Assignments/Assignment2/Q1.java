/*Subtract the Product and Sum of Digits of an Integer */
package ASS2;
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of your choice:");
            int num1 = sc.nextInt();
            
            int sum=0;
            int product=1;
            while (num1 > 0) {
                sum += num1 % 10;
                product *= num1 % 10;
                num1 /= 10;
            }
            System.out.println("Sum of digits: " + sum);
            System.out.println("Product of digits: " + product);
            System.out.println("Difference between Product and Sum of digits: " + (product - sum));
            sc.close();
        }
    }
    

