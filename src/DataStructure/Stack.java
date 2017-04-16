package DataStructure;

/**
 * Created by oeno on 2017. 4. 16..
 */
public class Stack<T> {
    private Node top;

    public Stack(T data) {
        Node node = new Node(data);
        this.top = node;
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

    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return (T)top.getData();
        }
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        } else {
            T data = peek();
            top = top.getNext();
            return data;
        }
    }

    public void clear() {
        top = null;
    }

}
