package DSA.binary_search_problems;

import java.util.*;

public class FindFirstOne {
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int res = zeroOnes(n, a);
        System.out.println(res);

    }

    static int zeroOnes(int n, int a[]) {
        int beg = 0, end = n-1;

        while(beg<=end){
            int mid = (beg+end)/2;
            if(a[mid]==1){
                if(mid==0) return mid;
                if(a[mid-1]==0) return mid;
                else end = mid-1;
            }else{
                beg = mid+1;
            }
        }
        return -1;
    }
}


/*

Problem Description
Given a sorted array consisting of 0s and 1s only, find the index of the first 1. If there’s no 1 present in the array, return -1

Input format
There are 2 lines of input

First line will contain a single integer n.

Next line will contain n space separated integers.

Output format
Print the index of first occuring if present, otherwise print -1.

Sample Input 1
4

0 0 1 1

Sample Output 1
2

Constraints
1<=n<=100000

0<=Ai<=1

*/