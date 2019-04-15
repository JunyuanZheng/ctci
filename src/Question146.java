import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Question146 {
    public static class LRUCache {
        private class Node {
            int key, value;
            Node prev, next;

            Node(int k, int v) {
                this.key = k;
                this.value = v;
            }

            Node() {
                this(0, 0);
            }
        }

        int count, capacity;
        HashMap<Integer, Node> map;
        Node head, tail;

        public LRUCache(int capacity) {
            this.map = new HashMap<>();
            this.capacity = capacity;
            this.count = 0;
            map = new HashMap<>();
            head = new Node();
            tail = new Node();
            head.prev = tail;
            head.next = tail;
            tail.next = head;
            tail.prev = head;
        }

        public int get(int key) {
            if (!map.containsKey(key))
                return -1;
            Node node = map.get(key);
            update(node);
            return node.value;
        }

        public void put(int key, int value) {
            Node node = map.get(key);
            if (node == null) {
                node = new Node(key, value);
                add(node);
                count += 1;
            } else {
                node.value = value;
                update(node);
            }
            if (count > capacity) {
                remove(tail.prev);
                count -= 1;
            }
        }

        private void remove(Node node) {
            Node next = node.next;
            Node pre = node.prev;
            next.prev = pre;
            pre.next = next;
            map.remove(node.key);
        }

        private void add(Node node) {
            Node next = head.next;
            head.next = node;
            node.prev = head;
            node.next = next;
            next.prev = node;
            map.put(node.key, node);
        }

        private void update(Node node) {
            remove(node);
            add(node);
        }
    }
}
