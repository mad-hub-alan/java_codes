public class FindTargetInArray {
    public static int findElement(int N,int[] arr,int X){
        for(int i=0; i<N; i++){
            if(X==arr[i]){
                return i;
            }
        }
        return -1;
    }



    public static void main(String[] args){

        int[]arr = {1,3,4,2,1};

        assert (findElement(5,arr,1) == 0) : "Expect 0 for n = 5, x = 1 and arr = [1,3,4,2,1]";

        System.out.println("All test cases in main function passed");

        System.out.println(findElement(10,new int[] {1,2,3,4,5,6,7,8,9,10},4));

    }
}
