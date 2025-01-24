package DSA.recursion;

public class ArrayPrefixSumREC {

    static int prefixSum(int[] arr, int x){
        if(x==0){
            return arr[0];
        }
        return arr[x]+prefixSum(arr, x-1);
    }

    public static void main(String[] args){
        int[] arr = {3,5,6,1,8,10,4,0,2,9};
        System.out.println(prefixSum(arr,5));
    }
    
}
