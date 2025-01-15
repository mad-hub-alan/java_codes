package array_problems.matrixTraversal;

import java.util.Scanner;

public class CreateSpiralMatrix {

    public static int[][] createSpiral(int n){
        int[][] mat = new int[n][n];

        int RS = 0, CS = 0;
        int RE = n-1, CE = n-1;
        int count = 1;
        
        while(count<=n*n){
            for(int col=CS; col<=CE; col++){
                mat[RS][col] = count++;
            }
            RS++;
            for(int row=RS; row<=RE; row++){
                mat[row][CE] = count++;
            }
            CE--;
            for(int col=CE; col>=CS; col--){
                mat[RE][col] = count++;
            }
            RE--;
            for(int row=RE; row>=RS; row--){
                mat[row][CS] = count++;
            }
            CS++;
        }

        return mat;
    }

    public static void main(String[] a){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 'n' value :");
        int n = in.nextInt();
        in.close();
        
        int[][] mat = createSpiral(n);

        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println();
        }
    }
    
}

/*

Problem Description
Given an integer A, generate a square matrix filled with elements from 1 to A*A in spiral order. The spiral order will be clockwise in nature starting from (0,0)

Input format
One line of input, containing a single integer A.

Output format
Print a 2-d matrix of size A x A satisfying the spiral order.

Sample Input 1
3

Sample Output 1
1 2 3
8 9 4
7 6 5

Explanation
As you can see the matrix goes spirally with each next position incremented by one.

Constraints
1<=A<=1000

*/
