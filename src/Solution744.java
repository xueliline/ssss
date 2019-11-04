public class Solution744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int l=0;
        int h=letters.length-1;
        while (l<=h)
        {
            int mid=(l+h)/2;

                if(letters[mid]<=target)
                {
                    l=mid+1;
                }
                else {
                    h=mid-1;
                }
        }
       if(l==letters.length)
           return letters[0];
        return letters[l];
    }

    }

//public static void main(String[] args) {
//    Solution744 solution744=new Solution744();
//    char res=solution744.nextGreatestLetter(new char[]{'a', 'b'},'z');
//    System.out.println(res);