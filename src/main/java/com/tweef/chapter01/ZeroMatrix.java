package com.tweef.chapter01;

import java.util.ArrayList;
import java.util.List;

public class ZeroMatrix {
    public static void printMatrix(int zeroMatrix[][]){
        int num_columns = zeroMatrix[0].length;
        int num_rows = zeroMatrix.length;
        for (int i = 0; i < num_rows; i++) {
            for (int j = 0; j < num_columns; j++) {
                System.out.print(zeroMatrix[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] zeroMatrix(int zeroMatrix[][]){
        int num_columns = zeroMatrix[0].length;
        int num_rows = zeroMatrix.length;
        List<Integer[]> info_matrix = new ArrayList<>();
        for (int i = 0; i < num_rows; i++) {
            for (int j = 0; j < num_columns; j++) {
                if (zeroMatrix[i][j] == 0){
                    zeroMatrix[i][0] = 0;
                    zeroMatrix[0][j] = 0;
                }
            }
        }
        printMatrix(zeroMatrix);
        for (int i = num_columns-1; i > 0; i--) {
            if (zeroMatrix[0][i] == 0){
                for (int j = 0; j < num_rows; j++) {
                    zeroMatrix[j][i] = 0;
                }
            }
        }
        for (int i = num_rows - 1; i > 0; i--) {
            if (zeroMatrix[i][0] == 0){
                for (int j = 0; j < num_columns; j++) {
                    zeroMatrix[i][j] = 0;
                }
            }
        }
        if (zeroMatrix[0][0] == 0){
            for (int j = 0; j < num_columns; j++) {
                zeroMatrix[0][j] = 0;
            }
            for (int j = 0; j < num_rows; j++) {
                zeroMatrix[j][0] = 0;
            }
        }
        /*for (Integer[] element: info_matrix) {
            for (int i = 0; i < num_rows; i++) {
                zeroMatrix[i][element[1]] = 0;
            }
            for (int i = 0; i < num_columns; i++) {
                zeroMatrix[element[0]][i] = 0;
            }
        }*/
        printMatrix(zeroMatrix);
        return zeroMatrix;
    }

}
