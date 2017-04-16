package DataStructure;

import java.util.PrimitiveIterator;

/**
 * Created by oeno on 2017. 4. 16..
 */
public class Queue<T> {
    private Node head;
    private Node tail;

    public Queue(T data) {
        Node node = new Node(data);
        head = tail = node;
    }

    public Queue() {
        head = tail = null;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public int add(T data) {
        try {
            Node node = new Node(data);

            if (isEmpty()) {
                head = tail = node;
                return 0;
            }
            else {
                tail.setNext(node);
                tail = node;
                return 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return (T)head.getData();
        }
    }

    public T poll() {
        if (isEmpty()) {
            return null;
        }   else {
            T data = peek();
            head = head.getNext();
            return data;
        }
    }
}
