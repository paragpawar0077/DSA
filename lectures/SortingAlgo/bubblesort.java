import java.util.*;

public class bubblesort {
    public static void main(String[] args) {
        int [] arr={5,4,1,3,2};
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble_sort(int [] arr){
        boolean swapped;
        // run the steps n-1 times
        for(int i=0;i<arr.length;i++){
             swapped=false;
             // for each step, max item will come at the last respective index
                for(int j=1;j<arr.length-i;j++){
                    // swap if the item is smaller than the previous item
                    if(arr[j]<arr[j-1]){
                        // swap
                        int temp=arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=temp;
                        swapped=true;
                    }
                }
                if(swapped==false){ // if no swapping occurs, it means the array is already sorted
                    break;
                }
        }
    }
    
}
// time complexity: O(n^2) because of the nested loops
// worst case: O(n^2) when the array is sorted in reverse order
// best case: O(n) when the array is already sorted, because we only have to go through the array once to check if it is sorted
// space complexity: O(1) because we are not using any extra space, we are sorting the array in place
