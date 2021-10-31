package com.tweef.chapter01;

import org.junit.Assert;
import org.junit.Test;

public class ZeroMatrixTest {

    int[][] param1 = {
            { 1, 2, 3, 4, 5, 6},
            { 7, 8, 9,10,11,12},
            {13,14,15,16,17,18},
            {19,20,21,22,23,24},
            {25,26,27,28,29,30},
            {31,32,33,34,35,36}
    };
    int[][] ans1 = {
            { 1, 2, 3, 4, 5, 6},
            { 7, 8, 9,10,11,12},
            {13,14,15,16,17,18},
            {19,20,21,22,23,24},
            {25,26,27,28,29,30},
            {31,32,33,34,35,36}
    };
    int[][] param2 = {
            { 1, 2, 3, 4, 5, 6},
            { 7, 8, 9,10,11,12},
            {13, 0,15,16,17,18},
            {19,20,21,22,23,24},
            {25,26,27,28,29,30},
            {31,32,33,34,35,36}
    };
    int[][] ans2 = {
            { 1, 0, 3, 4, 5, 6},
            { 7, 0, 9,10,11,12},
            { 0, 0, 0, 0, 0, 0},
            {19, 0,21,22,23,24},
            {25, 0,27,28,29,30},
            {31, 0,33,34,35,36}
    };
    int[][] param3 = {
            { 0, 2, 3, 4, 5, 6},
            { 7, 8, 9,10,11,12},
            {13,14,15,16,17,18},
            {19,20,21,22,23,24},
            {25,26,27,28,29,30},
            {31,32,33,34,35, 0}
    };
    int[][] ans3 = {
            { 0, 0, 0, 0, 0, 0},
            { 0, 8, 9,10,11, 0},
            { 0,14,15,16,17, 0},
            { 0,20,21,22,23, 0},
            { 0,26,27,28,29, 0},
            { 0, 0, 0, 0, 0, 0}
    };
    int[][] param4 = {
            { 1, 2, 3 ,4},
            { 5, 0, 7, 8},
            { 9,10,11,12},
            {13, 0,15,16}
    };
    int[][] ans4 = {
            { 1, 0, 3 ,4},
            { 0, 0, 0, 0},
            { 9, 0,11,12},
            { 0, 0, 0, 0}
    };

    @Test
    public void rotateMatrixTest01() {
        Assert.assertArrayEquals(ans1, ZeroMatrix.zeroMatrix(param1));
    }
    @Test
    public void rotateMatrixTest02() {
        Assert.assertArrayEquals(ans2, ZeroMatrix.zeroMatrix(param2));
    }

    @Test
    public void rotateMatrixTest03() {
        Assert.assertArrayEquals(ans3, ZeroMatrix.zeroMatrix(param3));
    }
    @Test
    public void rotateMatrixTest04() {
        Assert.assertArrayEquals(ans4, ZeroMatrix.zeroMatrix(param4));
    }
}
