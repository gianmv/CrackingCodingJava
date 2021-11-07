package com.tweef.chapter01;

public class StringRotation {
    /**
     * Check if S2 is a String rotation of S1
     * @param s1
     * @param s2
     * @return
     */
    public static boolean isRotation(String s1, String s2) {
        String temp = s2 + s2;
        return temp.contains(s1);
    }
}
