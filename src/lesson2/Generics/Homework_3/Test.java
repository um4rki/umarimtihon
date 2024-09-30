package lesson2.Generics.Homework_3;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Nok");
        list.add("Behi");
        list.add("Tarvuz");

        System.out.println("List size after additions: " + list.size());
        System.out.println("Element at index 1: " + list.get(1));

        list.remove(1);
        System.out.println("List size after removal: " + list.size());
        System.out.println("Element at index 1: " + list.get(1));

        list.clear();
        System.out.println("List size after clearing: " + list.size());
        System.out.println("list empty? " + list.isEmpty());
    }
}

