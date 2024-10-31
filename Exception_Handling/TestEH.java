package Exception_Handling;
import java.util.Scanner;

public class TestEH {
    
public static void main (String[] args){

    Scanner sc = new Scanner(System.in);

    // try{
    //     int x = 19/0;
    // }
    // catch(Exception e){
    //     e.printStackTrace();
    // }

    // String name;

    // try(Scanner sc = new Scanner(System.in)){
    //     name = sc.nextLine();
    // }

    // System.out.println(name);

    int reqPoints = 100, availPoints = 30;

    try{
        if(reqPoints>availPoints){
            int need = reqPoints-availPoints;
            throw new ShortageOfPointsException(need);
        }
    }catch(Exception e){
        System.out.println("Collect more points to continue !");
    }

    System.out.println("--------------------------------------------------------");

    int[] arr = new int[1];
    //arr[3] = 10;
    try{
        int a = 10/0;
        int x = arr[3];
    }catch(Exception e){
        e.printStackTrace();
    }finally{
       sc.close();
       System.out.println("\n Scanner Closed....");
    }

    System.out.println(" \n\t\t From Out Side  ! \n");


}

}
