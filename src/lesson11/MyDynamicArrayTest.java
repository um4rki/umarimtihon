package lesson11;

/**
 * Created by: Umar
 * DateTime: 8/26/2024 1:02 PM
 */
public class MyDynamicArrayTest {

    public static void main(String[] args) {
        MyDynamicArray<Integer> dynamicArray = new MyDynamicArray<>();
        dynamicArray.add(7);
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(8);
        dynamicArray.add(6);
        dynamicArray.add(3);
        dynamicArray.add(8);
        dynamicArray.add(8);
        dynamicArray.add(8);
        dynamicArray.add(8);
        dynamicArray.add(5);
        dynamicArray.add(4);

        System.out.println("dynamicArray = " + dynamicArray);

//        dynamicArray.removeIndex(8);
//        System.out.println("dynamicArray = " + dynamicArray);

//        dynamicArray.removeElement(6);
//        System.out.println("dynamicArray = " + dynamicArray);

//        System.out.println("dynamicArray.get(3) = " + dynamicArray.getIndex(3));


        dynamicArray.removeElement(8);
        System.out.println("dynamicArray = " + dynamicArray);



    }
}
