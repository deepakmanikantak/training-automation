package com.trainee.phani;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
program to difference b/w left diagonal and right diagonal of a matrix using scanner
 **/
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
                    //to identify the left diagonal sum matrix indexes values [0,0][1,1][2,2]
                    if (i == j) {
                        primarysum = primarysum + matrix[i][j];
                    }
                    //to identify the right diagonal sum for matrix indexes values [0,2][1,1][2,0]
                    if ((i + j) == (size - 1)) {
                        secoundarysum = secoundarysum + matrix[i][j];
                }
                }
            }
            System.out.println("Left Diagonal Sum= " + primarysum);
            System.out.println("Right Diagonal Sum= " + secoundarysum);
            //to get the differnce b/w primary diagonal(left) and secoundary diagonal(right)
            int diffrence = primarysum - secoundarysum;
            //Math.abs is used to get the absolute difference
            System.out.println("differnce of two diagonals are: " +Math.abs(diffrence));
        }catch(InputMismatchException IME){
            System.out.println("Please enter valid input");
        }
    }
}
