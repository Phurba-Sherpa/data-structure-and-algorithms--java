package recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {1,2,99,1000};
        int keyIndex = findIndex(numbers, 10000);
        System.out.println(keyIndex);
    }

    static int findIndex(int[] numbers, int key) {
        return getIndex(numbers, numbers.length - 1, key);
    }

    static int getIndex(int[] numbers, int currentPosition, int key) {
        if (currentPosition < 0) return -1;
        if (numbers[currentPosition] == key) return currentPosition;
        return getIndex(numbers, currentPosition - 1, key);
    }
}
