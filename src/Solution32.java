��;

import java.util.Stack;

public class Solution32 {
public int longestValidParentheses(String s) {
	Stack<Character> stack=new Stack<Character>();
	Stack<Integer> stack1=new Stack<Integer>();
	boolean []resBoolean=new boolean[s.length()];
	//System.out.println(resBoolean.length);
	if(s.length()==0)
		return 0;
	int i=1;
	stack.push(s.charAt(0));
	stack1.push(0);
		while(!stack.isEmpty()&&i<s.length())
		{
			if(stack.peek()=='('&&s.charAt(i)==')')
			{
				
				stack.pop();
				int index=stack1.pop();
				resBoolean[index]=true;
				resBoolean[i]=true;
			}else {
				stack.push(s.charAt(i));
				stack1.push(i);
			}
			i++;
		}
		int maxlen=0;
		int nowlen=0;
		for (int j = 0; j < resBoolean.length; j++) {
		//	System.out.println(resBoolean[j]);
			if(resBoolean[j])
			{
				nowlen++;
			}
			else {
				nowlen=0;
			}
			if(nowlen>maxlen)
			{
				maxlen=nowlen;
			}
		}
        return maxlen;
    }
}