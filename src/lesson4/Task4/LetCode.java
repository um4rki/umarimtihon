package lesson4.Task4;

public class LetCode {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        if (head.next == head) {
            head.next = null;
        }
        ListNode current = head;
        while (current != null) {
            while (current.next != null && current.val == current.next.val) {
                current.next = current.next.next;
            }
            current = current.next;
        }
        return head;
    }


}
