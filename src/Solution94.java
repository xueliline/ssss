import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> listNode = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur=root;

        while (!stack.isEmpty()||cur!=null){
        while (cur!=null)
        {
            stack.push(cur);
            cur=cur.left;
        }
        cur=stack.pop();
        listNode.add(cur.val);
        cur=cur.right;
        }
      return listNode;
    }


    }
//}
//    public static void main(String[] args) {
//        Solution94 solution94=new Solution94();
//        TreeNode t1=new TreeNode(1);
//        TreeNode t2=new TreeNode(2);
//        TreeNode t3=new TreeNode(3);
//        t1.right=t2;
//        t2.left=t3;
//        List<Integer>res= solution94.inorderTraversal(t1);
//        System.out.println("结束--------------");