class Solution404 {
    public int sumOfLeftLeaves(TreeNode root,int flag) {
        if(root==null)
            return 0;
        if(null==root.left&&root.right==null&&flag==1)
            return root.val;
        return sumOfLeftLeaves(root.left,1)+sumOfLeftLeaves(root.right,0);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)
            return 0;
       return  sumOfLeftLeaves(root.left,1)+ sumOfLeftLeaves(root.right,0);
    }
}