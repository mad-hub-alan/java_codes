package Rough;
import java.util.Arrays;
import java.lang.StringBuilder;

public class QS {
    public static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static int partition(int[] arr, int beg, int end){
        int pivot = end, low = beg, high = pivot-1;

        while(low <= high){
            if(arr[low] < arr[pivot]){
                low++;
            }else{
                swap(arr,low,high);
                high--;
            }
        }
        swap(arr,low,pivot);

        return low;
    }

    public static String display(int[] arr, int beg, int end){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i=beg; i<=end; i++){
            if(i==end) sb.append(arr[i]);
            else sb.append(arr[i]+",");
        }
        sb.append("]");
        return sb.toString();
    }

    public static void quickSort(int[] arr, int beg, int end){
        System.out.println(String.format("Indices (%s,%s) - SubArray %s",beg,end,display(arr,beg,end)));
        if(beg<end){
            int p = partition(arr,beg,end);
            System.out.println(String.format("--partition index : %s(val:%s)",p,arr[p]));
            System.out.println("Array After Partitioning : "+Arrays.toString(arr));
            quickSort(arr,beg,p-1);
            quickSort(arr,p+1,end);
        }
        System.out.println(String.format("SubArray after sorting %s",display(arr,beg,end)));
    }


    public static void main(String[] args){
        int[] arr = new int[] {10,2,6,4,8};
        int n = arr.length;

        System.out.println("Original Array : "+Arrays.toString(arr));
        quickSort(arr,0,n-1);
        System.out.println("Sorted Array : "+Arrays.toString(arr));
    }
}
