import java.util.*; 
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
class MergingLinkedList
{
    Node head;
 
    public void AddToTheLast(Node node)
    {
        if (head == null) {
            head = node;
        }
        else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }
    void printList()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        MergingLinkedList list1 = new MergingLinkedList();
        MergingLinkedList list2 = new MergingLinkedList();
 
        list1.AddToTheLast(new Node(5));
        list1.AddToTheLast(new Node(10));
        list1.AddToTheLast(new Node(15));
 
        list2.AddToTheLast(new Node(2));
        list2.AddToTheLast(new Node(3));
        list2.AddToTheLast(new Node(20));
 
        list1.head = new SortedList().sortedMerge(list1.head,list2.head);
        System.out.println("After Merging Linked List is:");
        list1.printList();
    }
}
 
class SortedList {
    Node sortedMerge(Node headA, Node headB)
    {
 
        Node dummyNode = new Node(0);
 
        Node tail = dummyNode;
        while (true) {
 
            if (headA == null) {
                tail.next = headB;
                break;
            }
            if (headB == null) {
                tail.next = headA;
                break;
            }
 
            if (headA.data <= headB.data) {
                tail.next = headA;
                headA = headA.next;
            }
            else {
                tail.next = headB;
                headB = headB.next;
            }
 
            tail = tail.next;
        }
        return dummyNode.next;
    }
}