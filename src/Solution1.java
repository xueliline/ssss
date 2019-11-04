��;
//����֮��
import java.util.HashMap;
import java.util.Map;

public class Solution1 {
	public int[] twoSum(int []nums,int target) {
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++)
		{
			map.put(nums[i], i);
		}
		for(int i=0;i<nums.length;i++)
		{
			System.out.print(nums[i]);
			System.out.print(target-nums[i]);
            int complement = target - nums[i];
            if (map.containsKey(complement)&& map.get(complement) != i) {
                return new int[] { map.get(complement), i };
            }
			
		}
		throw new IllegalArgumentException("no return ");
		
	}

}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

