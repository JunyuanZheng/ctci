import common.ListNode;

import java.util.Stack;

public class Question445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                s1.push(l1.val);
                l1 = l1.next;
            }
            if (l2 != null) {
                s2.push(l2.val);
                l2 = l2.next;
            }
        }
        ListNode head = null;
        int overflow = 0;
        while (!s1.isEmpty() || !s2.isEmpty()) {
            int v1 = s1.isEmpty() ? 0 : s1.pop();
            int v2 = s2.isEmpty() ? 0 : s2.pop();
            ListNode newHead = new ListNode((v1 + v2 + overflow) % 10);
            overflow = (v1 + v2 + overflow) / 10;
            newHead.next = head;
            head = newHead;
        }
        if (overflow != 0) {
            ListNode newHead = new ListNode(overflow);
            newHead.next = head;
            head = newHead;
        }
        return head;
    }
}
