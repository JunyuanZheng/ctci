import common.TreeNode;

import java.util.Stack;

public class Question230 {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        if (root != null) {
            stack.push(root);
            root = root.left;
        }
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            TreeNode tmp = stack.pop();
            k -= 1;
            if (k == 0)
                return tmp.val;
            root = tmp.right;
        }
        return -1;
    }
}
