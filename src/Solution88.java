��;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	int [] res=new int[m+n];
    	int i=0;
    	int j=0;
    	int k=0;
    	int x;
    	int y;
    	while(i<m&&j<n)
    	{
    		x=nums1[i];
    		y=nums2[j];
    		if(x>y)
    		{
    			res[k++]=y;
    			j++;
    		}else {
    			res[k++]=x;
    			i++;
			}
    	}
    	if(i<m)
    	{
    		while(i<m)
    		{
    		res[k++]=nums1[i];
			i++;
    		}
    	}
    	if(j<n)
    	{
    		while(j<n)
    		{
    		res[k++]=nums2[j];
			j++;
    		}
    	}
        for (int z = 0; z < res.length; z++) {
			nums1[z]=res[z];
		}
    }
}