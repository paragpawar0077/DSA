
import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("Reversed string: " + rev);
        if(str.equals(rev)){
            System.out.println("The string is a palindrome.");
        }
        else{
            System.out.println("The string is not a palindrome.");
        }   
        sc.close();
    }
}
