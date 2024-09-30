package lesson2.Task3;

/**
 * Created by: Umar
 * DateTime: 8/20/2024 5:54 PM
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println("list = " + list);
        System.out.println("list.get(2) = " + list.get(2));
        System.out.println("list = " + list);
        System.out.println("list.remove(2) = " + list.remove(1));
        System.out.println("list = " + list);
        list.clear();
        System.out.println("list = " + list);
    }
}
