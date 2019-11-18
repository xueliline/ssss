public class Solution222 {
    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        return countNodes(root.right) + 1 + countNodes(root.left);
    }
}