public class Question117 {
    private class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val,Node _left,Node _right,Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    public Node connect(Node root) {
        if (root == null)
            return null;
        Node start = root;
        while (start != null) {
            Node cur = start;
            start = getLeftMostChildNode(start);
            while (cur != null) {
                if (cur.left != null)
                    cur.left.next = fineNext(cur, cur.left);
                if (cur.right != null)
                    cur.right.next = fineNext(cur.next, cur.right);
                cur = cur.next;
            }
        }
        return root;
    }

    private Node getLeftMostChildNode(Node node) {
        Node cur = node;
        while (cur != null && cur.left == null && cur.right == null)
            cur = cur.next;
        if (cur == null)
            return null;
        if (cur.left != null)
            return cur.left;
        else
            return cur.right;
    }

    private Node fineNext(Node node, Node exclude) {
        while (node != null) {
            if (node.left != null && node.left != exclude)
                return node.left;
            else if (node.right != null && node.right != exclude)
                return node.right;
            else
                node = node.next;
        }
        return null;
    }
}
