package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question2Test {
    String palindrome;
    String notPalindrome;

    @BeforeEach
    void setup() {
        palindrome = "Mum";
        notPalindrome = "Damien";
    }

    @Test
    void palindrome(){
        assertTrue(Question2.palindrome(palindrome));
        assertFalse(Question2.palindrome(notPalindrome));
    }

}