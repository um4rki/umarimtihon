package lesson6.Task2;

import java.util.Arrays;
import java.util.Comparator;

public class PriorityQueue<E>{
    private Object[] elements;
    private int size;
    private Comparator<E> comparator;

    public PriorityQueue(int size) {
        this(size , null);
    }

    public PriorityQueue(int size, Comparator<E> comparator) {
        this.elements = new Object[size];
        this.size = size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == elements.length;
    }

    public boolean offer(E element){
        if(isFull())
            throw new RuntimeException("Queue is full");

        int i;
        for (i = size - 1; i >= 0; i--) {
            if(comparator != null){
                if(comparator.compare((E) elements[i], element) > 0){
                    elements[i+1] = elements[i];
                }else {
                    break;
                }
            }else {
                Comparable<? super E> c = (Comparable<? super E>) elements[i];
                if(c.compareTo(element) > 0){
                    elements[i+1] = element;
                }else {
                    break;
                }
            }
        }
        elements[i+1] = element;
        size++;
        return true;
    }

    public boolean poll(){
        if(isEmpty())
            throw new RuntimeException("Queue is empty");

        elements[0] = null;
        for(int i = 0; i < size - 1; i++) {
            elements[i] = elements[i+1];
        }
        elements[size - 1] = null;
        size--;

        return true;
    }

    public E peek(){
        if(isEmpty())
            throw new RuntimeException("Queue is empty");

        return (E) elements[0];
    }

    @Override
    public String toString() {
        return "PriorityQueue{" +
                "elements=" + Arrays.toString(Arrays.copyOf(elements,size)) +
                '}';
    }
}


