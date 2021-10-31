package com.tweef.chapter01;

import java.util.Arrays;

public class RotateMatrix {

    public static int[][] rotateMatrix(int matrix[][]){
        int longitud = matrix.length;
        int matriz[][] = new int[longitud][longitud];
        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j < longitud; j++) {
                matriz[i][j] = 0;
            }
        }

        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j < longitud; j++) {
                matriz[i][j] = matrix[j][longitud - i - 1];
            }
        }
        return matriz;
    }


}
