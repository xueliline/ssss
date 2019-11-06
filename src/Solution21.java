

public class Solution21 {
    public ListNode<Number> mergeTwoLists(ListNode<Number> l1, ListNode<Number> l2) {
    	ListNode<Number> resListNode = new ListNode<Number>(-1);
    	ListNode<Number> preListNode=resListNode;
    	ListNode<Number> newlListNode=null;
    	Boolean flagBoolean=true;
    	while(l1!=null&&l2!=null)
    	{
    		int x=l1.val;
    		int y=l2.val;
    		int z=x<y?x:y;
    		newlListNode=new ListNode<Number>(z);
    		resListNode.next=newlListNode;
    		resListNode=resListNode.next;
    		if(x<y) {
    			l1=l1.next;
    		}else {
				l2=l2.next;
			}

    	}
    	while(l1!=null)
    	{
    		newlListNode=new ListNode<Number>(l1.val);
    		resListNode.next=newlListNode;
    		resListNode=resListNode.next;
    		l1=l1.next;
    	}
    	while(l2!=null)
    	{
    		newlListNode=new ListNode<Number>(l2.val);
    		resListNode.next=newlListNode;
    		resListNode=resListNode.next;
    		l2=l2.next;
    	}
        return  preListNode.next;
    }
}
