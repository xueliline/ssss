import java.util.HashMap;

public class Solution501 {
    int max=0;
    HashMap<Integer,Integer> hashMap=new HashMap<>();
    private void pre(TreeNode root){
        if(root==null)
            return;
        hashMap.put(root.val,hashMap.getOrDefault(root.val,0)+1);
        if(hashMap.get(root.val)>max)
            max=hashMap.get(root.val);
        pre(root.left);
        pre(root.right);
    }
    public int[] findMode(TreeNode root) {

        pre(root);
        int count=0;
        int []res=new int[hashMap.size()];
        for(Integer iter:hashMap.keySet())
        {
            if(hashMap.get(iter)==max)
            {
                res[count]=iter;
                count++;
            }
        }
        int []result=new  int[count];
        for (int i=0;i<count;i++)
        {
            result[i]=res[i];
        }
        return result;
    }
}