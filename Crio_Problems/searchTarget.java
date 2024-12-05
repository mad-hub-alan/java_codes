package crio_problems;

import java.util.*;

public class searchTarget{

    public static int searchTarget(int N,int[] arr,int X){
        for(int i=0; i<N; i++){
            if(arr[i]==X){
                return 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){

        assert (1 == searchTarget(5,new int[] { 13, 7, 5, 3, 1 },7)) :
                "Expect 1 for numbers = [13, 7, 5, 3, 1 ] and Value = 7 ";

        assert (-1 == searchTarget(5,new int[] { 13, 7, 5, 3, 1 },8)) :
                "Expect -1 for numbers = [13, 7, 5, 3, 1 ] and Value = 8";


        System.out.println("All test cases in main function passed");

        System.err.println("Result for First Input :"+searchTarget(10,new int[]{1,2,3,4,5,6,7,8,9,0},-4));

        System.err.println("Result for Second Input :"+searchTarget(4,new int[]{18,45,32,10},18));

    }

}



