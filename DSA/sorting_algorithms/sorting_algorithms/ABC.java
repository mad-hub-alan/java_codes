package sorting_algorithms;
import java.util.Arrays;

class ABC {
    public static void merge(int[] a, int beg, int mid, int end) {
        int p1=beg, p2=mid+1, i=0;
        int[] b = new int[end-beg+1];
        while(p1<=mid && p2<=end) {
            if (a[p1]<=a[p2]) {
                b[i++] = a[p1++];
            }
            else {
                b[i++] = a[p2++];
            }
        }
        while(p1<=mid) {
           b[i++] = a[p1++]; 
        }
        while(p2<=end) {
            b[i++] = a[p2++];
        }
        i=0;
        for (int j=beg; j<=end; j++) {
            a[j] = b[i++];
        }
    }
    public static void mergeSort(int[] a, int beg, int end) {
        System.out.println(String.format("Indices: (%s,%s), subarray=%s", beg, end, display(a, beg, end)));
        
        if (beg<end) { // more than 1 element
            // 1. Divide
            int mid = (beg+end)/2;
            mergeSort(a, beg, mid); // (beg, mid)
            mergeSort(a, mid+1, end); // (mid+1, end)
            
            // 2. Conquer
            merge(a, beg, mid, end);
        }
        
        System.out.println(String.format("After merge: subarray=%s", display(a, beg, end)));
    }
    
    public static String display(int[] a, int beg, int end) {
        String s = "[";
        for (int i=beg; i<=end; i++) {
            s += a[i]+", ";
        }
        return s+"]";
    }
    public static void main(String[] args) {
        int[] a = new int[] {3,1,2};
        System.out.println("Original Array: "+Arrays.toString(a));
        int n = a.length;
        mergeSort(a, 0, n-1);
        System.out.println("Sorted Array: "+Arrays.toString(a));
    }
}
