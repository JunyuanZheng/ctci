import common.ListNode;

public class Question2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode ptr = dummy;
        int overflow = 0;
        while (l1 != null || l2 != null) {
            int v1 = l1 != null ? l1.val : 0;
            int v2 = l2 != null ? l2.val : 0;
            ptr.next = new ListNode((v1 + v2 + overflow) % 10);
            overflow = (v1 + v2 + overflow) / 10;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
            ptr = ptr.next;
        }
        ptr.next = overflow != 0 ? new ListNode(overflow) : null;
        return dummy.next;
    }
}
