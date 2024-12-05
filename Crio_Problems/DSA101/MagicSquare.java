package crio_problems.DSA101;

import java.util.*;

class CheckMagicSquare {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int grid[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        }

        String result = checkMagicSquare(n, grid);

        System.out.println(result);

    }

    static int findRowSum(int[][] grid, int n, int row){
        int sum = 0;

        for(int col=0; col<n; col++)
            sum = sum + grid[row][col];

        return sum;
    }

    static int findColSum(int[][] grid, int n, int col){
        int sum = 0;

        for(int row = 0; row<n; row++)
            sum = sum + grid[row][col];

        return sum;
    }

    static int findMainDiaSum(int[][] grid, int n){
        int sum = 0, row =0, col =0;

        while(row<n){
            sum = sum + grid[row][col];
            row++;
            col++;
        }
        return sum;
    }

    static int findSecDiaSum(int[][] grid, int n){
        int sum = 0, row = 0, col = n-1;

        while(row<n){
            sum = sum + grid[row][col];
            row++;
            col--;
        }
        return sum;
    }

    static String checkMagicSquare(int n, int[][] grid) {
       
       int sum = findMainDiaSum(grid,n);

        for(int i=0; i<n; i++){
            if(findRowSum(grid,n,i) != sum)
                return "No";
            
            if(findColSum(grid,n,i) != sum)
                return "No";
        }

        if(findSecDiaSum(grid,n) != sum)
            return "No";

        return "Yes";
    }
}


/*
 
Problem Description
Given a matrix of dimensions n x n having elements 1 to n*n distinct elements, check whether the matrix is magic square or not.

Magic square is a square that has the same sum along all rows, columns and diagonals.

Input format
There are n + 1 lines of input.

First line contains integer n.

The next n lines contain n space separated elements.

Output format
Print "Yes" if it is a magic square , "No" otherwise.

Sample Input 1
3

4 9 2

3 5 7

8 1 6

Sample Output 1
Yes

Explanation 1
All rows, columns and diagonals have sum 15.

Constraints
1 <= n <= 100

1 <= element of matrix <= n x n

 */

 
/* 
Crio Methodology

Milestone 1: Understand the problem clearly
1. Ask questions & clarify the problem statement clearly.
2. Take an example or two to confirm your understanding of the input/output

Milestone 2: Finalize approach & execution plan
1. Understand what type of problem you are solving and see if you can recollect solving similar problems in the past
      a. Obvious logic (this would only test ability to convert logic to code)
      b. Figuring out logic
      c. Knowledge of specific algorithm, data structure or pattern
      d. Knowledge of specific domain or concepts
      e. Mapping real world into abstract concepts/data structures
2. Brainstorm multiple ways to solve the problem and pick one based on the TC/SC requirements
3. Get to a point where you can explain your approach to a 10 year old

Milestone 3 : Come up with an Instruction Manual for a 10 year old
1. Take a stab at the high-level logic & write it down like a detailed Instruction Manual for a 10 Year old where each line of the manual can be expanded into a logical line(s) of code.
2. Try to offload logic out of the main section as much as possible by delegating to functions.

Milestone 4: Code by expanding your 10 Year Olds "Instruction Manual
1. Run your code snippets at every logical step to test correctness (Helps avoid debugging larger pieces of code later)
2. Make sure you name the variables, functions clearly.
3. Use libraries as much as possible

Milestone 5: Prove that your code works using custom test cases
1. Make sure you check boundary conditions and other test cases you noted in Milestone 1
      a. If compiler is not available, dry run your code on a whiteboard or paper
2. Suggest optimizations if applicable during interviews
*/