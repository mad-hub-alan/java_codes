package array_problems.matrixTraversal;

public class MatrixTraversal {
    
    private int[][] mat = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };

    public void rowTraversal(){
        for(int row=0; row<mat.length; row++){
            for(int col=0; col<mat[row].length; col++){
                System.out.print(mat[row][col]+"\t");
            }
        }
    }

    public void colTraversal(){
        for(int col=0; col<mat[0].length; col++){
            for(int row=0; row<mat.length; row++){
                System.out.print(mat[row][col]+"\t");
            }
        }
    }



    public static void main(String[] args){
        MatrixTraversal matrix = new MatrixTraversal();
        matrix.rowTraversal();
        System.out.println();
        matrix.colTraversal();
    }
}
