package DSA.array_problems;

public class PrefixSumArray {

    static int[] prefixSum(int[] arr, int n){
       int[] prefix = new int[n];

       prefix[0] = arr[0];

       for(int i=1; i<n; i++){
            prefix[i] = arr[i] + prefix[i-1];
       }
       return prefix;
    }

    public static void main(String[] a){
        int[] arr = {3,5,6,7,3,1,4,5,8,9,6,3,7,9,4};

        int[] prefix = prefixSum(arr,arr.length);

        System.out.print("[");  //output enhancement
        for(int i=0; i<prefix.length; i++){
            System.out.print(prefix[i]);
            if(i>=0 && i<prefix.length-1) System.out.print(',');    //output enhancement
        }
        System.out.print("]");  //output enhancement


    }
    
}
