import java.util.Scanner;

public class WordWithLength {
    public static String[] splitText(String text) {
        int wordCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }
        wordCount++;

        String[] words = new String[wordCount];
        int start = 0;
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[index] = text.substring(start);

        return words;
    }

    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[][] createWordArray(String[] words) {
        String[][] result = new String[words.length][2];
