
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;


public class Revision {
    public static void main(String[] args) {
        
    }

    public int BinarySearch(int[] numbers, int low, int high, int target) {
        // base case
        if (low <= high) {
            int mid = (low + high)/2;
            if (target == numbers[mid]) {
                return mid;
            } else if (target < numbers[mid]) {
                return BinarySearch(numbers, low, mid - 1, target);
            } else {
                return BinarySearch(numbers, mid + 1, high, target);
            }
        } else {
            return -1;
        }
    }
}