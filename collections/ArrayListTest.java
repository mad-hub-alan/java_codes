package collections;

import java.util.*;

public class ArrayListTest 
{
    public static void main(String[] args)
    {
        Collection list1 = new ArrayList();
        Collection list2 = new ArrayList();

        // System.out.println(list1.equals(list2));

        // list1.add("Maddy");
        // list1.add("Baddy");

        // list2.add("Maddy");
        // list2.add("Baddy");

        // System.out.println(list1.equals(list2));

        Collection<String> strSet = new HashSet<String>();
        Collection<String> strList = new ArrayList<String>();
        Collection<String> strQueue = new PriorityQueue<String>();
        Collection<String> strStack = new Stack<String>();
       // Collection<Integer,Object> myMap = new HashMap();
        
       Map<Integer, String> myMap = new HashMap<Integer, String>();


        System.err.println(strList.equals(strSet));




    }    
}
