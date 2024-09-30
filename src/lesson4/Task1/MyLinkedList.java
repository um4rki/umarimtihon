package lesson4.Task1;

import java.util.Objects;
import java.util.StringJoiner;

public class MyLinkedList<E> {

    private Node<E> head;
    private int size;

    public boolean add(E element) {
        Node<E> newNode = new Node<>(element); //

        if (head == null) {
            head = newNode;
            size++;
            return true;
        }

        Node<E> current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        size++;
        return true;
    }

    public E get(int index) {
        Objects.checkIndex(index, size);

        Node<E> current = head;
        while (index != 0) {
            current = current.next;
            index--;
        }

        return current.value;
    }

    public int getSize() {
        return size;
    }



    private static class Node<T> {
        T value;
        Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "[", "]");
        Node<E> current = head;
        while (current != null) {
            stringJoiner.add(String.valueOf(current.value));
            current = current.next;
        }
        return stringJoiner.toString();
    }

    public boolean insert(int index, E element) {
        Objects.requireNonNull(element);
        Node<E> newNode = new Node<>(element);
        Node<E> current = head;
        while (index != 0) {
            current = current.next;
        }
        current.next = newNode;
        size++;
        return true;
    }

    public void removeIndex(int index) {
        Objects.checkIndex(index, size);
        Node<E> current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
    }

    public void removeElement(E element) {
        Node<E> current = head;
        while (current.next != null) {
            current.next = current.next.next;
        }
        current.next = null;
    }



}

class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);

        System.out.println(linkedList.getSize());
        System.out.println("linkedList.get(2) = " + linkedList.get(2));
        System.out.println(linkedList);
//        linkedList.set(2, 40);

       /* linkedList.removeIndex(3);
        System.out.println(linkedList);*/
        /*linkedList.removeElement(20);
        System.out.println(linkedList);*/

        linkedList.insert(2,50);
        System.out.println(linkedList);
    }
}

