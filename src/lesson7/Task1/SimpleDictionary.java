package lesson7.Task1;

import java.util.*;

/**
 * Created by: Umar
 * DateTime: 8/17/2024 2:21 PM
 */
public class SimpleDictionary<K,V> {

    private Entry<K,V>[] entries;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public static class Entry<K,V>{
        K key;
        V value;
        Entry<K,V> next;
        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {return key + "=>" + value;}
    }

    @SuppressWarnings("unchecked")
    public SimpleDictionary(int capacity) {
        this.entries = new Entry[capacity];
    }

    @SuppressWarnings("unchecked")
    public SimpleDictionary() {
        this.entries = new Entry[DEFAULT_CAPACITY];
    }

    public boolean remove(K key) {
        int hashCode = Objects.hashCode(key);
        int index = hashCode % entries.length;
        Entry<K,V> current = entries[index];
        Entry<K,V> prev = null;

        while (current != null) {
            if(Objects.equals(current.key,key)) {
                if(prev == null){
                    entries[index] = current.next;
                }else {
                    prev.next = current.next;
                }
                size--;
                return true;
            }
            prev = current;
            current = current.next;
        }
        return false;
    }

    public Set<K> keySet() {
        Set<K> keys = new HashSet<>();

        if(entries != null){
            for(Entry<K,V> entry : entries){
                while (entry != null) {
                    keys.add(entry.key);
                    entry = entry.next;
                }
            }
        }
        return keys;
    }

    public Collection<V> values() {
        Collection<V> values = new ArrayList<>();
        if(entries != null){
            for(Entry<K,V> entry : entries){
                while (entry != null) {
                    values.add(entry.value);
                    entry = entry.next;
                }
            }
        }
        return values;
    }

    public V put(K key, V value) {

        if (size >= entries.length) {
            entries = Arrays.copyOf(entries, entries.length * 2);
        }

        int hashCode = Objects.hashCode(key);
        int index = hashCode % entries.length;

        Entry<K,V> oldEntry = entries[index];

        if (oldEntry == null) {
            entries[index] = new Entry<>(key, value);
            size++;
            return value;
        }

        if (oldEntry.key.equals(key)) {
            oldEntry.value = value;
            return value;
        }

        Entry<K,V> current = oldEntry;
        while (current.next != null) {
            current = current.next;
            if(Objects.equals(current.key,key)) {

                V oldValue = current.value;
                current.value = value;
                return oldValue;
            }

        }

        current.next = new Entry<>(key, value);
        size++;

        return value;
    }

    public V get(K key) {
        int hashCode = Objects.hashCode(key);
        int index = hashCode % entries.length;
        Entry<K,V> entry = entries[index];
        if (Objects.isNull(entry))
            return null;

        if(Objects.equals(key,entry.key))
            return entry.value;

        if (Objects.isNull(entry.next))
            return null;

        Entry<K,V> current = entry.next;

        while (Objects.nonNull(current) && !Objects.equals(key,current.key)) {
            current = current.next;
        }

        if (Objects.isNull(current))
            return null;

        return current.value;
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(", ","{","}");
        for (Entry<K,V> entry : entries) {
            if(Objects.nonNull(entry)) {
                sj.add(entry.toString());

                Entry<K,V> currentEntry = entry.next;
                while (currentEntry != null) {
                    sj.add(currentEntry.toString());
                    currentEntry = currentEntry.next;
                }
            }
        }

        return sj.toString();
    }


    public static void main(String[] args) {
        SimpleDictionary<Integer,String> simpleDictionary = new SimpleDictionary<Integer,String>(5);
        simpleDictionary.put(1, "one");
        simpleDictionary.put(2, "two");
        simpleDictionary.put(3, "three");
        simpleDictionary.put(13, "four");
        simpleDictionary.put(23, "five");
        simpleDictionary.put(33, "six");
        simpleDictionary.put(4, "six");


        System.out.println("simpleDictionary = " + simpleDictionary);

        String s = simpleDictionary.get(3);
//        System.out.println("s => " + s);

        System.out.println("simpleDictionary.remove(1,\"one\") = " + simpleDictionary.remove(13));
        System.out.println("simpleDictionary = " + simpleDictionary);


        Set<Integer> integers = simpleDictionary.keySet();
        System.out.println("integers = " + integers);


        Collection<String> values = simpleDictionary.values();
        System.out.println("values = " + values);
    }
}
