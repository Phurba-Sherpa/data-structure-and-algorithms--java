package recursion;

public class Factorial {
    public static void main(String[] args) {
        int factorial = calculateFactorial(5);
        System.out.println(factorial);
    }

    static int calculateFactorial(int number) {
        if (number == 0) return 1;
        if (number == 1) return 1;
        return number * calculateFactorial(number - 1);
    }
}
