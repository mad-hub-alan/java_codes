package collections.list.linkedList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import collections.list.linkedList.singlyLinkedList.Node;

import java.util.*;

class Node{
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}

class SList {

    // head node
    Node header;
    
    // method to insert a new node in a LinkedList
    public void insert(int newData) {
        Node newnode = new Node(newData);
    
        if (header == null) {
            header = newnode;
        } else {
            Node current = header;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newnode;
    
        }
    
    }

    // method to print the LinkedList
    public void Print() {
        if (header == null)
            return;

        Node current = header;
        // int i = 0;
        while (current != null) {
            // System.out.println(i++);
            System.out.print(current.data + "-> ");
            current = current.next;
        }
        System.out.println("null ");

    }

    // method to search a value in a LinkedList
    public boolean search(int num){
        if(header==null){
            return false;
        }
        Node ptr = header;
        while(ptr != null){
            if(ptr.data == num){
                return true;
            }
            ptr = ptr.next;
        }

        return false;
    }
    

    // method to insert a new node at specific place in a LinkedList
    public void midInd(int newData, int ind) {
        Node newnode = new Node(newData);
        if (ind == 0) {
            Node current = header;
            newnode.next = current;
            header = newnode;
            return;
        }
    }



}
    public class Work {

        public static void main(String[] args) {
            SList list = new SList();
            list.insert(5);
            list.insert(10);
            list.insert(23);
            list.insert(5);

            // System.out.println(list);
            list.Print();
            list.midInd(8, 0);
            list.Print();
            System.out.println(list.search(5));

        }
    }
