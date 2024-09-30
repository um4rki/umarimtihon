package Task3;

import org.w3c.dom.Node;

import java.util.*;

/**
 * Created by: Umar
 * DateTime: 8/28/2024 8:30 PM
 */
public class MyCustomQueue<E> {
    private int elementCount = 0;
    private Object[] elementData;
    private static final int DEFAULT_CAPACITY = 10;



    public MyCustomQueue(int size) {
        this.elementData = new Object[size];
    }

    public MyCustomQueue() {
        this(DEFAULT_CAPACITY);
    }

    private boolean isEmpty() {
        return elementCount == 0;
    }

    private boolean isFull(){
        return elementCount == elementData.length;
    }

    public boolean enqueue(E element) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
        elementData[elementCount++] = element;
        return true;
    }

    @SuppressWarnings("unchecked")
    public E dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        E element = (E) elementData[0];
        for (int i = 0; i < elementCount; i++) {
            elementData[i] = elementData[i + 1];
        }
        elementCount--;
        return element;
    }

    @SuppressWarnings("unchecked")
    public E peek(){
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        E elementOne = (E) elementData[0];
        return elementOne;
    }


    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(", ","[","]");
        for (int i = 0; i < elementCount; i++) {
            if (elementData[i] != null) {
                sj.add(elementData[i].toString());
            }
        }
        return sj.toString();
    }

    public static void main(String[] args) {
        MyCustomQueue<Integer> customQueue = new MyCustomQueue<>();
        customQueue.enqueue(2);
        customQueue.enqueue(1);
        customQueue.enqueue(3);
        customQueue.enqueue(5);
        customQueue.enqueue(4);

        System.out.println("customQueue = " + customQueue);

        System.out.println("customQueue.dequeue() = " + customQueue.dequeue());
        System.out.println("customQueue = " + customQueue);
        System.out.println("customQueue.peek() = " + customQueue.peek());

        Queue<String> queue = new Queue<String>() {
            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean offer(String s) {
                return false;
            }

            @Override
            public String remove() {
                return "";
            }

            @Override
            public String poll() {
                return "";
            }

            @Override
            public String element() {
                return "";
            }

            @Override
            public String peek() {
                return "";
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
    }

}
