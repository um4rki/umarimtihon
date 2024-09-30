package lesson5.Task4;

public class Task4LeetCode {
    public ListNode middleNode(ListNode head) {
        int size = 1;
        ListNode current  = head;

        while (current.next != null) {
            current = current.next;
            size++;
        }

        for (int i = 0; i < size/2; i++) {
            head = head.next;
        }

        return head;

    }
}
