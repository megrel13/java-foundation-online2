package homework.LinkedList;

public class MyLinkedList {
    private Node head;

    public int size() {
        if (head == null) return 0;

        int size = 1;
        Node curNode = head;
        while (curNode.getNext() != null) {
            curNode = curNode.getNext();
            size++;
        }
        return size;
    }

    public boolean isEmpty() {
        if (head != null) {
            return false;
        } else {
            return true;
        }
    }

    public boolean contains(Object o) {
        Node i;
        for (i = head; i != null; i = i.getNext()) {
            if (i.getValue().equals(o)) {
                return true;
            }
        }
        return false;
    }

    public boolean add(Object o) {
        Node resNode = new Node(o, null);
        if (head == null) {
            head = resNode;
        } else {
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(resNode);
        }
        return true;
    }
}
