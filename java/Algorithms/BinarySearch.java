package Algorithms;

public class BinarySearch {
    public static int binarySearch(int[] numbers, int low, int high, int target) {
        // base case
        if (low <= high) {
            // calculate middle index
            int mid = (low + high)/2;
            
            if (target == numbers[mid]) {
                return mid;
            } else if (target < numbers[mid]) {
                return binarySearch(numbers, low, mid - 1, target);
            } else { // target > numbers[mid]
                return binarySearch(numbers, mid + 1, high, target);
            }
        } else {
            return -1;
        }
    }
}
