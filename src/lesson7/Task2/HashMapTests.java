package lesson7.Task2;

import java.util.HashMap;

/**
 * Created by: Umar
 * DateTime: 8/18/2024 3:46 PM
 */
public class HashMapTests<K,V> {
    public static void main(String[] args) {
        HashMap<Integer , String> hm = new HashMap<>();
        hm.put(1, "one");
        hm.put(2, "two");
        hm.put(3, "three");

        System.out.println("hm = " + hm);

        hm.remove(2);

    }
}
