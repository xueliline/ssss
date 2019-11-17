class Solution80 {
    public int removeDuplicates(int[] nums) {
        if (nums.length==0)
            return 0;
     int pre=nums[0];
     int count=1;
     int index=1;
     int pos=1;
     while (index<nums.length)
     {
         if(nums[index]==pre){
             if(count!=0)
             {
                 count--;
                 nums[pos]=nums[index];
                 pos++;
             }
         }
         else {
             pre=nums[index];
             nums[pos]=nums[index];
             pos++;
             count=1;
         }
         index++;
     }
     return pos;
    }
}

//public static void main(String[] args) {
//    Solution80 solution80=new Solution80();
//    int res=solution80.removeDuplicates(new int[]{1,1,1,2,2,3});
//}