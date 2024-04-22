package recursion;

public class Number {
    public static void main(String[] args) {
        printNto1(5);
    }
    
    static void printNto1(int count) {
        if (count == 0) return;
        System.out.println(count);
        printNto1(count -    1);
    }

    static void print1toN(int n) {
        if (n == 0) return;
        print1toN(n - 1);
        System.out.println(n);
    }

    static void printSeriesV2(int count) {
        for (int i = 1; i<= count; i++) System.out.println(count);
    }
}
