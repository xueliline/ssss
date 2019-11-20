import java.util.ArrayList;
import java.util.List;

public class Solution24 {
    public ListNode swapPairs(ListNode head) {
        List<ListNode> list=new ArrayList<>();
        List<ListNode> res=new ArrayList<>();
        if(head==null)
            return null;
         while (head!=null)
        {
            list.add(head);
            head=head.next;
        }
         if(list.size()==1)
             return list.get(0);
         int i=0;
        for (;i<list.size();i++)
        {
           if((i+1)%2==0)
           {

               res.add(list.get(i));
               res.add(list.get(i-1));
           }
        }
        if(list.size()%2==1)
            res.add(list.get(list.size()-1));
        res.add(null);
         for (int j=0;j<res.size()-1;j++) {
           res.get(j).next=res.get(j+1);
         }
         return res.get(0);
        }

    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
//        ListNode l3=new ListNode(3);
//        ListNode l4=new ListNode(4);
        l1.next=l2;
//        l2.next=l3;
//        l3.next=l4;
        Solution24 solution24=new Solution24();
        solution24.swapPairs(l1);
    }
    }
