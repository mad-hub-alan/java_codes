package collections.list.linkedList.singlyLinkedList;

class SinglyLL {

    // head node
    ListNode head;


    // method to insert a node at last in the SinglyLL
    public void addLast(String val){
        // create a new node
        ListNode newNode = new ListNode(val);
        // if the singlyLL is empty make newNode to head
        if(head == null){
            head = newNode;
        }else{
            ListNode curr = head;
            // traverse till last legal node
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next  = newNode;
        }
    }


    // method to add a note at last in the SinglyLL
    public void addFirst(String val){
        ListNode newNode = new ListNode(val);

        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }


    // method to print the SinglyLL
    public void print(){
        ListNode curr = head;

        while(curr != null){
            System.out.print(curr.value+"-->");
            curr = curr.next;
        }
        System.out.print("null");
    }
}
