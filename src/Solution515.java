import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution515 {
    Map<Integer, Integer> map = new HashMap<>();

    private void inorder(TreeNode root, int height) {
        if (root == null)
            return;
        inorder(root.left, height + 1);
        if (!map.containsKey(height)) {
            map.put(height, root.val);
        } else {
            if (root.val > map.get(height)) {
                map.put(height, root.val);
            }
        }
        inorder(root.right, height + 1);
    }

    public List<Integer> largestValues(TreeNode root) {
        inorder(root,0);
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        for (Integer integer : map.keySet()) {
            list.add(map.get(integer));
        }
        return list;
    }
}