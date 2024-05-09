package recursion;

import java.util.ArrayList;

public class StringSubset {
    public static void main (String[] args) {
        ArrayList<String> result = printSubset("abcd");

        System.out.println(result.toString());
    }

    static ArrayList<String> printSubset(String word) {
        ArrayList<String> result = new ArrayList();
        helper(word, "", result);
        return result;
    }

    static void helper(String original, String included, ArrayList<String> result) {
        if (original.length() == 0) {
            result.add(included);
            return;
        }

        helper(original.substring(1), included + original.charAt(0), result );
        helper(original.substring(1), included, result);
    }
}

