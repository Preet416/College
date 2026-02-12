package singlylinkedlistdemo;

/**
 * Simple Node for a singly linked list.
 */
public class Node {
    int data;     // stored value
    Node next;    // reference to next node

    // Constructor
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
