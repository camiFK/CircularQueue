package helpers;

public class Node {
    public int data;
    Node next;
    Node previous;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}
