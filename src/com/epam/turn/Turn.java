package com.epam.turn;


import java.util.Scanner;

public class Turn {
    public static void main(String[] args) {
        System.out.println("Input dimension of matrix");
        Scanner input_console = new Scanner(System.in);
        System.out.print("Input first parameter: ");
        int n = input_console.nextInt();
        System.out.print("Input second parameter: ");
        int m = input_console.nextInt();

        int[][] nMatrix = new int[n][m];
        int[][] tMatrix = new int[m][n];

        for (int i = 0; i < nMatrix.length; i++)
        {
            for (int j=0;j < nMatrix[i].length;j++)
            {
                nMatrix[i][j] = (int)(Math.random()*100);
                System.out.print(nMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < tMatrix.length; i++)
        {
            for (int j=0;j < tMatrix[i].length;j++)
            {

                tMatrix[i][j] = nMatrix[tMatrix[i].length - 1 - j][i];
                System.out.print(tMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
