package DSA.searching_algorithms;

public class BinarySearchReverse {
    
    static int binarySearchReverse(int[] a, int n, int X){
        int left = 0;
        int right = n-1;

        while(left <= right){
            int mid = (left+right)/2;

            if(a[mid] == X)
                return mid;
            else if(a[mid] < X)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }


    public static void main(String[] args){
        int[] arr = {999,666,444,258,167,100,99,58,44,21,4};
        
        int n = arr.length;

        int target = 444;

        System.out.println(binarySearchReverse(arr,n,target));

    }
}
