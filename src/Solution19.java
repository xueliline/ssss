

import java.util.Stack;

public class Solution19 {
	  public ListNode<Number> removeNthFromEnd(ListNode<Number> head, int n) {
		  ListNode<Number> preListNode=new ListNode<Number>(-1);
		  preListNode.next=head;
		  ListNode<Number> workListNode;
		  workListNode=preListNode;
		  int count=0;
		  Stack<ListNode<Number>> trace=new Stack<ListNode<Number>>();
		  while (workListNode!=null) {
		  trace.add(workListNode);
		  workListNode=workListNode.next;
		}
		  ListNode<Number> x=null;
		  ListNode<Number> afterdeleteListNode;
		  afterdeleteListNode=x;
		  for (int i = 0; i < n; i++) {
			  afterdeleteListNode=x;
			  x=trace.pop();
		}
		  ListNode<Number> y=trace.pop();
		  y.next=afterdeleteListNode;
	        return preListNode.next;
	    }
	}