package collections.map.chaining;

import java.util.stream.IntStream;

import static java.lang.reflect.Array.newInstance;

public class HashTable<K, V> {

    private static final int MAX_MAP_SIZE = 5;

    private int size;
    private final HashItem<K, V>[] hashTable;

    public HashTable() {
        hashTable = (HashItem<K, V>[]) newInstance(HashItem.class, MAX_MAP_SIZE);
    }

    private int hash(K key) {
        return key.hashCode() % MAX_MAP_SIZE;
    }

    public void put(K key, V value) {
        int index = hash(key);
        HashItem<K, V> item = hashTable[index];
        while (item != null) {
            if (item.getKey().equals(key)) {
                item.setValue(value);
                return;
            }
            item = item.getNextHashItem();
        }
        HashItem<K, V> hashItem = new HashItem<>(key, value);
        hashItem.setNextHashItem(hashTable[index]);
        hashTable[index] = hashItem;
        size++;
    }



    public V get(K key) {
        int index = hash(key);
        HashItem<K, V> item = hashTable[index];
        while (item != null) {
            if (item.getKey().equals(key)) {
                return item.getValue();
            }
            item = item.getNextHashItem();
        }
        return null;
    }

    public V remove(K key) {
        int index = hash(key);
        HashItem<K, V> item = hashTable[index];
        HashItem<K, V> prev = null;
        while (item != null) {
            if (item.getKey().equals(key)) break;
            prev = item;
            item = item.getNextHashItem();
        }
        if (item == null) return null;
        if (prev == null) hashTable[index] = item.getNextHashItem();
        else prev.setNextHashItem(item.getNextHashItem());
        size--;
        return item.getValue();
    }

    public int getSize() {
        return size;
    }


    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1, 10).reduce(10, Integer::sum));
    }

}
