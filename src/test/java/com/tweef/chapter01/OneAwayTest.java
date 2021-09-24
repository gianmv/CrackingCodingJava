package com.tweef.chapter01;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;

public class OneAwayTest {
    public static class Prueba{
        String str1;
        String str2;
        Boolean result;
        public Prueba(String str1, String str2, Boolean result){
            this.str1 = str1;
            this.str2 = str2;
            this.result = result;
        }
        
    }

    private List<Prueba> tests = new LinkedList<>();
    @Before
    public void init(){
        tests.add(new Prueba("pale", "ple", true));
        tests.add(new Prueba("pales", "pale", true));
        tests.add(new Prueba("pale", "bale", true));
        tests.add(new Prueba("pale", "bake", false));
        tests.add(new Prueba("barco", "arco", true));
        tests.add(new Prueba("sano", "sapo", true));
        tests.add(new Prueba("barco", "arco", true));
        tests.add(new Prueba("perro", "pera", false));
        tests.add(new Prueba("pepe", "nepe", true));
    }

    @Test

    public void oneAwayTest() {
        
        for(Prueba test : tests){
            Assert.assertEquals(
                test.str1 + " " + test.str2,
                test.result ,
                OneAway.One_away_func(test.str1, test.str2)
                );
        }
        
    }
}
// "str1" : "barco",
// "str2" : "arco",
// "result" : True
// },
// {
// "str1" : "sano",
// "str2" : "sapo",
// "result" : True
// },
// {
// "str1" : "barco",
// "str2" : "arco",
// "result" : True
// },
// {
// "str1" : "perro",
// "str2" : "pera",
// "result" : False
// }