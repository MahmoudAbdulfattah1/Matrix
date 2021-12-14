package com.company;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int x1, y1, x2, y2;
        x1 = input.nextInt();
        y1 = input.nextInt();
        x2 = input.nextInt();
        y2 = input.nextInt();
        if(checkMat(y1,x2)) {
            int mat[][] = setMat(x1, y1);
            int mat2[][] = setMat(x2, y2);
            int mat3[][]=multipleMat(mat,mat2,x1,y2,y1);
            displayMat(mat3,x1,y2);
        }
        else{
            System.out.println("Not valid!");
        }

    }

    public static int[][] setMat(int x, int y) {
        int mat[][] = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                mat[i][j] = input.nextInt();

            }

        }
        return mat;

    }
    public static boolean checkMat(int y1,int x2){
        if(x2!=y1)return false;
        else return true;

    }
    public static int[][] multipleMat(int mat1[][],int mat2[][],int x1,int y2,int y1){
        int mat[][]=new int[x1][y2];
        for (int i = 0; i < x1; i++) {
            for (int j = 0; j <y2 ; j++) {
                for (int k = 0; k <y1 ; k++) {
                    mat[i][j]+=mat1[i][k]*mat2[k][j];
                }
            }

        }
        return mat;
    }
    public static void displayMat(int mat[][],int x,int y){
        for (int i = 0; i <x ; i++) {
            for (int j = 0; j <y ; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }



}
