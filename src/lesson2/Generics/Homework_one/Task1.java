package lesson2.Generics.Homework_one;

public class Task1 {

    public static <E extends Comparable> int compare(E element_1 , E element_2){
        return element_1.compareTo(element_2);
    }

    static class Test{
        public static void main(String[] args) {
            int result1 = compare(20,10);
            System.out.println(result1);
            System.out.println("✅✅✅✅✅");
            int result2 = compare("Pdp","Uzb");
            System.out.println(result2);
        }
    }
}
