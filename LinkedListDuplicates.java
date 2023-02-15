import java.io.*;
class Node
{
    Node next;
    int data;
 
    public Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
public class LinkedListDuplicates
{
 
    public Node head = null;
    public Node tail = null;
 
    public void add(int data)
    {
        Node newNode = new Node(data);
 
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void removeDup()
    {
        Node current = head, index = null, temp = null;
 
        if (head == null)
        {
            return;
        }
        else 
        {
            while (current != null)
            {
                temp = current;
                index = current.next;
 
                while (index != null)
                {
                    if (current.data == index.data)
                    {
                        temp.next = index.next;
                    }
                    else {
                        temp = index;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
    public void printList()
    {
        Node current = head;
        if (head == null)
        {
            System.out.println("Empty list please insert some elements first");
            return;
        }
        while (current != null)
        {
 
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
 
        LinkedListDuplicates List = new LinkedListDuplicates();
 
        List.add(9);
        List.add(1);
        List.add(1);
        List.add(3);
        List.add(4);
        List.add(8);
        List.add(2);
        List.add(1);
 
        System.out.println("LinkedList with Duplicates : ");
        List.printList();
        List.removeDup();
        System.out.println("After removing duplicates in LinkedList : ");
        List.printList();
    }
}