package collections;

import java.util.*;

public class ArrayListTest 
{
    public static void main(String[] args)
    {
        Collection list1 = new ArrayList();
        Collection list2 = new ArrayList();

        System.out.println(list1.equals(list2));

        list1.add("Maddy");
        list1.add("Baddy");
        
        list2.add("Maddy");
        list2.add("Baddy");

        System.out.println(list1.equals(list2));





    }    
}
