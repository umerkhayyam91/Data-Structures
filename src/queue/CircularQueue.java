package queue;
public class CircularQueue {
    int size = 6;
    int front = -1;
    int rear = -1;
    int[] queue = new int[size];

    boolean isEmptyCir() {
        return (front == -1 && rear == -1);
    }

    boolean isFullCir() {
        return (front == 0 && rear == size - 1) || ((rear == (front - 1)));
    }

    void printCir() {
        for (int i = 0; i < queue.length; i++) {
            System.out.println(queue[i]);
        }
    }

    void enQueueCir(int element) {
        if (isEmptyCir()) {
            front = 0;
            rear = 0;
            queue[rear] = element;
        } else if (isFullCir()) {
            System.out.println("Queue overflow!!");
        } else if (rear == size - 1 && front != 0) {
            rear = 0;
            queue[rear] = element;
        } else {
            rear++;
            if (rear >= front) {
                queue[rear] = element;
            }

        }

    }

    void deQueueCir() {
        if (!isEmptyCir()) {
            if (front == rear) {
                queue[front] = 0;
                front = -1;
                rear = -1;
            } else if (front == size - 1) {
                queue[front] = 0;
                front = 0;
            } else {
                queue[front] = 0;
                front += 1;
            }
        }
        System.out.println("Queue underflow!!");
    }

    public static void main(String[] args) {
        CircularQueue circular = new CircularQueue();
        circular.enQueueCir(1);
        circular.enQueueCir(2);
        circular.enQueueCir(3);
        circular.enQueueCir(4);
        circular.enQueueCir(5);
        circular.enQueueCir(6);
        circular.deQueueCir();
        circular.printCir();

    }
}
