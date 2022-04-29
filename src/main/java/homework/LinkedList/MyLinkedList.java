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

    public boolean remove(Object o) {
        if (head == null) return false;// если пустой список, ничего не возвращаем

        if (head.getValue().equals(o)) { // если совпал элемент в head, переместить указатель на след элемент
            head = head.getNext();
            return true;
        }
        if (head.getNext() == null) return false; // Провепяем есть ли дальше объект за head

        Node curNode = head;
        Node prevNode = head;

        while ((curNode = curNode.getNext()) != null) { // проверяем в curNode есть элемент или нет
            if (curNode.getValue().equals(o)) { // есди нет перемещаем curNode и prevNode дальше
                break;
            }
            prevNode = prevNode.getNext();
        }

        if (curNode == null) return false; // проверка curNode на null

        prevNode.setNext(curNode.getNext()); // если нашли элемент, делаем prevNode setNext
        curNode.setNext(null);// убираем ссылку
        return true;
    }

    public void clear() {
        head = null;
    }

    public Object get(int index) {


        if (isEmpty()) {
            return null;
        }
        if (index < 0 || index > size()) {
            return null;
        }
        int i = 0;
        Node curNode = head;
        while (curNode != null) {

            if (i == index) {
                return curNode.getValue();
            }
            curNode = curNode.getNext();
            i++;
        }
        return null;
    }

    public Object set(int index, Object element) {
        if (!isCorrectIndex(index)) {
            throw new ArrayIndexOutOfBoundsException("Некорректный индекс");
        }
        Node curNode = head;
        int i = 0;
        while (i < index) {
            curNode = curNode.getNext();
            i++;
        }
        Object prevNode = curNode.getValue();
        curNode.setValue(element);
        return prevNode;
    }

    private boolean isCorrectIndex(int index) {
        if (index > -1 && index < size()) {
            return true;
        }
        return false;
    }
}
