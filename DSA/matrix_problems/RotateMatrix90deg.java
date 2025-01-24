public class RotateMatrix90deg{

    static int[][] rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        int[][] mat = new int[n][n];

        int col = n-1;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[j][col] = matrix[i][j];
            }
            col--;
        }

        return mat;
    }
    public static void main(String[] arr){
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int[][] res = rotateMatrix(matrix);

        for(int i=0; i<res.length; i++){
            for(int j=0; j<res.length; j++){
                System.out.print(res[i][j]);
            }
            System.out.println();
        }
    }
}