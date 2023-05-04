package org.example;

import java.io.*;
import java.util.*;

public class Question1 {
    public  static  Map<String, Integer> wordsCount (List<String> listOfWords){
        Map<String, Integer> eachWordCount = new HashMap<>();
        for (String word : listOfWords) {
            int count = 1;
            if (eachWordCount.containsKey(word)) {
                count = eachWordCount.get(word) + 1;
                eachWordCount.put(word.toLowerCase(), count);
            } else {
                eachWordCount.put(word.toLowerCase(), count);
            }
        }
        return eachWordCount;
    }


    public static Map<String, Integer> mostCommon (List<String> listOfWords, int count){
        Map<String, Integer> eachWord = wordsCount(listOfWords);
        Map<String, Integer> mostCommon = new HashMap<>();

        //get words with most occurence
        for (int i = 0; i < count; i++) {
            String maxWord = "";
            int max = 0;
            for (Map.Entry<String, Integer> eachMapEntry : eachWord.entrySet()) {
                if (eachMapEntry.getValue() > max) {
                    max = eachMapEntry.getValue();
                    maxWord = eachMapEntry.getKey();
                }

            }
            mostCommon.put(maxWord,max);
            eachWord.remove(maxWord);
        }
        return mostCommon;
    }

    public static Map<String, Integer> leastCommon (List<String> listOfWords, int count){
        Map<String, Integer> eachWord = wordsCount(listOfWords);
        Map<String, Integer> leastCommon = new HashMap<>();

        //get words with most occurence
        for (int i = 0; i < count; i++) {
            String minWord = "";
            int min = (int) eachWord.values().toArray()[0];

            for (Map.Entry<String, Integer> eachMapEntry : eachWord.entrySet()) {
                if (eachMapEntry.getValue() <= min) {
                    min = eachMapEntry.getValue();
                    minWord = eachMapEntry.getKey();
                }

            }
            leastCommon.put(minWord,min);
            eachWord.remove(minWord);
        }
        return leastCommon;
    }
}
