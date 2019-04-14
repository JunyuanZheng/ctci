import java.util.ArrayList;
import java.util.Arrays;

public class Question706 {
    private class ListNode {
        int key, val;
        ListNode next;

        ListNode(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    final int size = 1000;
    ListNode[] list;

    /** Initialize your data structure here. */
    public Question706() {
        list = new ListNode[this.size];
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        ListNode node = findNode(key);
        if (node == null) {
            ListNode newNode = new ListNode(key, value);
            int idx = getIndex(key);
            newNode.next = list[idx];
            list[idx] = newNode;
        } else {
            node.val = value;
        }
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        ListNode node = findNode(key);
        return node == null ? -1 : node.val;
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        ListNode dummy = new ListNode(0, 0);
        int idx = getIndex(key);
        ListNode head = list[idx];
        dummy.next = head;
        ListNode pre = dummy;
        while (head != null) {
            if (head.key == key) {
                pre.next = head.next;
                break;
            }
            pre = head;
            head = head.next;
        }
        list[idx] = dummy.next;
    }

    private int getIndex(int value) {
        return value % size;
    }

    private ListNode findNode(int key) {
        ListNode node = list[getIndex(key)];
        while (node != null) {
            if (node.key == key)
                return node;
            node = node.next;
        }
        return null;
    }
}
