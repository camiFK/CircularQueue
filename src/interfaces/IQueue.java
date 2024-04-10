package interfaces;

public interface IQueue {
    boolean isEmpty();
    void enqueue(int data);
    int dequeue();
    void displayQueue();
    boolean isCircular();
}
