package recursion;
public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] numbers = {5,6,1,2,3,4};
        int index = getIndex(numbers, 0, numbers.length - 1, 4);
        System.out.println(index);
    }

    static int getIndex(int[] numbers, int startIndex, int endIndex, int key) {
        if (startIndex > endIndex) return -1;
        int mid = (startIndex + endIndex) / 2;
        int startValue = numbers[startIndex];
        int endValue = numbers[endIndex];
        int midValue = numbers[mid];

        // ** If matches
        if (midValue == key) return mid;

        // ** If left side is ordered
        if (startValue <= midValue) {
            // ** Check if key is in left side
            if (key >= startValue && key <= midValue) endIndex = mid - 1;
            else startIndex = mid + 1; // ** Key is in right side

        } else { // ** right side is ordered
            // ** check if key is in right side
            if (key>= midValue && key<=endValue) startIndex = mid + 1;
            else endIndex = mid - 1; // ** key is in left side
        }
        return getIndex(numbers, startIndex, endIndex, key);
    }
}
