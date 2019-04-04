import common.Node;

public class Question138 {
    public Node copyRandomList(Node head) {
        if (head == null)
            return null;
        Node ptr = head;
        while (ptr != null) {
            Node tempNext = ptr.next;
            Node newNext = new Node();
            newNext.val = ptr.val;
            newNext.next = tempNext;
            ptr.next = newNext;
            ptr = tempNext;
        }
        ptr = head;
        while (ptr != null) {
            if (ptr.random != null)
                ptr.next.random = ptr.random.next;
            ptr = ptr.next.next;
        }
        Node dummy = new Node();
        ptr = head;
        Node ptrNew = dummy;
        while (ptr != null) {
            ptrNew.next = ptr.next;
            ptrNew = ptrNew.next;
            ptr.next = ptrNew.next;
            ptr = ptr.next;
        }
        return dummy.next;
    }
}
