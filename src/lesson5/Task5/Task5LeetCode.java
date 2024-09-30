package lesson5.Task5;

import lesson5.Task5.ListNode;

public class Task5LeetCode {
    public boolean isPalindrome(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        if(head == null || head.next == null){
            return true;
        }

        while (current != null) {
            ListNode next  = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        while (prev != null) {
            if (prev.val != current.val) return false;
            prev = prev.next;
        }
        return true;
    }
}
