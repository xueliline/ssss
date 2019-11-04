public class Solution69 {
    public int mySqrt(int x) {
        int l=1;
        int h=x;
        while (l<=h)
        {
            int mid=(l+h)/2;
            int sqrt= (int) Math.sqrt(x);
            if(sqrt<=mid){
                h=mid-1;
            }

            else if(sqrt>mid)
            {
                l=mid+1;
            }

        }
        return l;
     }
}