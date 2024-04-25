package recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {99, 1, 4, 3, 12, 10, 0, 1};
        sort(numbers, 0);
        System.out.println(Arrays.toString(numbers));
    }

    static void sort(int[] numbers, int sortedCount) {
        int updatedLastUnsortedIndex = numbers.length - 1 - sortedCount;
        if (updatedLastUnsortedIndex == 0) return;

        int indexOfLargestEle = 0;

        // ** Search swap index
        for (int index = 1; index <= updatedLastUnsortedIndex; index++) {
            if (numbers[indexOfLargestEle] < numbers[index]) indexOfLargestEle = index;
        }

        // ** swap
        int tempVal = numbers[updatedLastUnsortedIndex];
        numbers[updatedLastUnsortedIndex] = numbers[indexOfLargestEle];
        numbers[indexOfLargestEle] = tempVal;

        // ** Repeat
        sort(numbers, sortedCount + 1);
    }
}
