package Structy_Problems;

import java.util.*;

class PairSum2 {
  public static List<Integer> pairSum(List<Integer> numbers, int target)
  {
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

    for(int i=0; i<numbers.size(); i++)
      {
        int num = numbers.get(i);
        int com = target - num;

        if(map.containsKey(com))
        {
          return List.of(map.get(com),i);
        }
        map.put(num,i);
      }
    return null;
  }

  public static void main(String[] args)
  {
    System.out.println(pairSum(List.of(1,3,2,5,2,3),10));
    System.out.println(pairSum(List.of(0,0),0));
    System.out.println(pairSum(List.of(2,5,-1,9,5,8,-1,0,-9),0));
  }
}

