package com.tweef.chapter01;

/**
 * URLify: Write a method to replace all spaces in a string with '%20'
 */
public class URLify {
    public static String replaceSpaces(String word, int length) {
        char[] array = word.toCharArray();
        int start = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != ' ') {
                start = i;
                break;
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int i = start; i < (start + length); i++) {
            if (array[i] == ' ') {
                ans.append("%20");
            } else {
                ans.append(array[i]);
            }
        }

        return ans.toString();
    }
}
