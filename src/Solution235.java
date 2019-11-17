public class Solution235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        TreeNode tmp;
        if (p.val > q.val) {
            tmp = p;
            p = q;
            q = tmp;
        }
        if(p.val<=root.val&&root.val<=q.val)
            return root;
        if (root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        return lowestCommonAncestor(root.right, p, q);

    }
}