package recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 99};

        sort(numbers, 0);
        System.out.println(Arrays.toString(numbers));
    }

    static void sort(int[] numbers, int sortedCount) {
        if (numbers.length-1 - sortedCount == 0) return;

        boolean isValueSwapped = false;
        for (int index = 0; index < numbers.length - 1 - sortedCount; index++) {
            int firstVal = numbers[index];
            int secondVal = numbers[index+1];

            if (firstVal > secondVal) {
                numbers[index] = secondVal;
                numbers[index+1] = firstVal;
                isValueSwapped = true;
            }
        }

        if (!isValueSwapped) return;
        sort(numbers, sortedCount+1);
    }
}
