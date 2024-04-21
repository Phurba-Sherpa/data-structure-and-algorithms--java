package recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int keyIndex = search(numbers, 0, numbers.length-1, 1);
        System.out.println(keyIndex);
    }

    static int search(int[] numbers, int startIndex, int endIndex, int searchValue) {
        int midPoint = (startIndex + endIndex) / 2;
        if (startIndex > endIndex) return -1;
        int currentValue = numbers[midPoint];
        if (currentValue == searchValue) return midPoint;
        else if (currentValue > searchValue) endIndex = midPoint - 1;
        else startIndex = midPoint + 1;
        return search(numbers, startIndex, endIndex, searchValue);
    }
}
