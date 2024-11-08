package recursion;
import java.util.Scanner;

public class Fibonacci {
    
    private static void printFibonacciSeries(int x){
        long n1 = 0, n2 =1, sum, count = 1;
        System.out.println(n1+"\n"+n2);

        while(count < x-1){
            sum = n1 + n2;
            System.out.println(sum);
            n1 =n2;
            n2 =sum;
            count++;
        }
    }

    public static void main(String[] args){

        Scanner userIP = new Scanner(System.in);

        System.out.println("Enter How much number of Fibonacci Series You need :");
        
        printFibonacciSeries(userIP.nextInt());

        userIP.close();
    }
}
