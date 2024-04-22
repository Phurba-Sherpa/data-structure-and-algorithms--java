package recursion;

public class PalindromeNumber {
    public static void main(String[] args) {
        boolean result = isPalindrome(1201);
        System.out.println(result);
    }

    static boolean isPalindrome(int number ) {
        int digitsCount = (int) Math.log10(number) + 1;
        return checkPalindrome(number, digitsCount);
    }

    static boolean checkPalindrome(int number, int digitsCount) {
        if (digitsCount <= 0) return true;
        int leftmostDigit = number % 10;
        int multiplier = (int) (Math.pow(10, digitsCount - 1));
        int rightmostDigit = number / multiplier;
        int remainingDigits = number % multiplier;
        if (leftmostDigit != rightmostDigit) return false;
        return checkPalindrome(remainingDigits / 10, digitsCount - 2);
    }
}
