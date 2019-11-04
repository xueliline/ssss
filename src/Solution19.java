��;

import java.util.Stack;

public class Solution19 {
	  public ListNode removeNthFromEnd(ListNode head, int n) {
		  ListNode preListNode=new ListNode(-1);
		  preListNode.next=head;
		  ListNode workListNode;
		  workListNode=preListNode;
		  int count=0;
		  Stack<ListNode> trace=new Stack<ListNode>();
		  while (workListNode!=null) {
		  trace.add(workListNode);
		  workListNode=workListNode.next;
		}
		  ListNode x=null;
		  ListNode afterdeleteListNode;
		  afterdeleteListNode=x;
		  for (int i = 0; i < n; i++) {
			  afterdeleteListNode=x;
			  x=trace.pop();
		}
		  ListNode y=trace.pop();
		  y.next=afterdeleteListNode;
	        return preListNode.next;
	    }
	}