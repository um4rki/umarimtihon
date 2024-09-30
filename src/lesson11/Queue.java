package lesson11;


import java.util.StringJoiner;

/**
 * Created by: Umar
 * DateTime: 8/27/2024 3:31 PM
 */
public class Queue<E> {

    private Object[] elements;
    private int elementCount;
    private static final int DEFAULT_CAPACITY = 10;

    public Queue(int capacity) {
        this.elements = new Object[capacity];
    }

    public Queue() {
        this(DEFAULT_CAPACITY);
    }

    private boolean isFull(){
        return elementCount == elements.length;
    }

    private boolean isEmpty(){
        return elementCount == 0;
    }


    public boolean enqueue(E element) {
        if(isFull()){
            throw new RuntimeException("Queue is full");
        }
        elements[elementCount++] = element;
        return true;
    }

    @SuppressWarnings("unchecked")
    public E dequeue() {
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }

        E el = (E) elements[0];
        for(int i = 0; i < elementCount; i++){
            elements[i] = elements[i + 1];
        }
        elementCount--;
        return el;
    }

    @SuppressWarnings("unchecked")
    public E peek(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        E vl = (E) elements[0];
        return vl;
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(", ", "{", "}");
        for(int i = 0; i < elementCount; i++){
            if(elements[i] != null){
                sj.add(elements[i].toString());
            }
        }
        return sj.toString();
    }


    public static void main(String[] args) {
        Queue<String> queue = new Queue<String>();
        queue.enqueue("salom");
        queue.enqueue("men");
        queue.enqueue("kecha");
        queue.enqueue("pdp");
        queue.enqueue("exam");
        queue.enqueue("bugun");
        System.out.println(queue);

        System.out.println("queue.peek() = " + queue.peek());
        queue.dequeue();
        System.out.println(queue);
    }
}
