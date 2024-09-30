package lesson2.Generics.Homework_4;

public class Check {

    public static void main(String[] args) {
        MyDynamicArray dynamicArray = new MyDynamicArray();

        dynamicArray.add(3);
        dynamicArray.add(15);
        dynamicArray.add(20);
        dynamicArray.add(20);
        dynamicArray.add(230);
        dynamicArray.add(20);
        dynamicArray.add(20);
        dynamicArray.add(220);

        System.out.println("Array " + dynamicArray);

        dynamicArray.remove(2);
        System.out.println("Index orqali o'chirish->>>" + dynamicArray);

        dynamicArray.remove(Integer.valueOf(20));
        System.out.println("Value orqali o'chirish->>>" + dynamicArray);

        System.out.println("Indeks orqali qiymatni olib berish->>>" + dynamicArray.get(1));

        System.out.println("Max->>> " + dynamicArray.max());

        System.out.println("Min->>>" + dynamicArray.min());
        System.out.println("Sum->>> " + dynamicArray.summa());

        System.out.println("Arrayning uzunligini korsatish->>> " + dynamicArray.length()); }
}
