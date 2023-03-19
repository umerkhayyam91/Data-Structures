class Node {
    String data; //int datatype not working
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
    void insertAtFront(String data) {
        Node nn = new Node();
        nn.data = data;
        if (isEmpty()) {
            start = nn;
            curr = start;
        } else {
            nn.next = start;
            start = nn;
        }
    }

    // to insert a node at end if the list//
    void insertAtEnd(String data) {
        Node nn = new Node();
        nn.data = data;

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
    void deleteNode(String key) {
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

    

    void search(String key) {
        curr = start;
        prev = null;
        if (!isEmpty()) {
            while (curr != null && curr.data != key) {
                prev = curr;
                curr = curr.next;
            }
            if (curr != null) {
                System.out.println("value found");
                System.out.println(curr);
            } else {
                System.out.println("Value not found");
            }
        } else {
            System.out.println("list is empty");
        }
    }


// main method//
// public static void main(String[] args) {
// LinkedList list = new LinkedList();
// list.insertAtEnd("3");
// list.insertAtEnd("8");
// list.insertAtEnd("1");
// list.insertAtEnd("2");
// list.destroyList();
// list.print();
// }

}
