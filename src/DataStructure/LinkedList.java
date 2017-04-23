package DataStructure;

/**
 * Created by oeno on 2017. 4. 16..
 */
public class LinkedList<T> {
    private Node head;
    private Node tail;

    public LinkedList(T data) {
        Node node = new Node(data);
        head = tail = node;
    }

    public LinkedList() {
        head = tail = null;
    }

    public int addFirst(T data) {
        try {
            Node node = new Node(data);
            node.setNext(head);
            head = node;
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }

    public int addLast(T data) {
        try {
            Node node = new Node(data);
            tail.setNext(node);
            tail = node;
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }

    public int add(int index, T data) {
        Node node = new Node(data);
        Node count = head;

        for (int i=0; i<index; i++) {
            count = count.getNext();
            if (count == null) {
                System.out.println("Index is not exist!");
                return 1;
            }
        }
        return 0;
    }
}
