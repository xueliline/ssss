import java.util.HashMap;

class Solution653 {
    HashMap<Integer,Integer> map=new HashMap<>();
    public void pre(TreeNode root){
        if(root==null)
            return;
        pre(root.left);
        if(!map.containsKey(root.val))
        {
          map.put(root.val,1);
        }else {
            map.put(root.val,map.get(root.val)+1);
        }

        pre(root.right);
    }
    public boolean findTarget(TreeNode root, int k) {
        pre(root);
        for (Integer i:map.keySet())
        {

            if(map.containsKey(k-i))
            {
                if(k-i==i&&map.get(i)<2)
                    continue;

                return true;
            }
        }
        return false;
    }
}