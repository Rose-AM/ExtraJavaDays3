package org.example;

import java.io.*;
import java.util.*;

public class Question1 {


    public static Map<String, Integer> mostCommon (List<String> listOfWords){
        Map<String, Integer> eachWord = new HashMap<>();
        Map<String, Integer> mostCommon = new HashMap<>();
        for (String word : listOfWords) {
            int count = 1;
//            word.toLowerCase();
            if (eachWord.containsKey(word)) {
                count = eachWord.get(word) + 1;
                eachWord.put(word, count);
            } else {
                eachWord.put(word, count);
            }
        }

        //get words with most occurence
        for (int i = 0; i < 3; i++) {
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

    public static Map<String, Integer> leastCommon (List<String> listOfWords){
        Map<String, Integer> eachWord = new HashMap<>();
        Map<String, Integer> leastCommon = new HashMap<>();
        for (String word : listOfWords) {
            int count = 1;
//            word.toLowerCase();
            if (eachWord.containsKey(word)) {
                count = eachWord.get(word) + 1;
                eachWord.put(word, count);
            } else {
                eachWord.put(word, count);
            }
        }

        //get words with most occurence
        for (int i = 0; i < 3; i++) {
            String maxWord = "";
            int min = (int) eachWord.values().toArray()[0];
            System.out.println(min);


            for (Map.Entry<String, Integer> eachMapEntry : eachWord.entrySet()) {
                if (eachMapEntry.getValue() > min) {
                    min = eachMapEntry.getValue();
                    maxWord = eachMapEntry.getKey();
                }

            }
            leastCommon.put(maxWord,min);
            eachWord.remove(maxWord);
        }
        return leastCommon;
    }
}
