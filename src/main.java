

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        ListNode<Number> x1=new ListNode<Number>(1);
        ListNode<Number> x4=null;
        
       
		Solution32 solution=new Solution32();
		int resListNode=solution.longestValidParentheses("(((((");
	    System.out.println(resListNode);
   
	}

}
