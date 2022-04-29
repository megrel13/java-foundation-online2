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

    private void checkIndex(int index) {
        if (!isCorrectIndex(index)) {
            throw new ArrayIndexOutOfBoundsException("Некорректный индекс");
        }
    }

    public Object remove(int index) {
        checkIndex(index);// проверяем корректный индекс или нет и если он корректный, значит 1 элемент есть и это head
        if (index == 0) {// если индекс = 0, удаляем head
            Object resValue = head.getValue();
            if (head.getNext() == null) { // если есть только head, присваиваем null
                head = null;
            } else {
                head = head.getNext(); // если нет, то передвиганм ссылку head на след. элемент и рассматриваем только ее
            }
            return resValue;
        }
        // если мы не вернули ничего, значит есть минимум 2 элемента
        Node curNode = head; // элемент который хотим удалить
        Node prevNode = head; // предыдущий элемент
        int count = 0;
        while ((curNode = curNode.getNext()) != null) { // теперь curNode.getNext переместили и он равен строке2
            count++;// пробегаемся по листу
            if (count == index) { // проверка на выход
                break;
            }
            prevNode = prevNode.getNext();//если мы не вышли, то перемещаем prevNode
        }
        if (curNode == null) return null;
        Object resValue = curNode.getValue();

        if (curNode.getNext() == null) { // если хотим удалить элемент с конца (строка3)
            prevNode.setNext(null); // предыдущему эл-ту (строка2) присваиваем null
        } else { // если это не последний ->
            prevNode.setNext(curNode.getNext()); // если хотим удалить посередине, нужно перекинуть ссылку и (строка2) присвоить null
            // prevNode(строка1).setnext (ссылка) curNode.getNext (строка3)
            curNode.setNext(null);// у текущего элемента делем ссылку null
        }
        return resValue;
    }

    public int indexOf(Object o) {
        if (isEmpty()) {
            return -1;
        }
        Node curNode = head;
        int i = -1;
        while (curNode != null) {
            i++;
            if (curNode.getValue().equals(o)) {
                return i;
            }
            curNode = curNode.getNext();
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        if (isEmpty()) {
            return -1;
        }
        Node curNode = head;
        int i = -1, index = -1;
        while (curNode != null) {
            i++;
            if (curNode.getValue().equals(o)) {
                return i;
            }
            curNode = curNode.getNext();
        }
        return index;
    }

}

