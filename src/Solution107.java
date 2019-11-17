import java.util.*;

class Solution107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if(root==null)
            return  lists;

        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> l1;
        queue.add(root);
        while (!queue.isEmpty()) {
            l1 = new ArrayList<>();
            int count = queue.size();
            while (count != 0) {
                TreeNode tmp = queue.poll();
                l1.add(tmp.val);
                count--;
                if (tmp.left != null)
                    queue.add(tmp.left);
                if (tmp.right != null)
                    queue.add(tmp.right);
            }
            lists.add(0,l1);
        }
        return lists;
    }



}
//public static void main(String[] args) {
//    TreeNode t1=new TreeNode(3);
//    TreeNode t2=new TreeNode(9);
//    TreeNode t3=new TreeNode(20);
//    TreeNode t4=new TreeNode(15);
//    TreeNode t5=new TreeNode(7);
//    t1.left=t2;
//    t1.right=t3;
//    t3.left=t4;
//    t3.right=t5;
//    Solution107 solution107=new Solution107();
//    solution107.levelOrderBottom(t1);
//
//}