package Structy_Problems;

import java.util.*;

// Time : O(n^2)
// Space: O(1)

class PairSum {
  public static List<Integer> pairSum(List<Integer> numbers, int target)
  {
    List<Integer> reqList = new ArrayList<Integer>();
    
    for(int i=0; i<numbers.size(); i++)
    {
        for(int j=i+1; j<numbers.size(); j++)
        {
            if(numbers.get(i) + numbers.get(j) == target)
            {
              reqList.add(i);
              reqList.add(j);
              if(reqList.size()==2)
              {
                return reqList;
              }
            }
        }
    }
    
    return null;
  }

  public static void main(String[] args)
  {
    System.out.println(pairSum(List.of(1,2,3,4,5,6,7,8,9),10));
  }
}

