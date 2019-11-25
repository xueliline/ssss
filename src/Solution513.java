import java.util.HashMap;
import java.util.Map;

public class Solution513 {
    Map<Integer, TreeNode> map = new HashMap<>();

    private void inorder(TreeNode root, int height) {
        if (root == null)
            return;
        inorder(root.left, height + 1);
        if (!map.containsKey(height))
            map.put(height, root);
        inorder(root.right, height + 1);
    }

    public int findBottomLeftValue(TreeNode root) {
        inorder(root,0);
        int max = 0;
        for (Integer integer : map.keySet()) {
            if (integer > max)
                max = integer;
        }
        return map.get(max).val;
    }

    public static void main(String[] args) {
        TreeNode t1=new TreeNode(1);
        TreeNode t2=new TreeNode(2);
        TreeNode t3=new TreeNode(3);
        t1.left=t2;
        t1.right=t3;
        Solution513 solution513=new Solution513();
        solution513.findBottomLeftValue(t1);
    }
}