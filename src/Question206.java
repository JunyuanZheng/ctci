import common.ListNode;

public class Question206 {
    /*
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode end = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return end;
    }
    */

    public ListNode reverseList(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode ptr = head;
        while (ptr != null && ptr.next != null) {
            ListNode next = ptr.next;
            ptr.next = next.next;
            ListNode tmp = dummy.next;
            dummy.next = next;
            next.next = tmp;
        }

        return dummy.next;
    }
}
