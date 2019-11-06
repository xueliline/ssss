import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution783 {
    public int minDiffInBST(TreeNode root) {
        List<Integer>list=this.inorderTraversal(root);
        list.sort((i,j)->
             i -j
        );
        int min=Integer.MAX_VALUE;
        if(list.size()==1)
            return 0;
        int top=list.get(0);
for (int i=1;i<list.size();i++)
{
    min=Math.abs(list.indexOf(i)-top)<min?Math.abs(list.indexOf(i)-top):min;
    top =list.get(i);
}
return min;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> listNode = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;

        while (!stack.isEmpty() || cur != null) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            listNode.add(cur.val);
            cur = cur.right;
        }
        return listNode;
    }

}
//    public static void main(String[] args) {
//        Solution783 solution783 = new Solution783();
//        TreeNode t1 = new TreeNode(1);
//        TreeNode t2 = new TreeNode(2);
//        TreeNode t3 = new TreeNode(3);
//        t1.right = t2;
//        t2.left = t3;
//        int res = solution783.minDiffInBST(t1);
//        System.out.println("结束--------------");
//
//    }