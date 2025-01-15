package array_problems.matrixTraversal;

public class MatrixPrintSpiral {

    static void printSpiral(int[][] mat,int n){
        int RS = 0;
        int RE = n-1;
        int CS = 0;
        int CE = n-1;
        //int count = 0;

        while(RS<=RE && CS<=CE){
            for(int i=CS; i<= CE; i++){
                System.out.print(mat[RS][i]+"  ");
            }
            RS++;
            for(int i=RS; i<= RE; i++){
                System.out.print(mat[i][CE]+"  ");
            }
            CE--;
            for(int i=CE; i>=CS; i--){
                System.out.print(mat[RE][i]+"  ");
            }
            RE--;
            for(int i=RE; i>=RS; i--){
                System.out.print(mat[i][CS]+"  ");
            }
            CS++;
        }
    }

    public static void main(String[] args){
        int[][] mat5x5 = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25}
        };

        printSpiral(mat5x5,mat5x5.length);
    }
}
