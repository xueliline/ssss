public class Solution111 {
    public int minDepth(TreeNode root) {

        if(root==null)
            return 0;
        if (root.left==null)
            return minDepth(root.right)+1;
        if(root.right==null)
            return minDepth(root.left)+1;
        return Math.min(minDepth(root.left),minDepth(root.right))+1;

    }

    public static void main(String[] args) {
        Solution111 solution111 =new Solution111();
        TreeNode t1=new TreeNode(1);
        TreeNode t2=new TreeNode(2);
        t1.left=t2;
        int res=solution111.minDepth(t1);
        System.out.println(res);
    }
}