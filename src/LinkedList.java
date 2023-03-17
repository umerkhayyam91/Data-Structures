class Node {
    int data;
    Node next;
}

public class LinkedList {
    static Node start, curr, prev;

    boolean isEmpty() {
        return start == null;
    }

    void print() {
        if (!isEmpty()) {
            Node temp = start;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    // to insert a node at beginning if the list//
    void insertAtFront(int value) {
        Node nn = new Node();
        nn.data = value;
        if (isEmpty()) {
            start = nn;
            curr = start;
        } else {
            nn.next = start;
            start = nn;
        }
    }

    // to insert a node at end if the list//
    void insertAtEnd(int value) {
        Node nn = new Node();
        nn.data = value;

        if (isEmpty()) {
            start = nn;
            curr = start;
        } else {
            curr.next = nn;
            prev = curr;
            curr = curr.next;
        }
    }

    // to reverse list//
    void reverseList() {
        curr = start;
        prev = null;
        Node temp;

        while (curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        start = prev;
    }

    // to delete a specific node from list//
    void deleteNode(int key) {
        Node temp;
        temp = start;
        prev = null;

        if (!isEmpty()) {
            if (temp != null && temp.data == key) {
                start = temp.next;
                return;

            }
            while (temp != null && temp.data != key) {
                prev = temp;
                temp = temp.next; // can we use prev.next?
            }
            if (temp == null) {
                return;
            }
            prev.next = temp.next;
        } else {
            System.out.println("List is empty!!");
        }

    }

    // to destroy the whole list//
    void destroyList() {
        Node temp;

        if (!isEmpty()) {
            while (start != null) {
                temp = start;
                start = start.next;
                temp.next = null;
            }
        } else {
            System.out.println("List is empty");
        }
        System.out.println("list deleted");

    }

    // main method//
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtFront(5);
        list.insertAtFront(7);
        list.insertAtFront(8);
        list.insertAtFront(10);

        list.print();
    }

}
