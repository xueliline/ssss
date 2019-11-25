public class Solution29 {
    public int divide(int dividend, int divisor) {

        int flag1 = 1;
        int flag2 = 1;
        long dividend1;
        long divisor1;
        if (dividend < 0)
            flag1 = -1;
        if (divisor < 0)
            flag2 = -1;
        int flag=flag1*flag2;
        dividend1=(long)dividend*flag1;
        divisor1=divisor*flag2;
        long i;
        long  len=dividend1;
        for (i=1;i<len+1;i++)
        {
            dividend1=dividend1-divisor1;
            if(dividend1<0)
                break;
        }
        System.out.println(i);
        System.out.println(flag*i);
        if(i>=Integer.MAX_VALUE)
            return Integer.MAX_VALUE;

        return (int) (flag*i);
    }

    public static void main(String[] args) {
        Solution29 solution29=new Solution29();
        solution29.divide(-2147483648 ,-1);
    }
}