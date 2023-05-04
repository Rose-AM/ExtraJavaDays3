package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.function.BooleanSupplier;

public  class Question1Test {
    List<String> listOfWords = new ArrayList<>();
    String[] arrayOfWords;

    @BeforeEach
    void setup(){
        arrayOfWords = new String[]{"hello", "there", "mum", "of", "of", "there", "mum"};
        listOfWords.addAll(Arrays.asList(arrayOfWords));
    }

    @Test
    void testingWordsCount(){
        Map<String, Integer> expected = new HashMap<>();
        expected.put("hello",1);
        expected.put("there",2);
        expected.put("mum",2);
        expected.put("of",2);

        assertEquals(expected, Question1.wordsCount(listOfWords));
    }

    @Test
    void testingMostCommonWords(){
        Map<String, Integer> expected = new HashMap<>();
        expected.put("there",2);
        expected.put("mum",2);
        expected.put("of",2);

        assertEquals(expected, Question1.mostCommon(listOfWords, 3));
    }

    @Test
    void leastCommonWords(){
        Map<String, Integer> expected = new HashMap<>();
        expected.put("hello",1);
        expected.put("mum",2);
        expected.put("of",2);

        assertEquals(expected, Question1.leastCommon(listOfWords, 3));
    }



}