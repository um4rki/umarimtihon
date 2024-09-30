package lesson11;

import java.util.*;

/**
 * Created by: Umar
 * DateTime: 8/26/2024 2:55 PM
 */
public class DoubleLinkedList<E> implements Iterable<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public DoubleLinkedList(int size) {
        this.size = size;
    }

    public DoubleLinkedList() {
    }


    public boolean add(E element) {
        var last = tail;
        var newNode = new Node<E>(element);
        tail = newNode;
        if (head == null) {
            head = newNode;
        } else {
            last.next = newNode;
            newNode.prev = last;
        }
        size++;
        return true;
    }

    public E getIndex(int index) {
        Objects.checkIndex(index, size);
        if (index == 0) return head.value;
        Node<E> current = null;
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.value;
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
            return current.value;
        }
    }

    public int getElement(E element) {
        Node<E> current = head;
        int index = 0;
        while (current != null) {
            if (current.value == element) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }


    public boolean removeIndex(int index) {
        Objects.checkIndex(index, size);
        if (index == 0) {
            head = head.next;
            size--;
            return true;
        }
        Node<E> current = null;
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }
        size--;
        current.prev.next = current.next;
        tail = current.prev;
        return true;
    }


    public boolean removeElement(E element) {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }

        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (current.value.equals(element)) {
                removeIndex(i);
            }
            current = current.next;
        }
        return true;
    }


    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        this.forEach(lang -> sj.add(String.valueOf(lang)));
        return sj.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private Node<E> current = head;
            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                E element = current.value;
                current = current.next;
                return element;
            }
        };
    }


    private static class Node<T> {
        T value;
        Node<T> next;
        Node<T> prev;

        Node(T value) {
            this.value = value;
        }

        public Node(T value, Node<T> next, Node<T> prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(9);

        System.out.println("list = " + list);
//        System.out.println("list.get(3) = " + list.get(1));
//        System.out.println("list.getElement(4) = " + list.getByValue(3));

//        System.out.println("list.removeIndex = " + list.removeIndex(5));
//        System.out.println("list = " + list);
//        System.out.println("list.removeIndex(4) = " + list.removeIndex(4));
//        list.removeElement(4);
//        list.removeIndex(3);
//        System.out.println("list = " + list);

//        System.out.println("list.getElement = " + list.getElement(9));

        System.out.println("list.removeIndex(5) = " + list.removeIndex(5));
        System.out.println("list = " + list);
        System.out.println("list.removeIndex(4) = " + list.removeIndex(4));
        System.out.println("list = " + list);
    }
}
