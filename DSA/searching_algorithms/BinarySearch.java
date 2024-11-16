package DSA.searching_algorithms;

public class BinarySearch {
    
    static int searchTargetBS(int[] arr, int n, int X){
        // initialize two pointers left and right
        int left = 0;
        int right = n-1;
        // iterate over the array while left<=right
        while(left <= right){
            // initialize a mid pointer
            int mid = (left+right)/2;
            // if array[mid] is equal to target
            if(arr[mid] == X)
                // return the mid index
                return mid;
            // else if array[mid] value is greater than target
            else if(arr[mid] > X)
                // update right to mid-1 (terminate the right side of the array)
                right = mid - 1;
            // else  (only possible array[mid] < target)
            else
                // update left to mid+1 (termination of the right side of the array)
                left = mid + 1;
        }
        // return -1; (element no exist)
        return -1;
    }           


    public static void main(String[] args){

        int[] arr = {2,4,6,8,10,12,14,16,18,20};

        int n = arr.length;

        int target = 8;

        System.out.println(searchTargetBS(arr,n,target));
    }
}
