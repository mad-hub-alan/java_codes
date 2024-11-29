package collections.list.linkedList.singlyLinkedList;

public class SinglyLLTest {
    public static void main(String[] args){
        SinglyLL slist = new SinglyLL();

        slist.addLast("Madhu");
        slist.addLast("Amal");
        slist.addLast("Hari");
        slist.addFirst("Friends");

        slist.print();
    }
}
