package com.company;

public class ThreadingTask implements Runnable {
    private int matrix1[][];
    private int matrix2[][];
    private int matrix3[][];
    private int row;
    private int column;
    private int mat1Col;

    ThreadingTask(int mat1[][], int mat2[][], int mat3[][], int row, int col, int mat1Col) {
        this.matrix1 = mat1;
        this.matrix2 = mat2;
        this.matrix3 = mat3;
        this.row = row;
        this.column = col;
        this.mat1Col = mat1Col;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    for (int k = 0; k < mat1Col; k++) {
                        System.out.printf(
                                "i: %d, j: %d, k: %d, " +
                                        "matrix1[i][j]: %d," +
                                        "matrix2[k][j]: %d," +
                                        "matrix3[i][j]: %d\n", i, j, k, matrix1[i][k], matrix2[k][j], matrix3[i][j]);
                        matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
