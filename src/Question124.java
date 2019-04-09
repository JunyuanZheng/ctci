import common.TreeNode;

public class Question124 {
    int result;
    public int maxPathSum(TreeNode root) {
        result = Integer.MIN_VALUE;
        helper(root);
        return result;
    }

    private int helper(TreeNode root) {
        if (root == null)
            return 0;
        int left = Math.max(0, helper(root.left));
        int right = Math.max(0, helper(root.right));
        result = Math.max(result, left + right + root.val);
        return Math.max(left, right) + root.val;
    }
}
