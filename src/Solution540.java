public class Solution540 {
    public int singleNonDuplicate(int[] nums) {
        int l=0;
        int h=nums.length-1;
        while (l<=h)
        {

            int mid=(h+l)/2;
            System.out.println(l+"    "+mid);
            if(nums[mid]==nums[mid-1])
                mid--;
//            if(nums[mid])
//            return nums[mid];
//            if()
        }
       return nums[l];
    }
    public static void main(String[] args) {
      Solution540 solution540=new Solution540();
          int res=solution540.singleNonDuplicate(new int []{1,1,2,3,3,4,4,8,8});
        System.out.println(res);
    }
}
