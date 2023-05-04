package org.example;

public class Question3 {
    public static boolean unique(String string){
        String check = string.toLowerCase().replaceAll(" ", "");
        for(int i = 0; i < check.length() ; i++){
            if(check.indexOf(check.charAt(i)) != check.lastIndexOf(check.charAt(i))){
                return false;
            }

       }
        return true;
    }

}
