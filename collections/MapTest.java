package collections;
import java.util.Map;

public class MapTest {
    public static void main(String[] args){

        Map<Integer,String> myMap = Map.of(1,"San",2,"Pody");

        try{
        myMap.put(2,"Doe");
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(myMap);

        System.out.println(myMap.get(2));

    }
}
