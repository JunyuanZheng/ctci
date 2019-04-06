import common.ListNode;

public class C2Q4 {
    public ListNode partition(ListNode head, int x) {
        ListNode d1 = new ListNode(0);
        ListNode d2 = new ListNode(0);
        ListNode p1 = d1;
        ListNode p2 = d2;
        while (head != null) {
            ListNode next = head.next;
            head.next = null;
            if (head.val < x) {
                p1.next = head;
                p1 = p1.next;
            } else {
                p2.next = head;
                p2 = p2.next;
            }
            head = next;
        }
        p1.next = d2.next;
        return d1.next;
    }
}
