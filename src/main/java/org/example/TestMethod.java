package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMethod {

    @Test
    void testIsVowelEncoded() {
        assertTrue(Decoder.isVowelEncoded("12345")); // check if encoded by 1st method
        assertFalse(Decoder.isVowelEncoded("testing")); // check if not encoded by 1st method
    }

    @Test
    void testDecodeVowels() {
        assertEquals("testing", Decoder.decodeVowels("t2st3ng")); // check decoding from 1st method
    }

    @Test
    void testIsConsonantEncoded() {
        assertTrue(Decoder.isConsonantEncoded("ufttjoh")); // check if encoded by 2nd method
    }

    @Test
    void testDecodeConsonants() {
        assertEquals("testing", Decoder.decodeConsonants("uftujoh")); // check decoding from 2nd method
    }
}