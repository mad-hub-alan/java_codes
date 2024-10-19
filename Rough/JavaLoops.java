import java.util.*;

public class JavaLoops {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a Number :");
        int input = in.nextInt();



        // While Loop

        while(input!=0){
            System.err.println("You have entered \""+input+"\"");

            System.out.println("Enter a Number :");
            input = in.nextInt();
        }


        // Do-While Loop

        do{
            System.err.println("You have entered \""+input+"\"");

            System.out.println("Enter a Number :");
            input = in.nextInt();
        }while(input!=0);



        // For Loop

        for(;input!=0;){
            System.err.println("You have entered \""+input+"\"");

            System.out.println("Enter a Number :");
            input = in.nextInt();
        }
    }
}
