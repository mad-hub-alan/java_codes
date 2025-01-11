package array_problems.matrix_rotation;
import java.util.Scanner;

public class Rotate2DArray {

    private int[][] mat = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };

    public Rotate2DArray(int n){
        this.mat = new int[n][n];
        
        int x = 0;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                this.mat[i][j] = ++x;
            }
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 'n' value :");
        int n = in.nextInt();
        in.close();
        Rotate2DArray matrix = new Rotate2DArray(n);
        matrix.rotate180Deg();
        matrix.printMatrix();

    }

    public void printMatrix(){
        for(int i=0; i<this.mat.length; i++){
            for(int j=0; j<this.mat[0].length; j++){
                System.out.print(this.mat[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void rotate90Deg(){
        //Swap elements through the main diagonal and above the upper right triangle
        // Reverse each columns
    }
    
    public void rotate180Deg(){
        //Reverse each Rows
        //Reverse each columns
    }
    
    public void rotate270Deg(){
        //Swap elements through the main diagonal and above the upper right triangle
        // Reverse each Rows
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