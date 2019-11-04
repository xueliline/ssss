��;

import java.util.HashMap;

class Solution15 {
    public int threeSum(int[] nums) {
    	HashMap<Integer, Integer> hashmap=new HashMap<>();
       	for (int i = 0; i < nums.length; i++) {
    		hashmap.put(new Integer(nums[i]), new Integer(0));
		}
    	for (int i = 0; i < nums.length; i++) {
    		Integer tmpInteger=hashmap.get(new Integer(nums[i]));
    		hashmap.remove(new Integer(nums[i]));
    		hashmap.put(new Integer(nums[i]),tmpInteger+1);
		}

    	int [][]res=new int[nums.length][nums.length];
    	for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if(i!=j)
				{
					
				res[i][j]=nums[i]+nums[j];
				Integer tmpIntegeri=hashmap.remove(new Integer(nums[i]));
				Integer tmpIntegerj=hashmap.remove(new Integer(nums[j]));
				System.out.println(nums[i]+":"+tmpIntegeri+"ggggggggggg"+nums[j]+":"+tmpIntegeri);
				hashmap.put(new Integer(nums[i]),tmpIntegeri-1);
				hashmap.put(new Integer(nums[j]),tmpIntegerj-1);
				int tmp=-1*(nums[i]+nums[j]);
				int fff=hashmap.get(new Integer(tmp)).intValue();
				if(i!=j&&fff>1)
					System.out.println(nums[i]+"      "+nums[j]+"      "+tmp);
				}
			}
		}
    	
        return 0;
    }
}