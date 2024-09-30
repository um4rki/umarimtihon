package lesson7.Task2;

import java.util.Objects;



/**
 * Created by: Umar
 * DateTime: 8/17/2024 11:49 PM
 */
public class MySimpleDictionary<K,V> {

    private static final int DEFAULT_CAPACITY = 10;
    private Entry<K,V>[] entries;
    private int size = 0;

    public static class Entry<K,V>{
        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return key + " => "+ value ;
        }
    }


    @SuppressWarnings("unchecked")
    public MySimpleDictionary(int capacity) {
        this.entries = new Entry[capacity];
    }

    @SuppressWarnings("unchecked")
    public MySimpleDictionary() {
        this.entries = new Entry[DEFAULT_CAPACITY];
    }



    public V put(K key, V value) {
        int hashCode = Objects.hashCode(key);
        int index = hashCode % entries.length;
        Entry<K,V> entry = new Entry<>(key, value);
        entries[index] = entry;
        size++;
        return entry.value;
    }


    public V get(K key) {
        int hashCode = Objects.hashCode(key);
        int index = hashCode % entries.length;
        return entries[index].value;
    }




}
