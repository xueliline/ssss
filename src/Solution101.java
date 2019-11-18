import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution101 {
    List<List<Integer>> lists = new ArrayList<>();

    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            lists.add(list);
            int count = queue.size();
            for (int i = 0; i < count; i++) {
                TreeNode treeNode = queue.poll();
                if (treeNode == null)
                    continue;
                list.add(treeNode.val);
                queue.add(treeNode.left);
                queue.add(treeNode.right);
            }
        }
        for (List<Integer> list : lists) {
            for (int i = 0; i < list.size() / 2 + 1; i++) {
                if(list.get(i)==null&&list.get(list.size() - i - 1)!=null)
                    return false;
                if(list.get(i)!=null&&list.get(list.size() - i - 1)==null)
                    return false;
                if (list.get(i) != list.get(list.size() - i - 1)) {
                    return false;
                }
            }
        }
        return true;
    }
}