import java.util.ArrayList;
import java.util.List;

public class Solution429 {
    List<List<Integer>> list = new ArrayList();

    private void cc(Node root, int height) {
        if (height >=list.size()) {
            list.add(new ArrayList<>());
        }
        if (root == null) {
            return;
        }
        list.get(height).add(0, root.val);
        for (Node tmp : root.children) {
            cc(tmp, height + 1);
        }


    }

    public List<List<Integer>> levelOrder(Node root) {
        cc(root, 0);
        return list;
    }
}