package recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int sumOfDigits = calculateSumOfDigits(125);
        System.out.println(sumOfDigits);
    }

    static int calculateSumOfDigits(int number) {
        if (number == 0) return 0;
        int unitDigit = number % 10;
        return unitDigit + calculateSumOfDigits(number / 10);
    }
}
