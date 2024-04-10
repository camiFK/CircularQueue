//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import helpers.CircularQueue;
import helpers.Node;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        CircularQueue queue = new CircularQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println("Initial queue:");
        queue.displayQueue();

        System.out.println("Dequeueing element: " + queue.dequeue());

        System.out.println("Queue after dequeue:");
        queue.displayQueue();

        Node head = queue.getHead();
        Node bottom = queue.getBottom();

        if (head != null) {
            System.out.println("Head of the queue: " + head.data);
        } else {
            System.out.println("The queue is empty, no head exists.");
        }

        if (bottom != null) {
            System.out.println("Bottom of the queue: " + bottom.data);
        } else {
            System.out.println("The queue is empty, no bottom exists.");
        }

        System.out.println("Is the queue circular? " + queue.isCircular());
    }
}