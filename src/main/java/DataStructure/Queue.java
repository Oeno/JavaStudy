package DataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by oeno on 2017. 4. 16..
 */
public class Queue<T extends Objects> {
    private List<T> list;
    private int front;
    private int rear;

    public Queue(T data) {
        list = new ArrayList();
        list.add(data);
        front = rear = 0;
    }

    public boolean isEmpty() {
        if (list.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int add(T data) {
        try {
            list.add(data);

            if (isEmpty()) {
                front = rear = 0;
                return 0;
            }
            else {
                rear++;
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
            return list.get(front);
        }
    }

    public T poll() {
        if (isEmpty()) {
            return null;
        }   else {
            T data = peek();
            front++;
            return data;
        }
    }
}