class Node {
    String data;
    Node next;
    Node prev;
}

public class DoublyLinkedList {
    Node head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void addAtEnd(String data) {
        Node newNode = new Node();
        newNode.data = data;

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void addAtFront(String data) {
        Node newNode = new Node();
        newNode.data = data;

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void printList() {
        Node curr = head;

        if (head == null) {
            System.out.println("List is empty");
        } else {
            System.out.println("Here is your list: ");
            while (curr != null) {
                System.out.println(curr.data + " ");
                curr = curr.next;
            }
        }
    }

    void searchElement(String element) {
        Node newNode = new Node();
        newNode.data = element;
        Node temp = head;
        int count = 1;
        if (head == null) {
            System.out.println("List is empty!!");
            return;
        }
        while (temp != null) {
            if ((temp.data).equalsIgnoreCase(element)) {
                System.out.println("Element found!!");
                System.out.println("Element was present at postion: " + count);
                return;
            } else {
                temp = temp.next;
            }
            count++;
        }
        if (temp == null) {
            System.out.println("Element not found!!");
        }

    }

    void deleteNode(String key) {
        Node temp = head;
        Node curr = null;
        if (temp == null) {
            System.out.println("List is empty!!");
            return;
        }
        if (temp != null && temp.data == key) {
            head = head.next;
            head.prev = null;
            temp.next = null;
            return;
        }
        while (temp != null && temp.data != key) {
            curr = temp;
            temp = temp.next;

        }
        if (temp != null) {
            temp.prev = null;
            temp = temp.next;
            curr.next = temp;
            if (temp != null) {
                temp.prev = curr;
            }

        }
    }

    void deleteList() {
        Node temp;
        if (!isEmpty()) {
            while (head != null) {
                temp = head;
                head = head.next;
                temp.next = null;
                if (head != null) {
                    head.prev = null;
                }
            }
        } else {
            System.out.println("List empty!!");
        }
        System.out.println("List deleted!!");
    }

    void reverseList() {
        Node temp = null;
        Node curr = head;

        if (!isEmpty()) {
            while (curr != null) {
                temp = curr.prev;
                curr.prev = curr.next;
                curr.next = temp;
                curr = curr.prev;
            }
            if (temp != null) {
                head = temp.prev;
            }
        }

    }

    void palindrome() {
        Node left = head;
        Node right = tail;
        while (left != null && right != null) {
            if ((left.data).equalsIgnoreCase(right.data)) {
                left = left.next;
                right = right.prev;
            } else {
                System.out.println("The list is not a palindrome");
                return;
            }
        }
        System.out.println("The list is a palindrome");
    }

    public static void main(String[] args) {
        DoublyLinkedList dList = new DoublyLinkedList();
        dList.addAtEnd("L");
        dList.addAtEnd("E");
        dList.addAtEnd("o");
        dList.addAtEnd("d");
        dList.reverseList();
        dList.printList();

    }

}
