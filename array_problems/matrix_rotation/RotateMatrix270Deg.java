package array_problems.matrix_rotation;

import java.util.Scanner;

public class RotateMatrix270Deg {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 'n' value for(n x n) matrix :");
        int n = in.nextInt();
        in.close();

        int[][] mat = new int[n][n];

        int val = 1;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = val++;
            }
        }

        rotate270Deg(mat, n);
        printMatrix(mat, n);
    }

    public static void rotate270Deg(int[][] mat, int n){
        //Swap elements through the main diagonal and above the upper right triangle
        for(int row=0; row<n; row++){
            for(int col=row; col<n; col++){
                int temp = mat[row][col];
                mat[row][col] = mat[col][row];
                mat[col][row] = temp;
            }
        }
        // Reverse each rows
        for(int col=0; col<n; col++){
            int top =0, bottom = n-1;

            while(top<bottom){
                int temp = mat[top][col];
                mat[top][col] = mat[bottom][col];
                mat[bottom][col] = temp;
                top++; 
                bottom--;
            }
        }
    }

    public static void printMatrix(int[][] mat, int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}

/*
Problem Description
********************
You are given an n x n 2D matrix representing an image.

Rotate the image by 270 degrees (clockwise).

Note:

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.

DO NOT allocate another 2D matrix and do the rotation.

Input format
There are N+1 lines of input.

First line contains one integer N.

Next N line contains N space separated integers

Output format
Print the NxN rotated matrix.


Sample Input 1
3

1 2 3
4 5 6
7 8 9


Sample Output 1
3 6 9
2 5 8
1 4 7

*/
