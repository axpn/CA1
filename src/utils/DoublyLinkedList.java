package utils;

public class DoublyLinkedList<E> {



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
        size--;
    }

    public void removeLinkedList(DoublyLinkedList<E> list) {
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



    
}
