class SNode {
    String data; 
    SNode next;
}

public class Stack {
    SNode start, last, secLast;

    boolean isEmpty() {
        return start == null;
    }

    void print() {
        if (!isEmpty()) {
            SNode temp = start;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    void push(String value) {
        SNode newNode = new SNode();
        newNode.data = value;
        newNode.next = start;
        start = newNode;

    }

    String pop() {
        String topValue = start.data;
        SNode temp = start;
        start = start.next;
        temp = null;
        return topValue;

    }

    String top() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        String topValue = start.data;
        return topValue;

    }

    int search(String data) {
        boolean empty = false;
        if (!isEmpty()) {
            int count = 1;
            SNode temp = start;
            while (temp != null) {
                if (temp.data == data) {
                    empty = true;
                    System.out.println("Element is present in stack at position " + count);
                    return count;
                } else {
                    temp = temp.next;
                    count++;
                }
            }
        }
        System.out.println("-1");
        return -1;
    }

    void palindrome() {
        Stack stack2 = new Stack();
        while (!isEmpty()) {
            String poppedElement = pop();
            stack2.push(poppedElement);
        }

        while (!isEmpty()) {
            String stack1Element = pop();
            String stack2Element = stack2.pop();

            if (!stack1Element.equalsIgnoreCase(stack2Element)) {
                System.out.println("Is NOT a palindrome");
                return;
            }

        }

        System.out.println("Is Paldindrome");
    }

    public static void main(String[] args) {
        Stack stack1 = new Stack();
        stack1.push("e");
        stack1.push("l");
        stack1.push("l");
        stack1.push("e");
        stack1.palindrome();
    }

}
