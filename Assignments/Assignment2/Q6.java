/*Electricity Bill Program */
package ASS2;
import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter customer name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter units consumed: ");
        int units = sc.nextInt();
        
        double billAmount = 0;
        
        if(units < 0){
            System.out.println("Invalid units entered!");
        }
        else if(units <= 100){
            billAmount = units * 1.50;
        }
        else if(units <= 200){
            billAmount = 100 * 1.50 + (units - 100) * 2.50;
        }
        else if(units <= 300){
            billAmount = 100 * 1.50 + 100 * 2.50 + (units - 200) * 4.00;
        }
        else{
            billAmount = 100 * 1.50 + 100 * 2.50 + 100 * 4.00 + (units - 300) * 5.50;
        }
        
        if(units >= 0){
            System.out.println("\n--- Electricity Bill ---");
            System.out.println("Customer Name: " + name);
            System.out.println("Units Consumed: " + units);
            System.out.println("Total Bill: Rs. " + billAmount);
        }
        
        sc.close();
    }
}
