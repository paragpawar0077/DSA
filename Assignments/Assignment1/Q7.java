
import java.util.*;
public class Q7 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the total numbers for which you want a Fibonacci series:");
         int n = sc.nextInt();
            int a = 0, b = 1;
            System.out.print("Fibonacci Series: " + a + ", " + b);
            for (int i = 2; i < n; i++) {
                int next = a + b;
                System.out.print(", " + next);
                a = b;
                b = next;
            }
            sc.close();
    }
}
