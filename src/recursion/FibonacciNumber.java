package recursion;

public class FibonacciNumber {
    static int getNthFibonacciNumber (int position) {
        if (position == 1) return 0;
        if (position == 2) return 1;
        return getNthFibonacciNumber(position - 1) + getNthFibonacciNumber(position - 2);
    }
    public static void main (String[] args ) {
        int fibValue = getNthFibonacciNumber(6  );
        System.out.print(fibValue);
    }
}
