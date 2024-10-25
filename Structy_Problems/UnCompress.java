package Structy_Problems;

import java.util.Scanner;

class Source {
    public static String uncompress(String s)
    {
      String uncom = "";
      String numbers = "1234567890";
      int x = 0;
      int y = 0;
  
      while(y < s.length())
        {
          String character = String.valueOf(s.charAt(y));
          if(numbers.contains(character))
          {
            y++;
          }
          else
          {
            int num = Integer.parseInt(s.substring(x,y));
            uncom = uncom + character.repeat(num);
            y++;
            x = y;
          }
        }    
      return uncom;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        String userInput = in.nextLine();
        String myStr = "1M1i2s1i2s1i2p1i";

        System.out.println(uncompress(myStr));
        System.out.println("------------------------");
        System.out.println(uncompress(userInput));
    }
  }
