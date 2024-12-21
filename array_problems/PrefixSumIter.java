package array_problems;

public class PrefixSumIter {

    static int prefix(int[] arr,int idx){
        int sum = 0;
        for(int i=0; i<=idx; i++){
            sum += arr[i];
        }
        return sum;
    }


    public static void main(String[] a){
        int[] arr = {3,5,6,7,3,1,4,5,8,9,6,3,7,9,4};

        System.out.println(prefix(arr,0));
    }
    
}
