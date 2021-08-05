package com.tweef.chapter01;

import java.util.Arrays;

/**
 * Check Permutation: Given two strings, write a method to decide if one is permutation of the others
 */
public class stringPermutation {
    public static boolean checkPermutation(String word1, String word2) {
        char[] a = word1.toCharArray();
        char[] b = word2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b);
    }
}
