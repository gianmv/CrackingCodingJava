package com.tweef.chapter01;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class RotateMatrixTest {

    int[][] param1 = {
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 1, 1, 1}
    };
    int[][] ans1 = {
            {0, 0, 0, 1},
            {0, 0, 0, 1},
            {0, 0, 0, 1},
            {1, 1, 1, 1}
    };
    int[][] param2 = {
            {0, 0, 1, 0, 0},
            {0, 1, 0, 1, 0},
            {1, 0, 0, 0, 1},
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1}
    };
    int[][] ans2 = {
            {0, 0, 1, 1, 1},
            {0, 1, 0, 1, 1},
            {1, 0, 0, 1, 1},
            {0, 1, 0, 1, 1},
            {0, 0, 1, 1, 1}
    };

    @Test
    public void rotateMatrixTest01() {
        Assert.assertArrayEquals(ans1, RotateMatrix.rotateMatrix(param1));
    }
    @Test
    public void rotateMatrixTest02(){
        Assert.assertArrayEquals(ans2, RotateMatrix.rotateMatrix(param2));
    }
}
