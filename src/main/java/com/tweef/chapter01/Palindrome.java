package com.tweef.chapter01;

import java.util.HashMap;
import java.util.Map;

/**
 * Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome
 */
public class Palindrome {
    public static boolean checkIsPalindromePermutation(String phrase) {
        String p = phrase.replaceAll(" ", "").toLowerCase();
        Map<String, Integer> map = new HashMap<>();

        for (String x : p.split("")) {
            if (!map.containsKey(x)) {
                map.put(x, 1);
            } else {
                map.put(x, map.get(x) + 1);
            }
        }

        if (p.length() % 2 == 0) {
            for (Map.Entry<String, Integer> x : map.entrySet()) {
                if (x.getValue() % 2 != 0) {
                    return false;
                }
            }
            return true;
        } else {
            boolean middleFound = false;
            for (Map.Entry<String, Integer> x : map.entrySet()) {

                if (x.getValue() % 2 != 0 ) {
                    if (middleFound) {
                        return false;
                    }
                    middleFound = true;
                }
            }
            return true;
        }
    }
}
