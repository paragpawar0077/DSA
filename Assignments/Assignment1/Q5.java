
import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers of your choice:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1 > num2){
            System.out.println(num1 + " is the largest number.");
        }
        else if(num2 > num1){
            System.out.println(num2 + " is the largest number.");
        }
        else{
            System.out.println("Both numbers are equal.");
        }
        sc.close();
    }
}
