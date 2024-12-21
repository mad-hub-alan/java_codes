package array_problems;

public class SuffixSumIter {

    static int suffix(int[] arr, int idx){
        int sum = 0;

        for(int i=arr.length-1; i>=idx; i--){
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] a){
        int[] arr = {3,5,6,7,3,1,4,5,8,9,6,3,7,9,4};

        System.out.println(suffix(arr,13));
    }
    
}
