package crio_problems;

public class MatrixDiagonalSum {

    public static int diagonalSumII(int[][] mat){

        int sum = 0;
        int n = mat.length;
        for(int i=0; i<n; i++){
                sum = sum + mat[i][i] + mat[i][n-i-1];
        }
        if(n%2==1){
            sum = sum - mat[n/2][n/2];
        }

        return sum;
    }




    public static void main(String[] args){

        int[][]mat = {{1,2,3},{4,5,6},{7,8,9}};

        assert (diagonalSumII(mat) == 25) : "Expect 25 for mat = {{1,2,3},{4,5,6},{7,8,9}}";

        System.out.println("All test cases in main function passed");

        System.out.println(diagonalSumII(mat));

    }
}
