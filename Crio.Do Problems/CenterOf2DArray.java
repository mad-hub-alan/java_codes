public class CenterOf2DArray {
    public static Integer matrixCenter(int[][] matrix){

        int row = matrix.length;
        int col = matrix[0].length;

        if(row%2==0 || col%2==0){
            return null;
        }

        int rowCent = row/2;
        int colCent = col/2;

        return matrix[rowCent][colCent];

    }


    public static void main(String[] args){

        assert (matrixCenter(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7,   8, 9 } }) == 5) : "Expect 5 from { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }";

        System.out.println("All test cases in main function passed");

        int mat1[][] = new int[][] {{4,2,7,5},{7,1,6,5},{5,6,4,7},{8,3,1,2}};   // 4x4 array
        int mat2[][] = {{9,3,5,2,4},{1,2,5,9,7},{4,5,4,7,9}};   // 5x3 array
        int mat3[][] = new int [3][3];  // No Array Initialization

        System.out.println(matrixCenter(mat1));
        System.out.println(matrixCenter(mat2));
        System.out.println(matrixCenter(mat3));

    }
}
