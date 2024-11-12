package iterator;
import java.util.*;

public class IteratorTest {
    
    public static void main(String[] args){

        Queue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(100);
        pq.add(70);
        pq.add(30);
        pq.add(80);
        pq.add(40);


        System.out.println(pq);

        for(Integer i : pq){
                System.out.print(i+"\t");
                //System.out.println(pq.remove()+"\t");
        }

        System.out.println();
        System.out.println("----------------------------------------------------");

        pq.forEach(
           (x)-> {System.out.println(x);}  // Lambda Expression
        );
           
        System.out.println("----------------------------------------------------");
    

        Iterator<Integer> it = pq.iterator();

        System.out.println("Before iteration : "+pq);

        int count = 1;
        while(it.hasNext()){
            System.out.println(count +" --> "+it.next());
            it.remove();    // Removes elements correctly.
           //pq.remove();    // ConcurrentModificationException Thrown.......... But why?
            count++;
        }
        
        System.out.println("After iteration : "+pq);
        
        pq.add(Integer.MAX_VALUE);        

        System.out.println(pq);
        }
    }
