//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        greet(5);
    }

    static void greet(int count) {
        if (count == 0) return;
        System.out.println("Good evening!");
        greet(count - 1);
    }

}