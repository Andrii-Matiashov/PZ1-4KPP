package org.example.pz1;

import java.util.Random;
import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter N: ");
            int n = scanner.nextInt();
            int[][] arr = createArray(n);
            printMatrix(arr);

            boolean flag = false;

            for (int i = 0; i < arr.length; i++) {
                int sumInCols = 0;
                int sumInRows = 0;
                for (int j = 0; j < arr.length; j++) {
                    sumInRows += arr[i][j];
                    sumInCols += arr[j][i];
                }
                if (sumInRows < sumInCols) {
                    flag = true;
                    sortMatrix(arr);
                    break;
                }
            }
            if (!flag) {
                mirrorMatrix(arr);
            }
            System.out.println("================================================");
            printMatrix(arr);
        } catch (Exception e) {
            System.err.println(e);
            e.printStackTrace();
        }
    }

    public static void mirrorMatrix(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                if (i + j < n - 1) {
                    int t = arr[i][j];
                    arr[i][j] = arr[n - 1 - j][n - 1 - i];
                    arr[n - 1 - j][n - 1 - i] = t;
                } else {
                    break;
                }
            }
        }
    }

    public static void sortMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr.length; ++k) {
                    for (int l = 0; l < arr[i].length; ++l) {
                        if (arr[i][j] < arr[k][l]) {
                            int t = arr[i][j];
                            arr[i][j] = arr[k][l];
                            arr[k][l] = t;
                        }
                    }
                }
            }
        }
    }

    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public static int[][] createArray(int size) {
        Random random = new Random();
        int[][] arr = new int[size + 15][size + 15];
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                arr[i][j] = random.nextInt(2 * size + 31) - size - 15;
            }
        }
        return arr;
    }
}
