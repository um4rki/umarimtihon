package lesson6.Task1;

import java.util.Arrays;

public class SimpleQueue<E> {
    private Object[] elements;
    private int elementCount=0;

    public SimpleQueue(int capacity) {
        this.elements = new Object[capacity];
    }

    public boolean enqueue(E e) {
        if(isFull())
            throw new RuntimeException("Queue is full");
        elements[elementCount] = e;
        elementCount++;
        return true;
    }

    public E dequeue() {
        if(isEmpty())
            throw new RuntimeException("Queue is empty");
        E element = (E) elements[0];

        for (int i = 0; i < elements.length - 1; i++) {
            elements[i] = elements[i+1];
        }
        elementCount--;
        return element;
    }

    public boolean isEmpty(){
        return elementCount==0;
    }

    public boolean isFull(){
        return elementCount==elements.length;
    }


    public E peek(){
        E element = (E) elements[0];
        return element;
    }


    @Override
    public String toString() {
        return "SimpleQueue{" +
                "elements=" + Arrays.toString(Arrays.copyOf(elements,elementCount)) +
                '}';
    }

    public static void main(String[] args) {

        SimpleQueue<Integer> simpleQueue = new SimpleQueue<>(10);

        simpleQueue.enqueue(1);
        simpleQueue.enqueue(2);
        simpleQueue.enqueue(3);
        simpleQueue.enqueue(9);
        simpleQueue.enqueue(4);
        simpleQueue.enqueue(5);
        simpleQueue.enqueue(6);
        simpleQueue.enqueue(7);
        simpleQueue.enqueue(8);
        simpleQueue.enqueue(9);

        System.out.println(simpleQueue);

        Integer dequeue = simpleQueue.dequeue();

        System.out.println("dequeue = " + dequeue);
        System.out.println(simpleQueue);

    }
}
