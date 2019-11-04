public class Solution69 {
    public int mySqrt(int x) {
        int l=1;
        int h=x;
        while (l<=h)
        {
            int mid=(l+h)/2;
            int sqrt=x/mid;
            if(sqrt==mid)
                return mid;
            if(sqrt<mid){
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }

        }
        return h;
     }
}