package DSA.recursion;

public class printingNumbers {

    private static void print(int i){
        if(i == 100){   
            return;         // Termination Condition
        }
        System.out.print(" "+i+" ");
        print(i + 1);   // recursive statement
    }



    public static void main(String[] args){

        print(0);

    }
}
