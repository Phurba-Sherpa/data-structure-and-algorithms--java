package recursion;

public class ArraySortCheck {
    public static void main(String args[]) {
        int[] numbers = {0, 1, 8, 99, 100, 99};
        boolean result = isSorted(numbers);
        System.out.println(result);
    }

    static boolean isSorted(int[] numbers) {
        return checkSorted(numbers, numbers.length, 0);
    }

    static boolean checkSorted(int[] numbers, int length, int currentPosition) {
        if (length - 1 == currentPosition) return true;
        if (numbers[currentPosition] > numbers[currentPosition + 1]) return false;
        return checkSorted(numbers, length, currentPosition + 1);
    }
}
