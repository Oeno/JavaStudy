package DataStructure;

import java.util.*;

/**
 * Created by oeno on 2017. 4. 16..
 */
public class Queue<T extends Objects> {
    private List<T> queue;
    private int front;
    private int rear;

    public Queue(T data) {
        queue = new ArrayList();
        queue.add(data);
        front = rear = 0;
    }

    public Queue() {
        queue = new ArrayList();
    }

    public boolean isEmpty() {
        return (queue.size() == 0);
    }

    public void add(T data) {
        try {
            if (isEmpty()) {
                queue.add(data);
                front = rear = 0;
            }
            else {
                queue.add(data);
                rear++;
            }
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        else {
            return queue.get(front);
        }
    }

    public T poll() {
        if (isEmpty()) {
            return null;
        }
        else {
            return queue.remove(front);
        }
    }

    public void clear() {
        queue.clear();
    }
}