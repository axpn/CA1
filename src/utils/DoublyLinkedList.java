package utils;
public class DoublyLinkedList<E> {
public class LinkedList<E> {

import java.util.Iterator;


public class DoublyLinkedList<E> implements Iterable<E> {


    // Fields for head, tail, and size
    Node<E> head;
    Node<E> tail;
    int size;

    // Constructor
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }


    public  void addNode(E data) {

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

    public void addLinkedList(DoublyLinkedList<E> list) {
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
        }
        if (current.prev == null) {
            head = current.next;
        } else {
            current.prev.next = current.next;
        }
        size--;
    }

    public void removeLinkedList(DoublyLinkedList<E> list) {
        if (list == null) {
            return;
        }
        if (list.head.prev == null) {
            head = list.tail.next;
        } else {
            list.head.prev.next = list.tail.next;
        }
    }

    public void loop() {
        for (Node<E> p = head; p != null; p = p.next) {
            System.out.println(p.data);
        }
    }

    //返回新链表中所有节点的 data 值
    public DoublyLinkedList<E> values() {
        DoublyLinkedList<E> values = new DoublyLinkedList<>();
        Node<E> current = head;
        while (current != null) {
            values.addNode(current.data);  // Add each node's data to the list
            current = current.next;    // Move to the next node
        }
        return values;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new DoublyLinkedListIterator();
    }

    private class DoublyLinkedListIterator implements Iterator<E> {
        private Node<E> current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            E data = current.data;
            current = current.next;
            return data;
        }
    }


}
