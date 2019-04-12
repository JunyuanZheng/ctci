import common.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Question23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;
        ListNode dummy = new ListNode(0);
        ListNode ptr = dummy;
        PriorityQueue<ListNode> pq = new PriorityQueue<>(Comparator.comparingInt(n -> n.val));
        for (ListNode node : lists) {
            if (node != null) {
                pq.add(node);
            }
        }
        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            if (node.next != null)
                pq.add(node.next);
            node.next = null;
            ptr.next = node;
            ptr = node;
        }
        return dummy.next;
    }
}
