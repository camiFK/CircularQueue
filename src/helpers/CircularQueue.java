package helpers;
import interfaces.IQueue;

public class CircularQueue implements IQueue {
    Node front;
    Node rear;

    public CircularQueue() {
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            newNode.previous = rear;
            rear = newNode;
        }
        rear.next = front;
        front.previous = rear;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("The queue is empty");
        }
        int data = front.data;
        if (front == rear) {
            front = null;
            rear = null;
        } else {
            front = front.next;
            rear.next = front;
            front.previous = rear;
        }
        return data;
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return;
        }
        Node temp = front;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != front);
        System.out.println();
    }

    public Node getHead() {
        return front;
    }

    public Node getBottom() {
        return rear;
    }

    public boolean isCircular() {
        if (isEmpty()) {
            return false; // The empty queue cannot be circular
        }
        Node current = front;
        do {
            if (current.next == front) {
                return true; // The next node is the first, so it's circular
            }
            current = current.next;
        } while (current != front);
        return false; // If the next node is not the first, the queue is not circular
    }
}
