package collections;

import java.util.*;

public class ListTest 
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


        // System.err.println(strList.equals(strSet));

        // System.out.println(strList);
        // System.out.println(strSet);

        List<String> nameList = List.of("Maddy","Body","Lady","Broddy","Sandy");

      List list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(76);
        list.add(26);
        list.add(90);
        list.add(17);
        list.add(99);
        list.add(true);
        list.add(104.6f);
        list.add(93.5d);
        list.add("Java");
        list.add(null);

        System.out.println(list);
        System.out.println(list.getLast());
        System.out.println(list.getFirst());
        System.out.println(list.get(1));
        System.out.println(list.addAll(0,nameList));      
        System.out.println(list);  

        nameList.clear();
        System.out.println(list);
    }    
}
