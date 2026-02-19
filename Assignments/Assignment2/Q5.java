/*Factorial Program In Java(Without using function) */
package ASS2 ;
import java.util.*;
public class Q5 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int fact=n;
        if(n==0){
            System.out.println("The factorial of 0 is 1");
        }
       else if(n>=1){
            for(int i =1;i<n;i++){
                fact *= n-i;
            }
            System.out.println("The factorial of " + n + " is " + fact);
        }
        else{
            System.out.println("enter a valid number");
        }
        
        sc.close();
    }
    
}
