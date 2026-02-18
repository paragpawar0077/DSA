package lectures.linear_search;

public class Linearsearch {
   
public static void main(String[] args){
    int[] arr = {34, 21, 56, 78, 12, 89, 90};
    int target = 78;
    int ans = linearSearch2(arr, target);
    System.out.println(ans);
    }

    // search in the array : return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        // run a for loop
        for(int index = 0; index < arr.length; index++){
            // check for element at every index if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }

    // search in the array : return the element if item found
    // otherwise if item not found return -1
        static int linearSearch2(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        // run a for loop
        for(int element : arr){
            // check for element at every index if it is = target
            if(element == target){
                return element;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return  Integer.MAX_VALUE;
    }
}