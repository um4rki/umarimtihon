package lesson6.Task2;

import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>(10);
        priorityQueue.offer(new Student("Jack", 10));
        priorityQueue.offer(new Student("Jack", 20));
        priorityQueue.offer(new Student("Jack", 30));
        priorityQueue.offer(new Student("Jack", 40));

        System.out.println(priorityQueue);
    }
}
