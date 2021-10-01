package com.tweef.chapter01;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class stringCompressionTest {
    @Test
    public void stringCompressionTest(){
        List<String> listWord = new ArrayList<>();
        listWord.add("aabcccccaaa");
        listWord.add("rrrfghtj");
        listWord.add("rrrgggtttthhhha");
        listWord.add("aaggtthh");
        listWord.add("gggaarrhh");

        List<String> listAnswer = new ArrayList<>();
        listAnswer.add("a2b1c5a3");
        listAnswer.add("rrrfghtj");
        listAnswer.add("r3g3t4h4a1");
        listAnswer.add("aaggtthh");
        listAnswer.add("g3a2r2h2");

        for (int i = 0; i < 5; i++) {
            Assert.assertEquals(listAnswer.get(i), stringCompression.stringCompression(listWord.get(i)));
        }
    }
}
