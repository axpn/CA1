package utils;
public class HashSC<E> {
    private SingleLinkedList<E>[] hashTable;
    private int size;

    // 构造函数，初始化哈希表
    public HashSC(int size) {
        this.size = size;
        hashTable = new SingleLinkedList[size];
        for (int i = 0; i < size; i++) {
            hashTable[i] = new SingleLinkedList<>();
        }
    }

    private int hashFunction(int key) {
        return Math.abs(key) % hashTable.length;
    }

    public int add(E item, int key) {
        int home = hashFunction(key);
        hashTable[home].add(item);
        return home;
    }

    public int add(E item) {
        int key = item.hashCode();
        return add(item, key);
    }

    public void displayHashTable() {
        for (int i = 0; i < size; i++) {
            System.out.print("Index " + i + ": ");
            if (hashTable[i].isEmpty()) {
                System.out.println("empty");
            } else {
                SingleLinkedList<E> list = hashTable[i];
                Node<E> current = list.head;

                while (current != null) {
                    System.out.print(current.data + " -> ");
                    current = current.next;
                }
                System.out.println("null");
            }
        }
    }


}