package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static String decodeVowels(String word) {
        return word.replaceAll("1", "a")
                .replaceAll("2", "e")
                .replaceAll("3", "i")
                .replaceAll("4", "o")
                .replaceAll("5", "u");
    }
    public static String decodeConsonants(String word) {
        StringBuilder decodedWord = new StringBuilder();
        for (char ch : word.toCharArray()) {
            if (Character.isLetter(ch) && !"aeiouAEIOU".contains(String.valueOf(ch))) {
                decodedWord.append((char) (ch - 1));
            } else {
                decodedWord.append(ch);
            }
        }
        return decodedWord.toString();
    }

}
