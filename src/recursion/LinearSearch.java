package recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {99,2,99,1000, 0, 9, 99, 80, 99};
        ArrayList<Integer> indexList = findAllIndex(numbers, 919);
        System.out.println(indexList);
    }

    static ArrayList<Integer> findAllIndex(int[] numbers, int key) {
        ArrayList<Integer> indexList = new ArrayList<>();
        getAllIndex(numbers, numbers.length - 1, key, indexList);
        return indexList;
    }
    static void getAllIndex(int[] numbers, int currentPosition, int key, ArrayList<Integer> indexList) {
        if (currentPosition < 0) return;
        if (numbers[currentPosition] == key) indexList.addFirst(currentPosition);
        getAllIndex(numbers, currentPosition -1, key, indexList);
    }

    static int findLastIndex(int[] numbers, int key) {
        return getLastIndex(numbers, numbers.length - 1, key);
    }
    static int getLastIndex(int[] numbers, int currentPosition, int key) {
        if (currentPosition < 0) return -1;
        if (numbers[currentPosition] == key) return currentPosition;
        return getLastIndex(numbers, currentPosition - 1, key);
    }
}
