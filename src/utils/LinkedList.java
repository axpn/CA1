package utils;

public class LinkedList<E> {

    private class Node<E> {
        E data;
        Node<E> next;
        Node<E> prev;

        public Node(E data) {

            this.data = data;
        }
    }

    // Fields for head, tail, and size
    private Node<E> head;
    private Node<E> tail;
    private int size;

    // Constructor
    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addNode(E data) {
        Node<E> newNode = new Node<>(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void addLinkedList(LinkedList<E> list) {
        if (list.head == null) {
            return;
        }
        if (this.tail == null) {
            this.head = list.head;
            this.tail = list.tail;
        } else {
            this.tail.next = list.head;
            list.head.prev = this.tail;
            this.tail = list.tail;
        }
    }

    public Node<E> findNode(E data) {
        Node<E> current = head;
        while (current != null) {
            if (current.data == data) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void removeNode(E data) {
        Node<E> current = findNode(data);
        if (current == null) {
            return;
        } if (current.prev == null) {
            head = current.next;
        }
        else {
            current.prev.next = current.next;
        }
    }

    public void loop() {
        for (Node<E> p = head; p != null; p = p.next) {
            System.out.println(p.data);
        }
    }

}
