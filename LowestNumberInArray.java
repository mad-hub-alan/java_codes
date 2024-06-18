public class LowestNumberInArray {
    static int smallestValueInArray(int[] numbers) {

        int min = numbers[0];

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]<min){
                min = numbers[i];
            }
        }
        return min;
    }

    public static void main(String args[]) {
        assert (1 == smallestValueInArray(new int[] { 4, 2, 3, 1, 5 })) : "Expect 1 for numbers = [4, 2, 3, 1, 5] ";
        assert (2 == smallestValueInArray(new int[] { 4, 2, 3, 5 })) : "Expect 2 for numbers = [4, 2, 3, 5] ";
        System.out.println("All test cases in main function passed");

        System.out.println(smallestValueInArray(new int[]{5,4,8,1,3,9,6,2,7}));

    }
}
