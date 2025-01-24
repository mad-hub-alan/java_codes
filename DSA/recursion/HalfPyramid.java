package DSA.recursion;

public class HalfPyramid {
    
    private static void halfPyramid(int p){
        if(p == 0){
            return;
        }
        String s = "";
       
        for(int i=0; i<p; i++){
        System.out.print("*");
       }

       System.out.println(s);
       halfPyramid(p - 1);
    }

    public static void main(String[] args){
        halfPyramid(10);
    }
}
