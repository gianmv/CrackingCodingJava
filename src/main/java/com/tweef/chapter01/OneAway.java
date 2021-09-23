package com.tweef.chapter01;
public class OneAway {
    public static Boolean One_away_func(String str1, String str2){
        if(Math.abs(str1.length() - str2.length()) > 1) return false;
        
        if(str1.length() == str2.length()){
            int cont = 0;
            for(int i = 0;i<str1.length();i++){
                if(str1.charAt(i) != str2.charAt(i)){
                    cont++;
                }
            }
            return cont<=1;
        }

        String min_str = str1.length()< str2.length() ? str1 : str2;
        String max_str = str2.length()> str1.length() ? str2 : str1;
        int shift = 0;
        for(int i = 0;i< min_str.length();i++){
            if(min_str.charAt(i) != max_str.charAt(i + shift)){
                if(shift == 1){
                    return false;
                }
                shift = 1;
            }
        }
        if(min_str.charAt(min_str.length() - 1) != max_str.charAt(min_str.length() -1 + shift)){
            return false;
        }
        return  true;
    }
}
