package DSA.recursion;

public class countdown {
    
    private static void countdown(int n){
        if(n == -1){
            return;
        }
        System.out.print(" \n"+ n +" ");
        countdown(n -1);
    }

    public static void main(String[] args){
        countdown(100);
    }
}
