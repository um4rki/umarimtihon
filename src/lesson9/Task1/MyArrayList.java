package lesson9.Task1;

import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * Created by: Umar
 * DateTime: 8/21/2024 11:32 PM
 */
public class MyArrayList<E> {
    private Object[] elements;
    private int size = 0;

    public MyArrayList(Object[] elements, int size) {
        this.elements = elements;
        this.size = size;
    }

    public MyArrayList(int capacity) {
        elements = new Object[capacity];
    }

    public E add(E element) {
        if (size == elements.length) {
            Object[] newElements = new Object[elements.length * 2];
        }
        elements[size++] = element;
        return (E) element;
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) elements[index];
    }

    @SuppressWarnings("unchecked")
    public E remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        E element = (E) elements[index];
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return element;
    }
    @SuppressWarnings("unchecked")
    public E set(int index, E element) {
        if (index < 0 || index >= size) {
            return null;
        }
        E oldElement = (E) elements[index];
        elements[index] = element;
        return oldElement;
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(", " , "{" , "}");
        for (Object element : elements) {
            if (Objects.nonNull(element)) {
                sj.add(element.toString());
            }
        }
        return sj.toString();
    }

    public static void main(String[] args) {
        MyArrayList<Integer> integerMyArrayList = new MyArrayList<>(5);
        integerMyArrayList.add(1);
        integerMyArrayList.add(2);
        integerMyArrayList.add(3);
        integerMyArrayList.add(4);

        /*System.out.println("integerMyArrayList = " + integerMyArrayList);

        System.out.println("integerMyArrayList.remove(3) = " + integerMyArrayList.remove(3));
        System.out.println("integerMyArrayList = " + integerMyArrayList);*/
        /*integerMyArrayList.set(2,5);
        System.out.println(integerMyArrayList);*/

//        System.out.println("integerMyArrayList.get(2) = " + integerMyArrayList.get(2));
    }
}
