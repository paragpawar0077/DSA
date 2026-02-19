
import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers of your choice:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choice = sc.nextInt();
        
        if(choice == 1){
            System.out.println("The sum is: " + (num1 + num2));
        }
        else if(choice == 2){
            System.out.println("The difference is: " + (num1 - num2));
        }
        else if(choice == 3){
            System.out.println("The product is: " + (num1 * num2));
        }
        else if(choice == 4){
            if(num2 != 0){
                System.out.println("The quotient is: " + (num1 / num2));
            }
            else{
                System.out.println("Error: Division by zero is not allowed.");
            }
        }
        else{
            System.out.println("Invalid choice.");
        }
        sc.close();
    }
}