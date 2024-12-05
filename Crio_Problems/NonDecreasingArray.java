package crio_problems;

public class NonDecreasingArray {
    static Boolean nonDecreasingArray(int[] arr) {


        for(int i=1; i<arr.length; i++){

            int temp = arr[i-1];

            if(arr[i]<temp){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {

        assert (nonDecreasingArray(new int[] { 1, 2, 3 })) : "Expect true for array = {1, 2, 3}";
        System.out.println("All test cases in main function passed");

        System.out.println(nonDecreasingArray(new int[] {1,5,8,7}));
    }
}
