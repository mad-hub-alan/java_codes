package patternPrograms.rigid;

/*
 
1  2  3  4  5
6  7  8  9  10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25

 */

public class ContinuosNumberPattern 
{
    public static void main(String[] args)
    {
        int n = 25;

        for(int x=1; x<=n; x++)
        {
            if(x<=9)                        // Condition for output indendation
                System.out.print(x+"  ");
            else
                System.out.print(x+" ");

            if(x%5==0)                      // next line condition
                System.out.println();
        }
    }    
}
