

class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode pre=new ListNode(0);
    	ListNode cur=pre;
    	int carray=0;
    	int x;
    	int y;
    	int sum=0;
    	while(l1!=null||l2!=null)
    	{
    		if(l1!=null)
    		{
    		x=l1.val;	
    		}
    		else {
				x=0;
			}
    		if(l2!=null)
    		{
    			y=l2.val;
    		}else {
				y=0;
			}
    		sum=x+y+carray;
    		cur.next=new ListNode(sum%10);
    		cur=cur.next;
    		carray=sum/10;
    		if(l1!=null)
    		{
    			l1=l1.next;
    		}
    		if(l2!=null)
    		{
    			l2=l2.next;
    		}
    		
    	}
    	if(carray==1)
    	{
    		cur.next=new ListNode(carray);
    	}
		return pre.next;
        
    }
}