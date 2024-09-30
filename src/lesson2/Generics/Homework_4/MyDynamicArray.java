package lesson2.Generics.Homework_4;

import java.util.Arrays;

public class MyDynamicArray {

    private int[] values;

    private int size;

    public MyDynamicArray() {
        values = new int[10];
    }

    public MyDynamicArray(int capacity) {
        values = new int[capacity];
    }

    // remove(int) index
    public boolean remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index-> " + index + " va Size-> " + size);
        }
        for (int i = index; i < size - 1; i++) {
            values[i] = values[i + 1];
        }
        values[--size] = 0;
        return true;
    }


    public boolean remove(Integer value){
        for (int i = 0; i < size; i++) {
            if (values[i] == value){
                remove(i);
                i=0;
            }
        }
        return true;
    }

    public int get(int index){
        if (index>=size || index< 0){
            throw new IndexOutOfBoundsException("Index-> " + index + " va Size-> " + size);
        }
        return values[index];
    }

    public int max() {
        if (size == 0){
           throw new IllegalStateException("Array bo'sh");
        }
        int maxValue = values[0];
        for (int i = 1; i < size; i++) {
            if (values[i] > maxValue) {
                maxValue = values[i];
            }
        }
        return maxValue;
    }

    public int min() {
        if (size == 0){
            throw new IllegalStateException("Array bo'sh");
        }
        int minValue = values[0];
        for (int i = 1; i < size; i++) {
            if (values[i] <  minValue) {
                minValue = values[i];
            }
        }
        return minValue;
    }

    public boolean add(int value) {

        if (values.length == size) {
            grow();
        }

        values[size++] = value;
        return true;
    }

    public int summa() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum+=values[i];
        }
        return sum;
    }

    private void grow() {

        int newCapacity = values.length * 2;
        int[] newValues = new int[newCapacity];

        System.arraycopy(values, 0, newValues, 0, size);

        values = newValues;
    }

    public int length() {
        return size;
    }

    @Override
    public String toString() {
        return  Arrays.toString(Arrays.copyOf(values, size));
    }
}
