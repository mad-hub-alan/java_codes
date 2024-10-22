package Structy_Problems;

class IsPrime {
    public static boolean isPrime(int number) 
    {
      int count = 0;
      
      for(int i=1; i<=number; i++)
        {
          if(number%i==0)
            count++;
        }
      return count==2;
    }
  
    public static void main(String[] args) {
      
      System.out.print(isPrime(42));
    }
  }
