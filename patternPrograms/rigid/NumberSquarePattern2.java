package patternPrograms.rigid;

/*
   
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 

 */
public class NumberSquarePattern2 
{
    public static void main(String[] args)
    {
        int n=5;

        for(int x=1; x<=n; x++)
        {
            for(int y=1; y<=n; y++)
            {
                System.out.print(y+"  ");
            }
            System.out.println();
        }
    }    
}
