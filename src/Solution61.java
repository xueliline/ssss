import java.util.ArrayList;
import java.util.List;

public class Solution61 {
    List<ListNode> list=new ArrayList<>();

    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return null;
        while (head!=null)
        {
            list.add(head);
            head=head.next;
        }
        ListNode [] res=new ListNode[list.size()];
        for (int i=0;i<list.size();i++)
        {
            res[(i+k)%list.size()]=list.get(i);
        }
        for (int i=0;i<list.size()-1;i++)
            res[i].next=res[i+1];
        res[list.size()-1].next=null;
        return res[0];
    }

    public static void main(String[] args) {
        Solution61 solution61=new Solution61();
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(3);
        ListNode l4=new ListNode(4);
        ListNode l5=new ListNode(5);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        solution61.rotateRight(l1,2);
    }
}