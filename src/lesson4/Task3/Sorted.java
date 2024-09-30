package lesson4.Task3;

public class Sorted {
    public ListNode1 mergeTwoLists(ListNode1 list1, ListNode1 list2) {
        ListNode1 curr = list1;
        ListNode1 next = list2;

        ListNode1 prev = list1;
        while (curr != null) {
            next = curr.next;
        }
        return prev;
    }
}
