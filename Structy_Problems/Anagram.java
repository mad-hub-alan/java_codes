package Structy_Problems;

import java.util.*;

class Anagram {

  private static HashMap<Character, Integer> counter(String s)
  {
    HashMap<Character, Integer> map = new HashMap<>();

    for(char c : s.toCharArray())
      {
        if(map.get(c) == null)
        {
          map.put(c, 0);
        }
        map.put(c, map.get(c)+1);
      }
    return map;
  }
  
  public static boolean anagrams(String s1, String s2) 
  {
      HashMap<Character, Integer> map1 = counter(s1);
      HashMap<Character, Integer> map2 = counter(s2);

    return map1.equals(map2);
  }

  public static void main(String[] args) {
    System.out.println(counter("MADHUBALAN"));

    System.out.println(anagrams("maddy", "damdy"));
    System.out.println(anagrams("marriage", "agerimar"));
    System.out.println(anagrams("toss", "boss"));
    System.out.println(anagrams("amma", "appa"));
    System.out.println(anagrams("anagram", "nagaram"));
  }
}

