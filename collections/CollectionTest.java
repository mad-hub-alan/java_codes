package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Vector;

public class CollectionTest {
    public static void main(String[] args){

        Collection<Integer> my = new ArrayList<>(); 
        
        my.add(82);
        my.add(45);
        my.add(265);
        my.add(183);
        my.add(18);

        System.out.println(my);

        //my.clear();

        System.out.println(my);

        Collection<Integer> mySet = new HashSet<>();
        Collection<Integer> pq = new PriorityQueue<>();
        Collection<Integer> li = new LinkedList<>();
        Collection<Integer> vector = new Vector<>();

        mySet.addAll(my);
        pq.addAll(my);
        li.addAll(my);
        vector.addAll(my);


        System.out.println("HashSet : "+mySet);
        System.out.println("PQ : "+pq);
        System.out.println("LiLi : "+li);
        System.out.println("Vector : "+vector);

        //vector.clear();

        System.out.println("Vector after clear() : "+vector);

        Object[] arr = vector.toArray();

        for(Object i : arr)
            System.out.println(i);

        System.out.println(vector.equals(li));

        System.out.println(vector.containsAll(mySet));

        Integer[] a1 = new Integer[10];
        Arrays.fill(a1,100);

        Collection<String> list = new ArrayList<>();
        Collections.sort((ArrayList<String>) list);
    }
}
