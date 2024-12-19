package DSA.two_pointer_problems;

public class ReverseAnArray {
    
    static void reverse(int[] arr){
        int left = 0;
        int right = arr.length-1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] a){
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"  ");
        }
        
        reverse(arr);
        System.out.println();
        
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"  ");
        }

    }
}
