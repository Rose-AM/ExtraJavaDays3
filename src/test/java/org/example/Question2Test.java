package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question2Test {


    @Test
    void palindrome() {
        String string = "MADAm";
        String string1 = "MADAM";
        String string2 = "madam";
        String string3 = "nurses run";
        String string4 = "love";
        assertTrue(Question2.palindrome(string));
        assertTrue(Question2.palindrome(string1));
        assertTrue(Question2.palindrome(string2));
        assertTrue(Question2.palindrome(string3));
        assertFalse(Question2.palindrome(string4));
    }
}