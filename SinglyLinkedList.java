package singlylinkedlistdemo;

public class SinglyLinkedList {
    private Node head; // head (first node) of the list

    // Constructor
    public SinglyLinkedList() {
        head = null;
    }

    // Insert at end
    public void insertAtEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {      // empty list
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Insert at beginning
    public void insertAtBeginning(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    // Insert at specific position (0-based index)
    public void insertAtPosition(int value, int pos) {
        if (pos <= 0) {
            insertAtBeginning(value);
            return;
        }
        Node newNode = new Node(value);
        Node temp = head;
        int idx = 0;
        while (temp != null && idx < pos - 1) { // move to node before position
            temp = temp.next;
            idx++;
        }
        if (temp == null) { // if pos is beyond list, insert at end
            insertAtEnd(value);
        } else {
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    // Delete first occurrence of value
    public void deleteByValue(int value) {
        if (head == null) return;            // empty list
        if (head.data == value) {            // head to be removed
            head = head.next;
            return;
        }
        Node prev = head;
        Node curr = head.next;
        while (curr != null && curr.data != value) {
            prev = curr;
            curr = curr.next;
        }
        if (curr == null) {
            // value not found
            System.out.println("Value " + value + " not found in list.");
        } else {
            prev.next = curr.next; // unlink node
        }
    }

    // Display list contents
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Get size (optional utility)
    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
