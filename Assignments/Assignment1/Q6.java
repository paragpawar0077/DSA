
import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount in ruppes:");
        double ruppes = sc.nextDouble();
        double usd= ruppes/90.13 ;
        System.out.printf("The amount in USD is: %.2f\n", usd);
        
        sc.close();
    }
}
