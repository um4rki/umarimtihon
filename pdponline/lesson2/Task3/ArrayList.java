package lesson2.Task3;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * Created by: Umar
 * DateTime: 8/20/2024 5:49 PM
 */
public class ArrayList <E>{
    Object[] elements;
    int size = 0;

    public ArrayList(int capacity){
        elements = new Object[capacity];
    }

    public ArrayList(){
        this(10);
    }

    public void add(E e){
        if(size == elements.length){
            getGrow();
        }
        elements[size++] = e;
    }


    @SuppressWarnings("unchecked")
    public E remove(int index){
        if(index < 0 || index >= size){
            return null;
        }
        E e= (E) elements[index];
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        size--;

        return e;
    }

    @SuppressWarnings("unchecked")
    public E get(int index){
        if(index < 0 || index >= size){
            return null;
        }

        return (E) elements[index];
    }

    public int size(){
        return size;
    }

    public void clear(){
        size = 0;
        elements = new Object[size];
    }

    public boolean isEmpty(){
        return size == 0;
    }


    private void getGrow() {
        elements = Arrays.copyOf(elements, elements.length * 2);
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(", ","{","}");
        for (Object element : elements) {
            if(element != null){
                sj.add(element.toString());
            }
        }
        return sj.toString();
    }
}
