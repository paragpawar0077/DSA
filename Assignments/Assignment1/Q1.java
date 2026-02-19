

import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        

        if(num%2==0){
            System.out.println(" is even");
        }
        else{
            System.out.println(" is odd");
        }
        sc.close();
    }
}
