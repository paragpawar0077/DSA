
import java.util.*;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();
        
        System.out.println("Armstrong numbers:");
        
        
        for (int num = start; num <= end; num++) {
            int original = num;
            int sum = 0;
            
           
            int digits = 0;
            int temp = num;
            while (temp > 0) {
                digits++;
                temp = temp / 10;
            }
            
            temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                sum = sum + (int)Math.pow(digit, digits);
                temp = temp / 10;
            }
            
            
            if (sum == original) {
                System.out.println(num);
            }
        }
        
        sc.close();
    }
}
