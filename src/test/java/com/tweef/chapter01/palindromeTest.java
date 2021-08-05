package com.tweef.chapter01;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class palindromeTest {

    Map<String, Boolean> TESTS = new LinkedHashMap<>();

    @Before
    public void init() {
        TESTS.putAll(Map.of(
                "Dont nod", true,
                "Evil olive",true,
                "Amore Roma", true,
                "Borrow or rob", true,
                "Draw O coward", true,
                "Tact Coa", true,
                "coat suit", false,
                "remember the time", false,
                "man in the mirror", false,
                "smooth criminal", false));
        TESTS.put("billie jean", false);
        TESTS.put("thriller", false);
        TESTS.put("Stella won no wallets",true);
        TESTS.put("Wont lovers revolt now", true);
    }

    @Test
    public void checkPalindromeTest() {
        for (Map.Entry<String, Boolean> entry : TESTS.entrySet()) {
            Assert.assertEquals(entry.getKey(), entry.getValue(), Palindrome.checkIsPalindromePermutation(entry.getKey()));
        }
    }
}
