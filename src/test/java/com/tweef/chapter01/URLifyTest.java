package com.tweef.chapter01;

import org.junit.Assert;
import org.junit.Test;

public class URLifyTest {

    String WORD1 = "Good for you  ";
    int LEN1 = 12;
    String ANS1 = "Good%20for%20you";

    String WORD2 = "   Hello world ";
    int LEN2 = 11;
    String ANS2 = "Hello%20world";

    String WORD3 = "asdfh fghfg fghf asdsd  ";
    int LEN3 = 22;
    String ANS3 = "asdfh%20fghfg%20fghf%20asdsd";

    String WORD4 = "Emmanuel";
    int LEN4 = 8;
    String ANS4 = "Emmanuel";

    String WORD5 = "Mexico Loose";
    int LEN5 = 12;
    String ANS5 = "Mexico%20Loose";

    String WORD6 = "PlayStation vs Xbox";
    int LEN6 = 19;
    String ANS6 = "PlayStation%20vs%20Xbox";

    @Test
    public void checkSpacesReplace() {
        Assert.assertEquals(ANS1, URLify.replaceSpaces(WORD1,LEN1));
        Assert.assertEquals(ANS2, URLify.replaceSpaces(WORD2,LEN2));
        Assert.assertEquals(ANS3, URLify.replaceSpaces(WORD3,LEN3));
        Assert.assertEquals(ANS4, URLify.replaceSpaces(WORD4,LEN4));
        Assert.assertEquals(ANS5, URLify.replaceSpaces(WORD5,LEN5));
        Assert.assertEquals(ANS6, URLify.replaceSpaces(WORD6,LEN6));

    }
}
