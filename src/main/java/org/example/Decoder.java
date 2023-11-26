package org.example;

public class Decoder {
    public static boolean isVowelEncoded(String word) {
        if(word.matches(".*[1-5].*")){
            System.out.println("String is encoded by 1st method");
            return word.matches(".*[1-5].*");
        }
        System.out.println("String isn`t encoded by 1st method");
        return false;
    }
    public static String decodeVowels(String word) {
        return word.replaceAll("1", "a")
                .replaceAll("2", "e")
                .replaceAll("3", "i")
                .replaceAll("4", "o")
                .replaceAll("5", "u");
    }
    public static boolean isConsonantEncoded(String word) {
        for (char ch : word.toCharArray()) {
            if (Character.isLetter(ch) && !"aeiouAEIOU".contains(String.valueOf(ch))) {
                int diff = ch - 'a';
                if (diff < 0 || diff > 20) { // Літери від 'b' до 'z'
                    System.out.println("String isn`t encoded by 2nd method");
                    return false;
                }
            }
        }
        System.out.println("String encoded by 2nd method");
        return true;
    }
    public static String decodeConsonants(String word) {
        StringBuilder decodedWord = new StringBuilder();
        for (char ch : word.toCharArray()) {
            if (Character.isLetter(ch)) {
                decodedWord.append((char) (ch - 1));
            } else {
                decodedWord.append(ch);
            }
        }
        return decodedWord.toString();
    }
}
