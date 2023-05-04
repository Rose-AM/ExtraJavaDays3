package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileUtil {
    public static List<String> convertFileToList (String filepath){
        File file = new File(filepath);
        List<String> contentInFile = new ArrayList<>();
        BufferedReader br = null;
        String st;

        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException f) {

            System.out.println("File Not Found");
        }

        try {
            while ((st = br.readLine()) != null) {
                // Print the string
//                System.out.println(st);
                contentInFile.addAll(Arrays.stream(st.toLowerCase().split(" ")).toList());
            }
        } catch (IOException e) {
            System.out.println("IOException");
        }
        return contentInFile;
    }
}
