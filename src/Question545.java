import common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Question545 {
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;
        result.add(root.val);
        left(result, root.left);
        leaf(result, root.left);
        leaf(result, root.right);
        right(result, root.right);
        return result;
    }

    private void left(List<Integer> list, TreeNode root) {
        if (root == null || (root.right == null && root.left == null))
            return;
        list.add(root.val);
        if (root.left != null)
            left(list, root.left);
        else
            left(list, root.right);
    }

    private void right(List<Integer> list, TreeNode root) {
        Stack<Integer> stack = new Stack<>();
        while (root != null) {
            if (root.left == null && root.right == null)
                break;
            stack.push(root.val);
            if (root.right != null)
                root = root.right;
            else
                root = root.left;
        }
        while (!stack.isEmpty())
            list.add(stack.pop());
    }

    private void leaf(List<Integer> list, TreeNode root) {
        if (root == null) {
            return;
        } else if (root.left == null && root.right == null) {
            list.add(root.val);
        } else {
            leaf(list, root.left);
            leaf(list, root.right);
        }
    }
}
