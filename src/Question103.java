import common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Question103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root != null)
            stack.push(root);
        while (!stack.isEmpty()) {
            Stack<TreeNode> newStack = new Stack<>();
            List<Integer> levelResult = new ArrayList<>();
            while (!stack.isEmpty()) {
                TreeNode node = stack.pop();
                levelResult.add(node.val);
                if (result.size() % 2 == 0) {
                    if (node.left != null)
                        newStack.push(node.left);
                    if (node.right != null)
                        newStack.push(node.right);
                } else {
                    if (node.right != null)
                        newStack.push(node.right);
                    if (node.left != null)
                        newStack.push(node.left);
                }
            }
            stack = newStack;
            if (!levelResult.isEmpty())
                result.add(levelResult);
        }
        return result;
    }
}
