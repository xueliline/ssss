class Solution27 {
    public int removeElement(int[] nums, int val) {
        int index=-1;
        int pos=0;
        while (pos<nums.length)
        {
            if(nums[pos]!=val)
            {
                index++;
                nums[index]=nums[pos];

            }else{
                pos++;
            }
        }
    return index+1;
    }

    public static void main(String[] args) {
        Solution27 solution27=new Solution27();
        int res=solution27.removeElement(new int []{3,2,2,3},3);
        System.out.println(res);
    }
}