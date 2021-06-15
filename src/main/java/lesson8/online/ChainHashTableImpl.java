package lesson8.online;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ChainHashTableImpl<K, V> implements HashTable<K, V> {

    static class Item<K, V> implements Entry<K, V> {

        private final K key;
        private V value;

        public Item(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }

    }

    private final List<Item<K, V>>[] data;
    private int size;

    public ChainHashTableImpl(int initialCapacity) {
        this.data = new List[initialCapacity];
        initBuckets(data);
    }

    private void initBuckets(List<Item<K, V>>[] data) {
        for (int i = 0; i < data.length; i++) {
            data[i] = new LinkedList<>();
        }
    }

    private int hashFunc(K key) {
        return key.hashCode() % data.length;
    }

    @Override
    public boolean put(K key, V value) {
        int index = hashFunc(key);
        List<Item<K, V>> bucket = data[index];

        if (bucket.isEmpty()) {
            bucket.add(new Item<>(key, value));
            size++;
            return true;
        } else {
            for (Item<K, V> item : bucket) {
                if (item.getKey().equals(key)) {
                    item.setValue(value);
                    return true;
                }
            }
        }

        bucket.add(new Item<>(key, value));
        size++;
        return true;
    }

    @Override
    public V get(K key) {
        int index = hashFunc(key);
        List<Item<K, V>> bucket = data[index];

        for (Item<K, V> item : bucket) {
            if (item.getKey().equals(key)) {
                return item.getValue();
            }
        }
        return null;
    }

    @Override
    public V remove(K key) {
        int index = hashFunc(key);
        List<Item<K, V>> bucket = data[index];

        if (bucket.isEmpty()) {
            return null;
        }

        for (Item<K, V> item : bucket) {
            if (item.getKey().equals(key)) {
                V value = item.getValue();
                bucket.remove(item);
                size--;
                return value;
            }
        }

        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size != 0;
    }

    @Override
    public void display() {
        System.out.println("----------");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%d = ", i);
            System.out.println(Arrays.toString(data[i].toArray()));
        }
        System.out.println("----------");
    }
}
