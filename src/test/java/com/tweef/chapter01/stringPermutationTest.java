package com.tweef.chapter01;

import org.junit.Assert;
import org.junit.Test;

public class stringPermutationTest {

    String WORD1 = "abcdef";
    String WORD2 = "abcdef";
    String WORD3 = "aaaabb";
    String WORD4 = "bbaaaa";
    String WORD5 = "abcde";
    String WORD6 = "bcdef";
    String WORD7 = "a";
    String WORD8 = "a";
    String WORD9 = "b";
    String WORD10 = "a";
    String WORD11 = "kkkkk";
    String WORD12 = "kkkk";

    @Test
    public void checkPermutation() {
        Assert.assertTrue(stringPermutation.checkPermutation(WORD1, WORD2));
        Assert.assertTrue(stringPermutation.checkPermutation(WORD3, WORD4));
        Assert.assertFalse(stringPermutation.checkPermutation(WORD5, WORD6));
        Assert.assertTrue(stringPermutation.checkPermutation(WORD7, WORD8));
        Assert.assertFalse(stringPermutation.checkPermutation(WORD9, WORD10));
        Assert.assertFalse(stringPermutation.checkPermutation(WORD11, WORD12));
    }
}
