import java.util.ArrayList;
import java.util.List;

public class Solution103 {
    public List<List<Integer>> lists;
    public  void cc(TreeNode root,int height)
    {
        if(root==null)
            return;
        if(height > lists.size() - 1){
            List<Integer> list = new ArrayList<>();
            lists.add(list);
        }
        lists.get(height).add(root.val);

    }
//    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//
//    }
}