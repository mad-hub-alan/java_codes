package crio_problems;

import java.util.*;

public class SumOfTwoArrays{

public static int sumOfTwoArrays(int arr1[],int arr2[]){

    int sum =0;

    for(int i=0;i<arr1.length;i++){
        sum = sum+arr1[i];
    }

    for(int j=0;j<arr2.length;j++){
        sum = sum+arr2[j];
    }
    return sum;
}

public static void main(String[] args){

    assert (sumOfTwoArrays(new int[] { 1, 2, 3 },new int[] { 4, 5, 6 } ) == 21) : "Expect 21 for {1,2,3},{4,5,6}";

    System.out.println("All test cases in main function passed");

    System.out.println(sumOfTwoArrays(new int[]{4,7,2,5,6},new int[]{2,3,8,7}));

}
}
