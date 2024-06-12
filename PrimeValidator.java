import java.util.Scanner;

public class PrimeValidator {
    public static boolean primeValidator(int num){
        int count = 0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        return count == 2 ? true : false;
    }

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number to validate Prime or not : ");

        int num = input.nextInt();

        //int num = 50;
        if(primeValidator(num)){
            System.out.println("The given number is Prime");
        }
        else{
            System.out.println("The given number is not Prime");
        }
    }
}
