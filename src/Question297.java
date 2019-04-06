import common.TreeNode;

import java.util.*;

public class Question297 {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<String> list = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        if (root != null)
            queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i += 1) {
                TreeNode tmp = queue.poll();
                list.add(String.valueOf(tmp == null ? null : tmp.val));
                if (tmp != null) {
                    queue.add(tmp.left);
                    queue.add(tmp.right);
                }
            }
        }
        return String.join(" ", list);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals(""))
            return null;
        TreeNode root = null;
        Queue<TreeNode> queue = new ArrayDeque<>();
        String[] strings = data.split(" ");
        int idx = 0;
        if (strings.length != 0) {
            root = strings[idx].equals("null") ? null : new TreeNode(Integer.parseInt(strings[idx]));
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i += 1) {
                TreeNode tmp = queue.poll();
                String l = strings[++idx];
                String r = strings[++idx];
                TreeNode left = null;
                TreeNode right = null;
                if (!l.equals("null"))
                    left = new TreeNode(Integer.parseInt(l));
                if (!r.equals("null"))
                    right = new TreeNode(Integer.parseInt(r));
                tmp.left = left;
                tmp.right = right;
                if (left != null)
                    queue.add(left);
                if (right != null)
                    queue.add(right);
            }
        }
        return root;
    }
}
