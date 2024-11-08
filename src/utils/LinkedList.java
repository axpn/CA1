package utils;
import java.util.*;
public class LinkedList<E> implements Iterable<E>{



    // Fields for head, tail, and size
     Node<E> head;
     Node<E> tail;
     int size;

    // Constructor
    public  LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public  void addNode(E data) {
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

    public  Node<E> findNode(E data) {
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

    public void removeLinkedList(LinkedList<E> list) {
        if (list == null) {
            return;
        }
        if (list.head.prev == null) {
            head=list.tail.next ;
        } else {
            list.head.prev.next = list.tail.next;
        }
    }

    public void loop() {
        for (Node<E> p = head; p != null; p = p.next) {
            System.out.println(p.data);
        }
    }



    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<E> {
        private Node<E> current = head;

        @Override
        public boolean hasNext() {// Implementation here
            return current != null;
        }

        @Override
        public E next() {// Implementation here
            E data = current.data;
            current = current.next;
            return data;
        }
    }
}
