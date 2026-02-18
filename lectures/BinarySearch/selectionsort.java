import java.util.*;
public class selectionsort {

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection_sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last =arr.length-i-1;
            int maxIndex=getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    static int getMaxIndex(int[] arr,int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}

// time complexity: O(n^2) because of the nested loops
// worst case: O(n^2) when the array is sorted in reverse order
// best case: O(n^2) when the array is already sorted, because we still have to go through all the elements to find the max index
// space complexity: O(1) because we are not using any extra space, we are