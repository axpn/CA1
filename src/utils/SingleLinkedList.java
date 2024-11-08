package utils;
public class SingleLinkedList<E> {
    Node<E> head;
    int size;
    public SingleLinkedList() {
        head = null;
        size = 0;
    }

    public void add(E data) {
        Node<E> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<E> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }


}