

public class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	int len1=nums1.length;
    	int len2=nums2.length;
    	double []res=new double[len1+len2];
        int len3=len1+len2;
        int i=0;
        int j=0;
        int k=0;
        while(i<len1&&j<len2)
        {
        	if(nums1[i]<nums2[j])
        	{
        		res[k++]=nums1[i++];
        	}else {
        		res[k++]=nums2[j++];
			}
        }
        if(i<len1)
        {
        	for(;i<len1;i++)
        	{
        		res[k++]=nums1[i];
        	}
        }
        if(j<len2)
        {
        	for(;j<len2;j++)
        	{
        		res[k++]=nums2[j];
        	}
        }
        if(len3%2==0)
        {
        	return (res[len3/2-1]+res[len3/2+1])/2;
        }
        else {
			return res[len3/2];
		}
    }
}