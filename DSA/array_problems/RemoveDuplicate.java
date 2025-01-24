package DSA.array_problems;

public class RemoveDuplicate {

    public static void main(String[] args){
        int[] arr = {1,1,2,3,3,4,5,6,6,6,7,8,8,8,8,8,8,9,10,10};
        System.out.println(arr.length);
        int count = remove(arr);
        System.out.println(count);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
    }
    static int remove(int[] arr){
        int count = arr.length;
        int n = arr.length;
        // run a loop over arr to point left
            // run a loop over arr from j=i+1 to arr.length-1
                // if i==j 
                    // shift next to curr
                // make last ele -1
                // count--

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    for(int k=j; k<n-1; k++){
                        arr[k] = arr[k+1];
                    }
                    arr[n-1] = -1;
                    count--;
                }
            }
        }
        return count;
    }
}
