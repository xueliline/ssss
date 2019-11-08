public class Solution137 {
    public int singleNumber(int[] nums) {
        int res=0;
        for (int i=0;i<32;i++)
        {
            int count=0;
            for (int j=0;j<nums.length;j++)
            {
                if(((nums[j]>>>i)&1)==1)
                {
                    count++;
                }
            }
            if(count%3!=0)
                res=res|1<<i;
        }
return res;
    }


}
//public static void main(String[] args) {
//    Solution137 solution137=new Solution137();
//    int res=solution137.singleNumber(new int[]{2,2,3,2});
//    System.out.println(res);
//}