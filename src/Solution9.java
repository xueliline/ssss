public class Solution9 {
    public boolean isPalindrome(int x) {
        String string = String.valueOf(x);
        if(string.charAt(0)=='-')
            return false;
        if(x==2147483647)
            return  false;
        StringBuilder stringBuilder  =new StringBuilder(string);
        String string2=stringBuilder.reverse().toString();
        int y=Integer.valueOf(string2);
        return y==x;
    }

    public static void main(String[] args) {
        Solution9 solution9=new Solution9();
        solution9.isPalindrome(10);
    }
}