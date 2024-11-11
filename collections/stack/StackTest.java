package collections.stack;
import java.util.EmptyStackException;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args){

        Stack st = new Stack();

        st.push(4);
        st.push("Maddy");
        st.push(true);
        st.push(4.44f);
        st.push(93.5d);
        st.push(34L);
        st.push('M');

        System.out.println(st);

        System.out.println("-------------------------------------------------------------------------------------");

        Stack<String> myStk = new Stack<>();

        myStk.push("V1000");
        myStk.push("VTV");
        myStk.push("VTK");
        myStk.push("Minnale");
        myStk.push("AEM");

        System.out.println("Search for \"Minnale\" : "+myStk.search("Minnale"));

        System.out.println("Loop starts");

        try{
            for(String s : myStk){
                System.out.println(myStk.pop());
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Loop ends");


        //System.out.println(myStk.pop());
        myStk.pop();

        System.out.println(myStk);
        System.out.println("Top of the Stck : "+ myStk.peek());
        System.out.println("Ckeck whether the Stck is Empty or not : "+myStk.empty());
        System.out.println("Ckeck whether the Stck is Empty or not : "+myStk.isEmpty());    // method from Vector class
        System.out.println("Size of the Stck : "+myStk.size());     // method from Vector class


        System.out.println("-------------------------------------------------------------------------------------");


        Stack<Boolean> tempStk = new Stack<>();
        try{
        System.out.println(tempStk.peek());
        }catch(EmptyStackException e){
          //e.printStackTrace();
          System.out.println("Stack is Empty !");
        }


        System.out.println("---End of the Program---");

        Stack newStk  = new Stack();

        System.out.println(newStk.peek());
    
    }
}
