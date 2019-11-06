public class Solution83 {
    public ListNode<Number> deleteDuplicates(ListNode<Number> head) {
        if(head==null)
            return null;
        ListNode<Number> re=new ListNode<Number>(head.val);
        ListNode<Number> res=re;
        head=head.next;
        while (head!=null)
        {
            if(head.val==re.val)
            {
                head=head.next;
            }else{
                re.next=new ListNode<Number>(head.val);
                re=re.next;
                head=head.next;
            }
        }
        return res;
    }
public static void main(String[] args) {
    Solution83 solution83=new Solution83();
    ListNode<Number> l1=new ListNode<Number>(1);
    ListNode<Number> l2=new ListNode<Number>(1);
    ListNode<Number> l3=new ListNode<Number>(2);
    ListNode<Number> l4=new ListNode<Number>(3);
    ListNode<Number> l5=new ListNode<Number>(3);
    l1.next=l2;
    l2.next=l3;
    l3.next=l4;
    l4.next=l5;
    ListNode<Number> res= solution83.deleteDuplicates(l1);
    System.out.println("结束了————————————————————————————————");
    }

    }

