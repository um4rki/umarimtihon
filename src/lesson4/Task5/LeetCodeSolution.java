package lesson4.Task5;

public class LeetCodeSolution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        while (current != null ) {
            if (current.next.val == val) {
                    current.next = current.next.next;
            }else {
                current = current.next;
            }
        }

        return dummy.next;
    }
}
