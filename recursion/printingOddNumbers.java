package recursion;

public class printingOddNumbers {
    
    private static void printOdd(int n){
        if(n == -1){
            return;
        }
        printOdd(n - 2);
        System.out.println(n);
    }

    public static void main(String[] args){
        printOdd(99);
    }
}
