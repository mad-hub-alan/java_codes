package Rough;
import java.util.Arrays;

public class xyz {
    public static void main(String[] args) {
        int[] a = new int[] {9,2,5,6,3,4,7,1,8};
        System.out.println("Array 'a': "+Arrays.toString(a));
        
        Arrays.sort(a);

        int[] b = new int[a.length];
        int j=0;
        for(int i=0; i<a.length; i++,j++) {
            b[i] = a[j];
        }

        System.out.println("Array 'b': "+Arrays.toString(b));
    }   
}
