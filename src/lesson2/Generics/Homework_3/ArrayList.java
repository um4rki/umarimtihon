package lesson2.Generics.Homework_3;

import java.util.Arrays;

public class ArrayList  <E>{
    private Object[] elements;
    private int size = 0;
    private static final int DefaultCapacity = 100;

    public ArrayList() {
        elements = new Object[DefaultCapacity];
    }

    public void add(E element) {
        if (size==elements.length){
            GrowCapacity();
        }
        elements[size++] = element;
    }

    public E get(int index){
        checkIndex(index);
        return (E) elements[index];
    }

    public E remove(int index){
        checkIndex(index);
        E oldElement = (E) elements[index];
        int numMove = size - index - 1;
        if (numMove > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMove);
        }
        elements[--size] = null;
        return oldElement;
    }

    public int size() {
        return size;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    private void GrowCapacity() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }

}
