package utils;

import utils.LinkedList;

public class HashTable<E> {
    private LinkedList<E>[] hashTable;
    private int size;

    public HashTable(int size) {
        this.size = size;
        hashTable = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            hashTable[i] = new LinkedList<>();
        }
    }

}
