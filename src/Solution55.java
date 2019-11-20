public class Solution55 {
    public boolean canJump(int[] nums) {
        int len = nums.length - 1;
        int i = nums.length - 1;

        while (len > 0) {
            if (nums[i]==0)
                return false;
            len = len - nums[i];
        }
        if(len<=0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Solution55 solution55=new Solution55();
        //solution55.canJump()
    }
}