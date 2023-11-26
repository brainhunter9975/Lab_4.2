package org.example;

import static org.example.Decoder.*;

public class Main {
    public static void main(String[] args) {
        String word = "uftujoh";
        isConsonantEncoded(word);
        String encodedWord = decodeConsonants(word);
        System.out.println("Decoded: " + encodedWord);

        String word1 = "t2st3ng";
        isVowelEncoded(word1);
        String decodedWord = decodeVowels(word1);
        System.out.println("Decoded: " + decodedWord);
    }
}
