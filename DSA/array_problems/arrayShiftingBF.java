package DSA.array_problems;
import java.util.Scanner;

public class arrayShiftingBF {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);    //CREATING SCANNER OBJECT

        // USER INPUT BEGINS

        System.out.println("Enter the No.Of Array Elements :");
        int n = in.nextInt();
        int[] arr = new int[n]; //NO.OF ELEMENTS

        System.out.println("Enter Array Elements one by one :");
        for(int idx=0; idx<n; idx++){
            arr[idx] = in.nextInt();    // POPULATING THE ARRAY
        }

        System.out.println("Array Created Successfully !"+"\n\n Now Enter How much time the Array should rotate :");
        int t = in.nextInt();   //NO.OF.ROTATIONS

        in.close(); // KILLING THE SCANNER OBJECT

        // USER INPUT ENDS

        int[] retArr = shift(arr,n,t); //STORE THE RETURNED ARRRAY

        // PRINTING THE RETURED ARRAY
        int i = 0;
        while(i<retArr.length){
            System.out.print(retArr[i]+"\t");
            i+=1;
        }
    }

    private static int[] shift(int[] arr,int n,int t){
        
        for(int a=1; a<=t; a++){
        
            int temp = arr[n-1];
            for(int i=0; i<n-1; i++){
            arr[n-1-i] = arr[n-2-i];
            }
            arr[0] = temp;
        }
        return arr;
    }
}
