package org.example;

import java.util.Locale;

public class Question2 {
    public static boolean palindrome(String string){
        String check = string.toLowerCase().replaceAll(" ", "");

        for(int i = 0; i < check.length() ; i++){
            int len = check.length() - (1+i);
            if(check.charAt(i) != check.charAt(len))
                return false;
        }
        return true;
    }

}
