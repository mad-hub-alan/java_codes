package DSA.binary_search_problems;
import java.util.Scanner;
import java.util.Arrays;


public class BinarySearchAlgo {
    public static int binarySearch(int[] arr, int n, int x){
        int beg = 0, end = n-1;
        while(beg <= end){
            int mid = (beg+end)/2;
            if(arr[mid] == x) return mid;
            else if(arr[mid] < x) beg = mid+1;
            else end = mid-1;
        }
        return -1;
    }

    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the Target to be searched :");
        int x = sc.nextInt();

        sc.close();

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        
        if(binarySearch(arr,n,x)==-1){
            System.out.println(String.format("'%s' doesn't exist in the given Array !",x));
        }else{
            System.out.println(String.format("'%s' occured in the index of '%s'",x,binarySearch(arr,n,x)));
        }
    }
}
