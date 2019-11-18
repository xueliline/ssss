public class Solution965 {
    public boolean Pre(TreeNode root, int val) {
        if (root == null)
            return true;
        if (root.val != val)
            return false;
        return Pre(root.right, val)&& Pre(root.left, val);
    }
    public boolean isUnivalTree(TreeNode root) {
        if (root == null)
            return false;
        return Pre(root, root.val);
    }
}