package DSA.binary_search_problems;
import java.util.Scanner;

public class FindLastZero {
    
    public static int findLastZero(int[] arr, int n){
        int beg = 0, end = n-1;

        while(beg <= end){
            int mid = (beg+end)/2;
            if(arr[mid]==0){
                if(mid==n-1) return mid;
                if(arr[mid+1]==1) return mid;
                else beg = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        sc.close();
        
        if(findLastZero(arr, n)==-1){
            System.out.println("There is no zeroes in the given Array !");
        }else{
            System.out.println("Last Zero Occured at the index of : "+findLastZero(arr, n));
        }
    }
}
