/* Find position of an element in infinite sorted array */

public class infinite {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        int result = findPosition(arr, target);
        System.out.println("Element found at index: " + result);
}


    static int findPosition(int[] arr, int target) {
        // Initialize the bounds for binary search
        int start = 0;
        int end = 1;

        // Expand the bounds until the target is within the range
        while (arr[end] < target) {
            start = end;
            end *= 2; // Double the right bound
        }

        // Perform binary search within the identified bounds
        return binarySearch(arr, start, end, target);
    }



    static int binarySearch(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                start = mid + 1; // Search in the right half
            } else {
                end = mid - 1; // Search in the left half
            }
        }
        return -1; // Target not found
    }
}