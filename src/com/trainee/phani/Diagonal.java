package com.trainee.phani;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
//program to difference b/w left diagonal and right diagonal
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
                    if (i == j) {    //to identify the left diagonal sum
                        primarysum = primarysum + matrix[i][j];
                    }
                    if ((i + j) == (size - 1)) //to identify the right diagonal sum
                        secoundarysum = secoundarysum + matrix[i][j];
                }
            }
            System.out.println("Left Diagonal Sum= " + primarysum);
            System.out.println("Right Diagonal Sum= " + secoundarysum);
            int diffrence = primarysum - secoundarysum;//to get the differnce
            System.out.println("differnce of two diagonals are: " +Math.abs(diffrence));
        }catch(InputMismatchException IME){
            System.out.println("Please enter valid input");
        }
    }
}
