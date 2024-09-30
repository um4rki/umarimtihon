package Task1;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * Created by: Umar
 * DateTime: 8/28/2024 7:08 PM
 */
public class MyDynamicArray<E> {
    private Object[] elements;
    private int elementCount;
    private static final int DEFAULT_CAPACITY = 10;

    public MyDynamicArray(int size) {
        this.elements= new Object[size];
    }


    public MyDynamicArray() {
        this(DEFAULT_CAPACITY);
    }


    public boolean add(E element) {
        elements[elementCount++] = element;
        if (elementCount == elements.length*0.75) {
            getGrow();
        }
        return true;
    }


    public boolean removeIndex(int index) {
        Objects.checkIndex(index, elementCount);

        for (int i = index; i < elementCount; i++) {
            elements[i] = elements[i+1];
        }
        elementCount--;
        return true;
    }

    public boolean removeElement(E element) {
        if(elementCount==0) {
            throw new NoSuchElementException("No element found");
        }
        for (int i = 0; i < elements.length-1; i++) {
            if (Objects.equals(elements[i], element)) {
                removeIndex(i);
            }
        }
        return true;
    }


    @SuppressWarnings("unchecked")
    public E getIndex(int index) {
        Objects.checkIndex(index, elementCount);
        E element = (E) elements[index];
        return element;
    }

    @SuppressWarnings("unchecked")
    public int getElement(E element) {
        for (int i = 0; i < elementCount; i++) {
            if (Objects.equals(elements[i], element)) {
                return i;
            }
        }
        return 0;
    }


    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(", ","{","}");
        for (int i = 0; i < elementCount; i++) {
            if(elements[i] != null) {
                sj.add(elements[i].toString());
            }
        }
        return sj.toString();
    }

    private void getGrow() {
        int newCapacity = elementCount*2;
        elements = new Object[newCapacity];
    }


    public static void main(String[] args) {
        /*MyDynamicArray<Integer> myDynamicArray = new MyDynamicArray<Integer>(5);
        myDynamicArray.add(1);
        myDynamicArray.add(4);
        myDynamicArray.add(3);
        myDynamicArray.add(2);

        System.out.println("myDynamicArray = " + myDynamicArray.toString());

        System.out.println("myDynamicArray.removeIndex(2) = " + myDynamicArray.removeIndex(3));
        System.out.println("myDynamicArray = " + myDynamicArray);*/


        MyDynamicArray<String> myDynamicArray = new MyDynamicArray<>(5);
        myDynamicArray.add("Hello");
        myDynamicArray.add("World");
        myDynamicArray.add("test");
        myDynamicArray.add("pdp");
        System.out.println(myDynamicArray);

        System.out.println("myDynamicArray.removeElement(\"test\") = " + myDynamicArray.removeElement("Hello"));
        myDynamicArray.removeElement("pdp");

        System.out.println("myDynamicArray.getIndex(2) = " + myDynamicArray.getIndex(3));
        System.out.println("myDynamicArray.getElement(\"Hello\") = " + myDynamicArray.getElement("Hello"));
        System.out.println("myDynamicArray.getElement(\"pdp\") = " + myDynamicArray.getElement("pdp"));
        System.out.println(myDynamicArray);

    }

}
