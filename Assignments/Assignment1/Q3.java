
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount:");
        double P = sc.nextDouble();
        System.out.print("Enter the rate of interest:");
        double R = sc.nextDouble();
        System.out.print("Enter the time period:");
        double T = sc.nextDouble();
        double SI = (P * R * T) / 100;
        System.out.printf("The simple interest is: %.2f\n", SI);
        sc.close();
    }
}
