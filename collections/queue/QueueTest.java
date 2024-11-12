package collections.queue;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueTest {
    
    public static void main(String[] args){

        Queue<String> pq = new PriorityQueue<>();

        Queue<Integer> lili = new LinkedList<>();

        lili.add(Integer.parseInt("1"));
        lili.add(5);
        lili.add(10);

        System.out.println(lili);

        lili.remove();
        lili.remove();

        System.out.println(lili);
        
        pq.add("One");
        pq.add("Two");
        pq.add("Three");

        System.out.println(pq);

        pq.remove();
        pq.remove();

        System.out.println(pq);



    }

}
