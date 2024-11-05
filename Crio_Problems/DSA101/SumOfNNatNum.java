package Crio_Problems.DSA101;
import java.util.Scanner;

public class SumOfNNatNum {
    
    static int sumOfNBF(int n){
        int sum = 0;
        for(int i=1; i<=n; i++)
            sum = sum + i;
        return sum;
    }

    static int sumOfNFOR(int n){
        int sum = (n*(n+1))/2;
        return sum;
    }
    
    static int sumOfNREC(int n){
        if(n==0)
            return 0;
        return (n + (sumOfNREC(n-1)));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 'N' Value :");

        int num = sc.nextInt();

        System.out.println("RESULT FROM BRUTE FORCE METHOD : "+sumOfNBF(num));
        System.out.println("RESULT FROM FORMULA(OPT) METHOD : "+sumOfNFOR(num));
        System.out.println("RESULT FROM RECURSIVE METHOD : "+sumOfNREC(num));
    }
}
