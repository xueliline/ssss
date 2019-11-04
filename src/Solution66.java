

public class Solution66 {
    public int[] plusOne(int[] digits) {
    	int carray=1;
    	int sum;
    	for (int i = digits.length-1; i >=0; i--) {
    			sum=digits[i]+carray;
    			digits[i]=(sum)%10;
    			carray=(sum)/10;
  		
  
			
		}
    	int []res;
    	if(carray>=1)
    	{
    		res=new int [digits.length+1];
    		res[0]=carray;
    	}
    	else {
    		res=new int [digits.length];
		}
    	for (int i = 0; i < digits.length; i++) {
			res[i+carray]=digits[i];
			
		}
    	return res;
        
    }
}