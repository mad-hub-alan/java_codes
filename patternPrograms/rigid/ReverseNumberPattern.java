package patterns.rigid;

/*
   
 5  5  5  5  5
 4  4  4  4  4 
 3  3  3  3  3
 2  2  2  2  2 
 1  1  1  1  1 
 
 */
public class ReverseNumberPattern 
{
    public static void main(String[] a)
    {
        int n=5;

        for(int x=n; x>=1; x--)
        {
            for(int y=n; y>=1; y--)
            {
                System.out.print(x+"  ");
            }
            System.out.println();
        }
    }    
}
