package lesson4.Task6;

import lesson4.Task5.ListNode;

public class Class {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        ListNode prev = null;
        int length = 0;
        while (fast != null) {
            if (slow == fast) {
                return true;
            }
            prev = slow;

        }
        return false;
    }
}
