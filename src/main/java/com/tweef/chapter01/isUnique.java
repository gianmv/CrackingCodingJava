package com.tweef.chapter01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class isUnique {

    public boolean getIsUnique(String word) {
        Set<String> set = new HashSet<>();
        set.addAll(Arrays.asList(word.split("")));
        return set.size() == word.length();
    }

    public boolean getIsUniqueWithoutSet {
        
    }
}
