package queue;

public class Queue {
    int size = 0;
    int front = 0;
    int rear = 0;
    int[] queue = new int[10];

    boolean isEmpty() {
        return front == rear;
    }

    

    boolean isFull() {
        return rear == 10;
    }

   

    void enQueue(int element) {
        if (!isFull()) {
            queue[rear] = element;
            rear++;
        } else {
            System.out.println("Array is full!!");
        }
    }

   

    void deQueue() {
        if (!isEmpty()) {
            for (int i = 0; i <= rear - 1; i++) {
                queue[i] = queue[i++];
            }
            rear--;
        } else {
            System.out.println("Array empty!!");
        }
    }

    void printArray() {
        if (!isEmpty()) {
            for (int i = 0; i < queue.length; i++) {
                if (queue[i] != 0) {
                    System.out.println(queue[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Queue print = new Queue();
        print.enQueue(1);
        print.enQueue(5);
        print.enQueue(10);
        print.deQueue();
        print.printArray();
    }

}