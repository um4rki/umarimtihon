package lesson3.homework_1;

import java.util.ArrayList;
import java.util.Random;

public class ArraysList{
    public static void main(String[] args) {

        var list = new ArrayList<Integer>();

        for (int i = 0; i < 30; i++) {
            list.add(new Random().nextInt(0,100));
        }

        System.out.println("listning umumiy ko'rinishi ----> " + list);
        System.out.println("index bo'yicha chiqarish ---> " + list.get(5));
        System.out.println("list.remove(new Random().nextInt(0,100)) = " + list.remove(new Random().nextInt(0, 30)));
        System.out.println("listning oxirgi ko'rinishi ---> " + list);
    }
}
