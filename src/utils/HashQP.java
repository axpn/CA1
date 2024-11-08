package utils;


public class HashQP<E> {
    private Object[] hashTable;

    public HashQP(int M) {
        hashTable = new Object[M];
    }

    public void displayHashTable() {
        System.out.println("Hash Table (using Linear Probing)\n======================");
        for (int i = 0; i < hashTable.length; i++)
            System.out.println(i + ". " + hashTable[i]);
    }

    public int hashFunction(int key) {
        return key % hashTable.length;
    }

    public int add(E item) {
        int key = item.hashCode();
        int home = hashFunction(key), loc = home;
        do {
            if (hashTable[loc] == null)
            {
                hashTable[loc] = item;
                return loc;
            } else { //Collision resolution
                int i = 1;
                loc = (loc + i ^ 2) % hashTable.length; //Probe ahead by 1 with wraparound
                System.out.println("Collision.  Probing location " + loc + "...");
                i++;
            }

        } while (loc != home); //While not returned to original home (i.e. hash table is full)
        return -1; //Hash table is full
    }

    public int search(E item) {
        int key = item.hashCode();
        int loc = hashFunction(key);
        int i = 0;

        while (hashTable[(loc + i ^ 2) % hashTable.length] != null) {
            if (hashTable[(loc + i ^ 2) % hashTable.length] == item) {
                return loc;
            }
            i++;
        }
        return -1;
    }

    public int remove(E item) {
        int loc = search(item);
        if (loc != -1) {
            hashTable[loc] = 0;
            return loc;
        }
        return -1;
    }

}