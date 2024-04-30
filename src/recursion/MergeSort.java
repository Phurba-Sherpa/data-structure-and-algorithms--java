package recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] numbers = {2,1,3, 56, 0, 99, -1, 88};
        sortV2(numbers, 0 , numbers.length-1);
        System.out.println(Arrays.toString(numbers));
    }

    static int[] sort(int[] numbers, int startIndex, int endIndex) {

        int mid = (startIndex + endIndex) / 2;
        if (startIndex == endIndex) return new int[] {numbers[startIndex]};

        int[] leftList = sort(numbers, startIndex, mid);// sort left
        int[] rightList = sort(numbers, mid+1, endIndex);// sort right
        int[] mergedList = merge(leftList, rightList);// merge
        return mergedList;
    }

    static int[] merge(int[] leftList, int[] rightList) {
        int leftStartIndex = 0, startThreshold = leftList.length - 1, rightStartIndex = 0, rightThreshold = rightList.length - 1;
        int[] mergedList = new int[leftList.length + rightList.length];
        int currentPosition = 0;

        while (leftStartIndex <= startThreshold && rightStartIndex <= rightThreshold) {
            mergedList[currentPosition++] = leftList[leftStartIndex] < rightList[rightStartIndex] ? leftList[leftStartIndex++] : rightList[rightStartIndex++];
        }

        for (; leftStartIndex <= startThreshold; ) {
            mergedList[currentPosition++] = leftList[leftStartIndex++];
        }

        for (; rightStartIndex <= rightThreshold; ) {
            mergedList[currentPosition++] = rightList[rightStartIndex++];
        }
        return mergedList;
    }



    static void sortV2(int[] numbers, int startIndex, int endIndex) {

        int mid = (startIndex + endIndex) / 2;
        if (startIndex == endIndex) return;

        sortV2(numbers, startIndex, mid);// sort left
         sortV2(numbers, mid+1, endIndex);// sort right
        mergeV2(numbers, startIndex, mid, endIndex);// merge
    }
    static void mergeV2(int[] numbers, int startIndex, int mid, int endIndex) {
        int[] leftList = Arrays.copyOfRange(numbers, startIndex, mid+1);
        int[] rightList = Arrays.copyOfRange(numbers, mid+1, endIndex+1);
        int currentUpdateIndex = startIndex, leftCurrentIndex = 0, rightCurrentIndex = 0;

        while(leftCurrentIndex < leftList.length && rightCurrentIndex < rightList.length) {
            numbers[currentUpdateIndex++] = leftList[leftCurrentIndex] < rightList[rightCurrentIndex] ? leftList[leftCurrentIndex++] : rightList[rightCurrentIndex++];
        }

        for (; leftCurrentIndex < leftList.length; ) {

            numbers[currentUpdateIndex++] = leftList[leftCurrentIndex++];
        }

        for (; rightCurrentIndex < rightList.length; ) {
            numbers[currentUpdateIndex++] = rightList[rightCurrentIndex++];
        }

    }
}
