package recursion;

public class Number {
    public static void main(String[] args) {
        printSeries(5);
    }
    
    static void printSeries(int count) {
        if (count == 0) return;
        printSeries(count - 1);
        System.out.println(count);
    }

    static void printSeriesV2(int count) {
        for (int i = 1; i<= count; i++) System.out.println(count);
    }
}
