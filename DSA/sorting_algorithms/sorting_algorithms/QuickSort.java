package sorting_algorithms;
import java.util.Arrays;

public class QuickSort{
    public static void swap(int[] a, int p1, int p2) {
        int temp = a[p1];
        a[p1] = a[p2];
        a[p2] = temp;
    }

    public static int partition(int[] a, int beg, int end) {
        int pivot=end, low=beg, high=end-1;
        while(low<=high) {
            if (a[low]<a[pivot]) {
                low++;
            }
            else {
                swap(a, low, high);
                high--;
            }
        }
        swap(a, low, pivot);
        return low;
    }

    public static void quickSort(int[] a, int beg, int end) {
        if (beg<end) { // when array size > 1
            int p = partition(a, beg, end);
            quickSort(a, beg, p-1);
            quickSort(a, p+1, end);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[] {1,8,2,3,5,4};
        int n = a.length;
        quickSort(a, 0, n-1);
        System.out.println("Sorted Array: "+Arrays.toString(a));
    }
}