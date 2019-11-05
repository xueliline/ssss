import java.lang.reflect.Array;
import java.util.Arrays;

class MinStack {
    public  int  minindex=Integer.MAX_VALUE;
    public  int index=0;
    public  int[] mystack;
    /** initialize your data structure here. */
    public MinStack() {
        mystack=new int[10];
    }
public  void check()
{

    if(index<mystack.length)
    {

    }else{
        mystack= Arrays.copyOf(mystack,(mystack.length)+(mystack.length>>1));
    }
}
    public void push(int x) {
        check();
        if(x<minindex)
        {
            int tmp=minindex;
            minindex=x;
        }
       mystack[index]=x;
      index++;
    }

    public void pop() {

        --index;
        minindex=Integer.MAX_VALUE;
        for (int i =0;i<index;i++)
            if(mystack[i]<minindex)
                minindex=mystack[i];
    }

    public int top() {
   return mystack[index-1];
    }

    public int getMin() {
    return minindex;
    }
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.push(-3);
        minStack.push(-3);
        minStack.push(-3);
        minStack.push(-3);
        minStack.push(-3);
        minStack.push(-3);
        minStack.push(-3);
        minStack.push(-3);


        minStack.push(-3);


        minStack.getMin();
        minStack.pop();
        minStack.top();
        minStack.getMin();

    }

}

