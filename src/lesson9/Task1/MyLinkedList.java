package lesson9.Task1;

import org.w3c.dom.Node;

import java.util.Objects;
import java.util.StringJoiner;
import java.util.UUID;

/**
 * Created by: Umar
 * DateTime: 8/21/2024 11:53 PM
 */
public class MyLinkedList<E> {
    private Node<E> head;
    private int size;

    public MyLinkedList( int size) {
        this.size = size;
    }

    public boolean add(E element) {
        Node<E> newNode = new Node<E>(element);
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

    public boolean removeElement(E element) {
        if (head == null) {
            return false;
        }
        if (head.value.equals(element)) {
            head = head.next;
            size--;
            return true;
        }

        Node<E> current = head;
        while (current.next != null) {
            if (current.next.value.equals(element)) {
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean removeIndex(int index) {
        Objects.checkIndex(index, size);
        if (index == 0) {
            head = head.next;
        } else {
            Node<E> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
        return true;

    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        Node<E> current = head;
        while (current != null) {
            sj.add(String.valueOf(current.value));
            current = current.next;
        }
        return sj.toString();
    }

    private static class Node<T> {
        T value;
        Node<T> next;

        public Node(T value) {
            this.value = value;
        }

    }
}

class Test {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>(5);
        list.add(7);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(4);
        list.add(5);

        System.out.println(list);

    }
}