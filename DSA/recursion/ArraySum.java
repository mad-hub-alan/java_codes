package DSA.recursion;

public class ArraySum {

    static int arraySum(int[] arr, int n){
        if(n==1){
            return arr[0];
        }
        return arr[n-1]+arraySum(arr, n-1);
    }
    public static void main(String[] a){
        int[] x = {8,6,9,7,4,2,1,3,10,5};
        System.out.println(arraySum(x,x.length));
    }
}
