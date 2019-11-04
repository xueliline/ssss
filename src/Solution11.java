

public class Solution11 {

    public int maxArea(int[] height) {
    	int i=0;
    	int j=height.length-1;
    	int res=0;
    	int max=-1;
    	while(i<=j)
    	{
    		    		res=Math.min(height[i], height[j])*Math.abs(i-j);
    		    		
    		max=res>max?res:max;
    		if(height[i]<height[j])
    		{
    			i++;
    		}else {
				j--;
			}
    	}
    	return max;
    
    }
}