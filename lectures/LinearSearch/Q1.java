package lectures.linear_search;
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        String name = "Kunal";
        char target = 'u';
        System.out.println(Search(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean Search(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}
