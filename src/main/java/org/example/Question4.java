package org.example;

import java.util.Arrays;

public class Question4 {
    public static char[] replaceSpace(char[] input){
        String phrase = new String(input);
        return phrase.replaceAll( " ", "%20").toCharArray();
    }
}
