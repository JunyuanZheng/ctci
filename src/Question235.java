import common.TreeNode;

public class Question235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || (root.val >= p.val && root.val <= q.val) || (root.val <= p.val && root.val >= q.val))
            return root;
        int min = Math.min(p.val, q.val);
        return lowestCommonAncestor(root.val < min ? root.right : root.left, p, q);
    }

}
