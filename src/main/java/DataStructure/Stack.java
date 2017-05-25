package DataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by oeno on 2017. 4. 16..
 */
public class Stack<T extends Object> {
    private int top;
    private List<T> list;

    public Stack(int size, T data) {
        list = new ArrayList();
        list.add(data);
        top = 0;
    }

    public boolean isEmpty() {
        if (list.size() == 0)
            return true;
        else
            return false;
    }

    public void push(T data) {
        try {
            list.add(data);
            this.top++;
        } catch (StackOverflowError e1) {
            e1.printStackTrace();
        } catch (IndexOutOfBoundsException e2) {
            e2.printStackTrace();
        }
    }

    public T peek() {
        if (isEmpty()) {

            throw new NullPointerException();
        } else {
            return list.get(top);
        }
    }

    public T pop() {
        if (isEmpty()) {
            throw new NullPointerException();
        } else {
            return list.get(top--);
        }
    }

    public void clear() {
        list.clear();
    }

}
