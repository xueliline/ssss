public class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return null;
        ListNode re=new ListNode(head.val);
        ListNode res=re;
        head=head.next;
        while (head!=null)
        {
            if(head.val==re.val)
            {
                head=head.next;
            }else{
                re.next=new ListNode(head.val);
                re=re.next;
                head=head.next;
            }
        }
        return res;
    }
public static void main(String[] args) {
    Solution83 solution83=new Solution83();
    ListNode l1=new ListNode(1);
    ListNode l2=new ListNode(1);
    ListNode l3=new ListNode(2);
    ListNode l4=new ListNode(3);
    ListNode l5=new ListNode(3);
    l1.next=l2;
    l2.next=l3;
    l3.next=l4;
    l4.next=l5;
    ListNode res= solution83.deleteDuplicates(l1);
    System.out.println("结束了————————————————————————————————");
    }

    }

