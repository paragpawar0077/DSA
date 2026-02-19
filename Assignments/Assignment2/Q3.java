/*Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop) */
package ASS2;
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=0;
        int c=1;
        while (c!=0) {
            int user=sc.nextInt();
            if(user==0){
                c=0;
            } 
            x+=user;
        }
        
        System.out.println("Sum of numbers:: " + x);
        sc.close();
    }
}
