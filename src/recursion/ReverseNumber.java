package recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        int reversedNumber = reverseNumber(123908);
        System.out.println(reversedNumber);
    }

    static int reverseNumber(int number) {
        if (number % 10 == number) return number;
            int digitsCount = (int) Math.log10(number)+1;
            int remainder = number % 10;
            int multiplier = (int) Math.pow(10, digitsCount - 1);
            return multiplier * remainder + reverseNumber(number / 10);
    }
}
