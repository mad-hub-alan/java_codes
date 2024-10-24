package patternPrograms.rigid;

/*
  
 5  4  3  2  1
 5  4  3  2  1
 5  4  3  2  1
 5  4  3  2  1
 5  4  3  2  1
 
 */

public class ReverseNumberPattern2 
{
    public static void main(String[] args)
    {
        int n = 5;

        for(int x=1; x<=n; x++)
        {
            for(int y=n; y>=1; y--)
            {
                System.out.print(y+"  ");
            }
            System.out.println();
        }
    }    
}
