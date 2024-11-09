package utils;

public class HashSC<E> {
    private DoublyLinkedList<E>[] hashTable;
    private int size;

    // 构造函数，初始化哈希表
    public HashSC(int size) {
        this.size = size;
        hashTable = new DoublyLinkedList[size];
        for (int i = 0; i < size; i++) {
            hashTable[i] = new DoublyLinkedList<>();
        }
    }

    private int hashFunction(int key) {
        return Math.abs(key) % hashTable.length;
    }

    public int add(DoublyLinkedList<E> list, int key) {
        int home = hashFunction(key);
        hashTable[home].addLinkedList(list);
        return home;
    }

    public int add(DoublyLinkedList<E> list) {
        int key = list.hashCode();
        return add(list, key);
    }

    public void displayHashTable() {
        for (int i = 0; i < size; i++) {
            System.out.print("Index " + i + ": ");
            if (hashTable[i].isEmpty()) {
                System.out.println("empty");
            } else {
                DoublyLinkedList<E> list = hashTable[i];
                Node<E> current = list.head;

                while (current != null) {
                    System.out.print(current.data + " -> ");
                    current = current.next;
                }
                System.out.println("null");
            }
        }
    }

    public int remove(DoublyLinkedList<E> list, int key) {
        int home = hashFunction(key);
        hashTable[home].removeLinkedList(list);
        return home;
    }

    public int remove(DoublyLinkedList<E> list) {
        int key = list.hashCode();
        return remove(list, key);
    }

    public DoublyLinkedList<E> search(E data) {

        for (DoublyLinkedList<E> list : hashTable.values()) {
            // Check if this list contains the data
            Node<E> current = (Node<E>) list.head;
            while (current != null) {
                if (current.data.equals(data)) {
                    return (DoublyLinkedList<E>) list;
                }
                current = current.next;
            }
        }
        return null;  // Return null if no list contains the data
    }

}