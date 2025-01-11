package array_problems.matrix_rotation;

import java.util.Scanner;

public class RotateMatrix90Deg {
    

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

        rotate90Deg(mat, n);
        printMatrix(mat, n);
    }

    public static void rotate90Deg(int[][] mat, int n){
        //Swap elements through the main diagonal and above the upper right triangle
        for(int row=0; row<n; row++){
            for(int col=row; col<n; col++){
                int temp = mat[row][col];
                mat[row][col] = mat[col][row];
                mat[col][row] = temp;
            }
        }
        // Reverse each columns
        for(int row=0; row<n; row++){
            int left =0, right = n-1;

            while(left<right){
                int temp = mat[row][left];
                mat[row][left] = mat[row][right];
                mat[row][right] = temp;
                left++; 
                right--;
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

Rotate the image by 90 degrees (clockwise).

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
7 4 1

8 5 2

9 6 3

*/
