import java.util.HashMap;
import java.util.Map;

class Solution169 {
    public int majorityElement(int[] nums) {
        if(nums==null)
            return 0;
        if(nums.length==0)
            return 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i:nums)
        {
            if(!map.containsKey(i)) {
                map.put(i, 1);
            }else {
                map.put(i,map.get(i)+1);
            }
        }
        int max=-1;
        int maxkey=0;
        for (Integer integer:map.keySet())
        {
            if(map.get(integer)>=max)
            {
                max=map.get(integer);
                maxkey=integer;
            }
        }
        return maxkey;
    }

    public static void main(String[] args) {
        Solution169 solution169=new Solution169();
        solution169.majorityElement(new int[]{3,2,1});
    }
}