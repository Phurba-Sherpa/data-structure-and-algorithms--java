package recursion;

public class CharacterExclude {
    public static void main(String[] args) {
        String updatedString = getUpdatedString("Hello world", 0, 'o');
        System.out.println(getUpdatedString("Hello, world !", ", world"));
    }

    static String getUpdatedString(String word, int currentIndex, char excludeChar) {
        if (word.length() == currentIndex) return "";
        char charAtCurrentIndex = word.charAt(currentIndex);
        return "" + (charAtCurrentIndex == excludeChar ? "" : charAtCurrentIndex) + getUpdatedString(word, currentIndex+1, excludeChar);
    }

    static String getUpdatedString(String words, String skipWord) {
        if (words.isEmpty()) return "";
        if (words.startsWith(skipWord)) return getUpdatedString(words.substring(skipWord.length()), skipWord);
        return words.charAt(0) + getUpdatedString(words.substring(1), skipWord);

    }
}
