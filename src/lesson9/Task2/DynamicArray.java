package lesson9.Task2;

import java.util.Arrays;
import java.util.Objects;

/**
 * Created by: Umar
 * DateTime: 8/23/2024 1:56 PM
 */
public class DynamicArray {

    private Integer[] elementData;
    private int size;


    public DynamicArray(int initialCapacity) {
        this.elementData = new Integer[initialCapacity];
    }

    public boolean add(Integer item) {
        if (size == elementData.length) {
            getGrow();
        }
        elementData[size++] = item;
        return true;
    }

    public Integer remove(int index) {
        Objects.checkIndex(index, size);
        Integer oldValue = elementData[index];
        int newSize = size - 1;
        if (newSize > index) {
            System.arraycopy(elementData, index + 1, elementData, index, newSize - index);
        }
        elementData[size = newSize] = null;
        return oldValue;
    }

    public boolean remove(Object item) {
        int i = 0;
        found:
        {
            if (item == null) {
                for (; i < size; i++) {
                    if (elementData[i] == null) {
                        break found;
                    }
                }
            } else {
                for (; i < size; i++) {
                    if (item.equals(elementData[i])) {
                        break found;
                    }
                }
            }
            return false;
        }
        remove(i);
        return true;
    }

    private void getGrow() {
        int newCapacity = elementData.length + elementData.length / 2 + 1;
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    public Integer get(int index) {
        Objects.checkIndex(index, size);
        return elementData[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size));
    }

    public static void main(String[] args) {

        DynamicArray array = new DynamicArray(10);

        array.add(12);
        array.add(13);
        array.add(14);
        array.add(15);

        System.out.println("array = " + array);

        System.out.println("array.get(3) = " + array.get(3));
        array.remove(3);
        System.out.println("array = " + array);
    }
}
