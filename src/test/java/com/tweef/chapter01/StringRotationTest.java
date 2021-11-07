package com.tweef.chapter01;

import org.junit.Assert;
import org.junit.Test;

public class StringRotationTest {

    //True test
    String s1 = "waterbottle";
    String s2 = "erbottlewat";

    //True test
    String s3 = "holamundo";
    String s4 = "mundohola";

    //True test
    String s5 = "asdfasdf";
    String s6 = "sdfasdfa";

    //True test
    String s7 = "emrz98@gmail.com";
    String s8 = ".comemrz98@gmail";

    //False test
    String s9 = "asdfasdfhhg";
    String s10 = "wwertwrtwertwert";

    //False test
    String s11 = "emmmanuel";
    String s12 = "maunelemm";

    @Test
    public void StringRotation01() {
        Assert.assertTrue(StringRotation.isRotation(s1, s2));
    }

    @Test
    public void StringRotation02() {
        Assert.assertTrue(StringRotation.isRotation(s3, s4));
    }

    @Test
    public void StringRotation03() {
        Assert.assertTrue(StringRotation.isRotation(s5, s6));
    }

    @Test
    public void StringRotation04() {
        Assert.assertTrue(StringRotation.isRotation(s7, s8));
    }

    @Test
    public void StringRotation05() {
        Assert.assertFalse(StringRotation.isRotation(s9, s10));
    }

    @Test
    public void StringRotation06() {
        Assert.assertFalse(StringRotation.isRotation(s11, s12));
    }
}
