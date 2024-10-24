package Structy_Problems;

import java.util.*;

class PairProduct
{
  public static List<Integer> pairProduct(List<Integer> numbers, int target)
  {
    HashMap<Integer,Integer> map = new HashMap<>();

    for(int i=0; i<numbers.size(); i++)
    {
      int num = numbers.get(i);
      int comp = target/num;

      if(map.containsKey(comp))
      {
        return List.of(map.get(comp),i);
      }
      map.put(num,i);
    }
    return null;
  }

  public static void main(String[] args) {
    System.out.print(pairProduct(List.of(1,2,3,4,5,6,7,8),20));
  }
}

