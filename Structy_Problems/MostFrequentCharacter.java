package Structy_Problems;

import java.util.HashMap;


class MostFrequentCharacter 
{
  private static HashMap<Character, Integer> counter(String s)
  {
    HashMap<Character, Integer> myMap = new HashMap<Character, Integer>();

    for(char c : s.toCharArray())
      {
        if(!myMap.containsKey(c))
          myMap.put(c,0);

        myMap.put(c, myMap.get(c)+1);
      }
    return myMap;
  }
  public static char mostFrequentChar(String s) 
  {
    HashMap<Character, Integer> map = counter(s);
    char freqChar = '\u0000';
    int maxCount = 0;
    
    for(char c : s.toCharArray())
      {
        if(map.get(c)>maxCount)
        {
          maxCount = map.get(c);
          freqChar = c;
        }
      }
    return freqChar;
  }

  public static void main(String[] args) 
  {
    System.out.println(mostFrequentChar("mazuzoo"));
    System.out.println(counter("mississippi"));
    System.out.print(mostFrequentChar("mississippi"));
  }
}

