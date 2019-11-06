import java.util.Stack;

class Solution20 {
    public boolean isValid(String s) {
        if(s.length()==0)
            return true;
        int []str=new int [s.length()];
        for (int i=0;i<s.length();i++) {
           switch (s.charAt(i))
            {
                case '(':str[i]=-1;
                break;
                case ')':str[i]=1;
                    break;
                case '{':str[i]=-2;
                    break;
                case '}':str[i]=2;
                    break;
                case '[':str[i]=-3;
                    break;
                case ']':str[i]=3;
                    break;
                default:str[i]=100;
                    break;
            }
        }
        Stack<Integer> stack=new Stack<>();
        stack.push(100);
        stack.push(str[0]);
        int index=1;
        while (index<s.length()){
            int top=stack.peek();
            if(str[index]+top==0)
            {
                stack.pop();
            }
            else {
                stack.push(str[index]);
            }
            index++;

        }
        if(stack.peek()==100)
            return true;
        return false;
    }

}

//
//    public static void main(String[] args) {
//        Solution20 solution20=new Solution20();
//        boolean res=solution20.isValid("()[]{}");
//        System.out.println(res);