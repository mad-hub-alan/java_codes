package DSA.sorting_algorithms;

import java.util.Arrays;

public class CountSort {
    static void countSort(int[] a){
        int n = a.length;
        int x = 0;
        for(int i=0; i<n; i++){
            x = Math.max(x,a[i]);
        }

        int[] count = new int[x+1];

        for(int i=0; i<a.length; i++){
            count[a[i]]++;
        }
         int q =0;
        for(int i=0; i<count.length; i++){
            for(int j=0; j<count[i]; j++){
                a[q++] = i; 
            }
        }
    }
    public static void main(String[] args){
        int[] a = new int[] {3,1,2,4,6,7,3};
        System.out.println("Original Array: "+java.util.Arrays.toString(a));
        countSort(a);
        System.out.println("Sorted Array: "+java.util.Arrays.toString(a));
    }
}
