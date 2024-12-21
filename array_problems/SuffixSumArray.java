package array_problems;

public class SuffixSumArray {

    static int[] suffixSum(int[] arr, int n){
        int[] suffix = new int[n];

        suffix[n-1] = arr[n-1];

        for(int i=n-2; i>=0; i--){
            suffix[i] = arr[i] + suffix[i+1];
        }
        return suffix;
    }

    public static void main(String[] a){
        int[] arr = {3,5,6,7,3,1,4,5,8,9,6,3,7,9,4};

        int[] suffix = suffixSum(arr,arr.length);

        for(int i=0; i<suffix.length; i++){
            System.out.print(suffix[i]+"  ");
        }
    }
    
}
