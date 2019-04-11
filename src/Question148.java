import common.ListNode;

public class Question148 {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode pre = null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode first = head;
        ListNode second = slow;
        pre.next = null;
        first = sortList(first);
        second = sortList(second);

        ListNode dummy = new ListNode(0);
        ListNode ptr = dummy;
        while (first != null && second != null) {
            if (first.val < second.val) {
                ptr.next = first;
                first = first.next;
            } else {
                ptr.next = second;
                second = second.next;
            }
            ptr = ptr.next;
            ptr.next = null;
        }
        ptr.next = first != null ? first : second;
        return dummy.next;
    }
}
