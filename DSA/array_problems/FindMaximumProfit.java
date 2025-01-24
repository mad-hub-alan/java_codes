package DSA.array_problems;

public class FindMaximumProfit {
    
    static int findMaxProfit(int[] arr){
        int profit = 0;
        int curr_prof = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i] > arr[i-1]){
                curr_prof = arr[i] - arr[i-1];
            }
        }

        return profit;
    }
    
    
    public static void main(String[] args){
        int[] arr = {5,6,12,7,3,8,9,1,7,2,15,4,8};

        System.out.println(findMaxProfit(arr));
    }
}
