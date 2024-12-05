package crio_problems;

public class MatrixTSum {
    static int matrixTSum(int n, int[][] matrix) {

        if(n%2==0){
            return -1;
        }

        int sum = 0;

        for(int i=0; i<1; i++) {
            for (int j = 0; j < n; j++) {
                sum = sum + matrix[i][j];
            }
        }
        for(int i=1; i<n; i++){
               sum = sum + matrix[i][n/2];
        }

        return sum;
    }

    public static void main(String args[]) {
        int n = 3;
        int[][]matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int m = 5;
        int [][] mat5 = {{1,1,1,1,1},{0,0,1,0,0},{0,0,1,0,0},{0,0,1,0,0},{0,0,1,0,0}};
        int x = 3;
        int[][] mat0 = {{0,0,0},{0,0,0},{0,0,0}};
        assert (matrixTSum(n,matrix) == 19) : "Expect 19 for matrix = {{1,2,3},{4,5,6},{7,8,9}}";
        System.out.println("All test cases in main function passed");
        System.out.println(matrixTSum(n,matrix));
        System.out.println(matrixTSum(m,mat5));
        System.out.println(matrixTSum(x,mat0));
    }
}
