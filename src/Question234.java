import common.ListNode;

public class Question234 {
    private ListNode reverse(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null)
            return true;
        ListNode p1 = head;
        ListNode p2 = head;
        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }
        if (p2 != null)
            p2 = p1.next;
        else
            p2 = p1;
        p2 = reverse(p2);
        p1 = head;
        while (p2 != null) {
            if (p2.val != p1.val) {
                return false;
            }
            p2 = p2.next;
            p1 = p1.next;
        }
        return true;
    }
}
