package com.tweef.chapter01;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class isUnique {

    public boolean getIsUnique(String word) {
        Set<String> set = new HashSet<>();
        set.addAll(Arrays.asList(word.split("")));
        return set.size() == word.length();
    }

    public boolean getIsUniqueVector(String word){
        char[] arreglo = new char[1000];
        for (int i = 0; i < 1000 ; i++) {
            arreglo[i] = 0;
        }
        for(var letra: word.toCharArray()){
            arreglo[letra]++;

        }
        for (int i = 0; i < 1000; i++) {
            if(arreglo[i] >1){
                return false;
            }
        }
        return true;
    }
}
