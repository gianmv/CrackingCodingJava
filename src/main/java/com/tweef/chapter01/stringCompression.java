package com.tweef.chapter01;

public class stringCompression {
    public static String stringCompression(String s){
        int counter = 1;
        String last_letter = "" + s.charAt(0);
        String final_string = "";
        for (int i = 1; i < s.length(); i++) {
            if (!last_letter.equals("" + s.charAt(i))) {
                final_string += last_letter + ("" + counter);
                last_letter = "" + s.charAt(i);
                counter = 1;
            } else {
                counter += 1;
            }
        }
        final_string += last_letter + ("" + counter);
        if (final_string.length() < s.length()){
            return final_string;
        }
        return s;
    }
}
