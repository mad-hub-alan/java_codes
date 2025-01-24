package Rough;

import java.util.Arrays;

public class MS {
    
    public static void mergeSort(int[] arr, int beg, int end){
        if(beg < end){        
        int mid = (beg+end)/2;

        mergeSort(arr, beg, mid);
        mergeSort(arr,mid+1,end);
        
        merge(arr,beg,mid,end);
        }
    }

    public static void merge(int[] arr, int beg, int mid, int end){
        int x = beg, y = mid+1, idx = 0;
        int[] temp = new int[end-beg+1];
        
        while(x <= mid && y <= end){
            if(arr[x] <= arr[y]){
                temp[idx++] = arr[x++];
            }else{
                temp[idx++] = arr[y++];
            }
        }
        while(x <= mid){
            temp[idx++] = arr[x++];
        }
        while(y <= end){
            temp[idx++] = arr[y++];
        }

        int id = 0;

        for(int i=beg; i<=end; i++){
            arr[i] = temp[id++];
        }
    }


    public static void main(String[] args){
        int[] arr = new int[] {8,2,6,4,9,3,7,1,0,5};
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        mergeSort(arr,0,n-1);
        // Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
