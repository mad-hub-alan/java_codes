package patternPrograms.rigid;

/*
 
1 1 1 1 1
2 2 2 2 2
3 3 3 3 3 
4 4 4 4 4 
5 5 5 5 5

 */
public class NumberSquarePattern 
{
    public static void main(String[] args)
    {
        int n = 5;

        for(int x=1; x<=n; x++)
        {
            for(int y=1; y<=n; y++){
                System.out.print(x+"  ");
            }
            System.out.println();
        }
    }    
}
