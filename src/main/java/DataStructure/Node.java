package DataStructure;

/**
 * Created by oeno on 2017. 4. 16..
 */
public class Node<T> {
    private T data;
    private Node next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public T getData() {
        return data;
    }
}