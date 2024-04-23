package recursion;

public class ZeroCount {
    public static void main(String[] args) {
        int count = countZero(1010);
        System.out.println(count);
    }

    static int countZero(int number) {
        if (number <= 0) return 0;
        int incrementValue = number % 10 == 0 ? 1 : 0;
        return incrementValue + countZero(number / 10);
    }
}
