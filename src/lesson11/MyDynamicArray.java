package lesson11;

import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * Created by: Umar
 * DateTime: 8/26/2024 12:47 PM
 */
public class MyDynamicArray<E> {

    public static final int DEFAULT_CAPACITY = 10;
    Object[] elements;
    private int size;

    public MyDynamicArray(int capacity) {
        this.elements = new Object[capacity];
    }

    public MyDynamicArray(){
        this(DEFAULT_CAPACITY);
    }


    public E add(E element) {
        elements[size++] = element;
        if (size == elements.length*75/100) {
            grow();
        }
        return element;
    }

    @SuppressWarnings({"unchecked",})
    public E removeIndex(int index) {
        Objects.checkIndex(index, size);
        E oldElement = (E) elements[index];
        for (int i = index; i < size; i++) {
            elements[i] = elements[i+1];
        }
        size--;
        return oldElement;
    }


    public E removeElement(E element) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(elements[i], element)) {
                removeIndex(i);
            }
        }
        return element;
    }


    @SuppressWarnings("unchecked")
    public E getIndex(int index) {
        Objects.checkIndex(index, size);
        return (E) elements[index];
    }


    @SuppressWarnings("unchecked")
    public int getElement(E element){
        for (int i = 0; i < size; i++) {
            if (Objects.equals(elements[i], element)) {
                return i;
            }
        }
        return 0;
    }


    private void grow() {
        int newCapacity = elements.length*2;
        elements = Arrays.copyOf(elements, newCapacity);
    }


    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(", ","[","]");
        for (int i = 0; i < size; i++) {
            if(elements[i] != null){
                sj.add(elements[i].toString());
            }
        }
        return sj.toString();
    }
}
