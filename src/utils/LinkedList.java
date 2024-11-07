package utils;

public class LinkedList<E> {
    private class Node {
        E data;
        Node next;
        Node prev;

        public Node(E data) {
            this.data = data;
        }
    }

    // Fields for head, tail, and size
    private Node head;
    private Node tail;
    private int size;

    // Constructor
    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addNode(E data) {
        Node newNode = new Node(data);
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

    public void addLinkedList(LinkedList list) {
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
}
