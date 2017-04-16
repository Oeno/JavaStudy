package DataStructure;

import java.util.EmptyStackException;

/**
 * Created by oeno on 2017. 4. 16..
 */
public class Stack<T> {
    private Node top;

    public Stack(T data) {
        this.top = new Node(data);
    }

    public Stack() {
        this.top = null;
    }

    public boolean isEmpty() {
        if (top == null)
            return true;
        else
            return false;
    }

    public int push(T data) {
        try {
            Node node = new Node(data);
            node.setNext(top);
            this.top = node;
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        else {
            T data = (T)top.getData();
            top = top.getNext();
            return data;
        }
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        else {
            return (T)top.getData();
        }
    }

    public void clear() {
        top = null;
    }

}
