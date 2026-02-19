/*Take integer inputs till the user enters 0 and print the largest number from all. */
package ASS2;

import java.util.Scanner;

public class Q4 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=0;
        int c=1;
        while (c!=0) {
            int user=sc.nextInt();
            if(user==0){
                c=0;
            } 
            if(user>x){
                x=user;
            }
        }
        
    System.out.println("the max of the number is " + x);
        sc.close();
    }
}
