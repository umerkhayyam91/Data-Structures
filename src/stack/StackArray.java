package stack;

public class StackArray {
    int[] arr = new int[10];
    int maxSize = 10;
    int len = 0;

    boolean isEmpty() {
        return len == 0;
    }

    boolean isFull() {
        return len == maxSize;
    }

    void printStack() {
        if (!isEmpty()) {
            for (int i = 0; i < len; i++) {
                System.out.println(arr[i]);
            }
        }
    }

    void push(int element) {
        if (!isFull()) {
            arr[len++] = element;
        }

    }

    int pop() {
        try {
            return arr[len--];
        } catch (Exception e) {
            throw e;
        }
    }

    void palindrome() {
        if (!isEmpty()) {
            boolean j = false;
            int mid = len / 2;
            if (len % 2 == 0) {
                j = false;
            } else{
                j = true;
            }
            StackArray array2 = new StackArray();
            for (int i = 0; i < mid; i++) {
                int poppedElement = pop();
                array2.push(poppedElement);
            }
            if(j){
                pop();
            }

            while (!isEmpty()) {
               int stack1Element = this.pop();
               int stack2Element = array2.pop();
                if (stack1Element != stack2Element) {
                    System.out.println("Is NOT a palindrome");
                    return;
                }

            }

            System.out.println("Is Paldindrome");
        }
    }

    public static void main(String[] args) {
        StackArray array1 = new StackArray();
        array1.push(3);
        array1.push(5);
        array1.push(8);
        array1.palindrome();
        array1.printStack();
    }
}
