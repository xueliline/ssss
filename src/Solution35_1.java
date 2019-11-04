class Solution35_1 {
    public int searchInsert(int[] nums, int target) {
       int l=0;
       int h=nums.length-1;
       while(l<=h)
       {
           int midindex=(l+h)/2;
           int mid=nums[midindex];
           if(mid==target)
           {
               return midindex;
           }

           if(mid<target)
           {
               l=midindex+1;
           }else{
               h=midindex-1;
           }

       }

       return l;
    }
}