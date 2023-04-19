public class MyLinkedList<E> implements MyList{
    private static class Node<E> {
        private final E item;
        Node<E> previous;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }
    }

    private Node<E> head;
    private Node<E> tail;
    private int size;
    /**
     * @function size возвращает длину LinkedList
     * @noparams
     * @return int
     * **/
    @Override
    public int size() {
        return this.size;
    }
    /**
     * @function contains true если Object o в LinkedList
     * @param o объект поиска
     * @return boolean
     * **/
    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (get(i) == o) {
                return true;
            }
        }
        return false;
    }
    /**
     * @function add добавляет объект в LinkedList
     * @param item объект для добавления
     * @return void
     * **/
    @Override
    public void add(Object item) {
        Node newNode = new Node(item);
        if (head == null) {
            newNode.next = null;
            newNode.previous = null;
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        size++;
    }
    /**
     * @function add добавляет объект на определенный индекс
     * @param item объект для добавления
     * @param index индекс куда нужно добавить item
     * @return void
     **/

    @Override
    public void add(Object item, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Node newNode = new Node(item);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }
    /**
     * @function remove удаляет объект из LinkedList
     * @param item объект удаления
     * @return boolean
     * **/
    @Override
    public boolean remove(Object item) {
        if (head == null) {
            return false;
        }
        if (head.item.equals(item)) {
            head = head.next;
            return true;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.item.equals(item)) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }
    /**
     * @function remove удаляет объект из LinkedList
     * @param index индекст элемента для удаления
     * @return Object
     * **/
    @Override
    public Object remove(int index) {
        if (head == null) {
            return null;
        }
        if (index == 0) {
            Node removedNode = head;
            head = head.next;
            return removedNode;
        }
        Node current = head;
        int count = 0;
        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }
        if (current == null || current.next == null) {
            return null;
        }
        Node removedNode = current.next;
        current.next = current.next.next;
        return removedNode;
    }
    /**
     * @function clear очищает LinkedList
     * @noparam
     * @return void
     * **/
    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
    /**
     * @function get возвращает объект из LinkedList под его индексом
     * @param index индекс объекта
     * @return E
     * **/

    @Override
    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.item;
    }
    /**
     * @function indexOf возвращает индекс первого вхождения объекта
     * @param o объект для поиска
     * @return int
     * **/


    @Override
    public int indexOf(Object o) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.item.equals(o)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }
    /**
     * @function lastIndexOf возвращает индекс последнего вхождения объекта в LinkedList
     * @param o объект для поиска
     * @return int
     * **/

    @Override
    public int lastIndexOf(Object o) {
        Node current = head;
        int lastIndex = -1;
        int index = 0;
        while (current != null) {
            if (current.item.equals(o)) {
                lastIndex = index;
            }
            current = current.next;
            index++;
        }
        return lastIndex;
    }
    /**
     * @function sort сортирует LinkedList (bubble sort)
     * @noparam
     * @return void
     * **/

    @Override
    public void sort() {
        if (head == null || head.next == null) {
            return;
        }
        boolean swapped;
        do {
            swapped = false;
            Node prev = null;
            Node current = head;
            Node next = head.next;
            while (next != null) {
                if (((Comparable)current.item).compareTo(next.item) > 0) {
                    if (prev != null) {
                        prev.next = next;
                    } else {
                        head = next;
                    }
                    current.next = next.next;
                    next.next = current;
                    prev = next;
                    next = current.next;
                    swapped = true;
                } else {
                    prev = current;
                    current = next;
                    next = next.next;
                }
            }
        } while (swapped);
    }
}
