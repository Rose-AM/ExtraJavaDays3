package org.example;

import java.io.*;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\rose.mgbii\\IdeaProjects\\ExtraJavaDays3\\src\\extraJavaDaysExercise.txt";

        List<String> contentInFile = FileUtil.convertFileToList(filePath);
        System.out.println(Question1.mostCommon(contentInFile));
        Map <String, Integer> trying = (Question1.mostCommon(contentInFile));
        int min = (int) trying.values().toArray()[0];
        System.out.println(min);

//        BufferedReader br = null;
//        String st;
//        Map<String, Integer> eachWord = new HashMap<>();
//
//        File file = new File("C:\\Users\\rose.mgbii\\IdeaProjects\\ExtraJavaDays3\\src\\extraJavaDaysExercise.txt");
//        List<String> contentInFile = new ArrayList<>();
//
//        try {
//            br = new BufferedReader(new FileReader(file));
//        } catch (FileNotFoundException f) {
//
//            System.out.println("File Not Found");
//        }
//
//        try {
//            while ((st = br.readLine()) != null) {
//                // Print the string
////                System.out.println(st);
//                contentInFile.addAll(Arrays.stream(st.toLowerCase().split(" ")).toList());
//            }
//            System.out.println(contentInFile);
//        } catch (IOException e) {
//            System.out.println("IOException");
//        }
////
//        for (String word : contentInFile) {
//            int count = 1;
////            word.toLowerCase();
//            if (eachWord.containsKey(word)) {
//                count = eachWord.get(word) + 1;
//                eachWord.put(word, count);
//            } else {
//                eachWord.put(word, count);
//            }
//        }
//
//        //get words with most occurence
//        System.out.println(eachWord);
//        for (int i = 0; i < 3; i++) {
//            String maxWord = "";
//            int max = 0;
//            for (Map.Entry<String, Integer> eachMapEntry : eachWord.entrySet()) {
//                if (eachMapEntry.getValue() > max) {
//                    max = eachMapEntry.getValue();
//                    maxWord = eachMapEntry.getKey();
//                }
//
//            }
//
//            System.out.println("The maximum word is " + maxWord + ":" + max);
//            eachWord.remove(maxWord);
//
//        }
    }
}

//        listOfWords.stream().distinct()


//        System.out.println(eachWord);




//        List<String> result;
//        Stream<String> lines = null;
//
//        try {
//            try {
//                URI fileName = URI.create("extraJavaDaysExercise.txt");
//                lines = Files.lines(Paths.get(fileName));
//            }
//            catch (IllegalArgumentException e){
//                    System.out.println("fffff");
//                }
//            System.out.println("continuing");
//            result = lines.collect(Collectors.toList());
//            System.out.println(result);
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }


