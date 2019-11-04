public class Solution26 {
    public int removeDuplicates(int[] nums) {
        int index=0;
        int pos=1;
        while (pos<nums.length)
        {
            if(nums[index]!=nums[pos])
            {
                index++;
                nums[index]=nums[pos];
                pos++;
            }
            else
            {
                pos++;
            }
        }
     return index+1;
    }

    public static void main(String[] args) {
        Solution26 solution26=new Solution26();
        int res=solution26.removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4});
        System.out.println(res);
    }
}