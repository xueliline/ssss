
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

class Solution100 {
    public void inorder(TreeNode root,List<Integer> res){
        if(root==null)
        return ;
        if(root.left!=null)
        {
            inorder(root.left,res);
        }
        res.add(root.val);
        if(root.right!=null)
        {
            inorder(root.right,res);
        }

    }
    public List<Integer> inorder(TreeNode root){
        List<Integer> res=new ArrayList<>();
        return res;
    }


    public void preorder(TreeNode root,List<Integer> res){
        if(root==null)
            return ;
        res.add(root.val);

        if(root.left!=null)
        {
            inorder(root.left,res);
        }
        if(root.right!=null)
        {
            inorder(root.right,res);
        }

    }
    public List<Integer> preorder(TreeNode root){
        List<Integer> res=new ArrayList<>();
        return res;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> l1=preorder(p);
        List<Integer> l2=preorder(q);
        List<Integer> l3=inorder(p);
        List<Integer> l4=inorder(q);
        if(l1.size()!=l2.size())
            return  false;
        for (int i=0;i<l1.size();i++)
        {
            if(l1.get(i)!=l2.get(i)||l3.get(i)!=l4.get(i))
                return false;
        }
        return true;
    }
}