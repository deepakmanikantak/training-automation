package com.trainee.phani;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix:");
        try {
            int size = sc.nextInt();
            int primarysum = 0;
            int secoundarysum = 0;
            int[][] matrix = new int[size][size];
            System.out.println("enter the elemnts in matrix");

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (i == j) {
                        primarysum = primarysum + matrix[i][j];
                    }
                    if ((i + j) == (size - 1))
                        secoundarysum = secoundarysum + matrix[i][j];
                }
            }
            System.out.println("Left Diagonal Sum= " + primarysum);
            System.out.println("Right Diagonal Sum= " + secoundarysum);
            int diffrence = primarysum - secoundarysum;
            System.out.println("differnce of two diagonals are: " + diffrence);
        }catch(InputMismatchException ime){
            System.out.println("please enter valid input");
        }
    }
}
