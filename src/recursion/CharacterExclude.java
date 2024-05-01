package recursion;

public class CharacterExclude {
    public static void main(String[] args) {
        String updatedString = getUpdatedString("Hello world", 0, 'o');
        System.out.println(updatedString);
    }

    static String getUpdatedString(String word, int currentIndex, char excludeChar) {
        if (word.length() == currentIndex) return "";
        char charAtCurrentIndex = word.charAt(currentIndex);
        return "" + (charAtCurrentIndex == excludeChar ? "" : charAtCurrentIndex) + getUpdatedString(word, currentIndex+1, excludeChar);
    }
}
