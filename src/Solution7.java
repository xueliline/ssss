

class Solution7 {
    public int reverse(int x) {
    	String reString=String.valueOf(x);
    	String result;

    	int len=reString.length();  
    	int flag=1;
    	int count=len-1;
    	for (int i = len-1; i>=0; i--) {
			if(flag==1&&reString.charAt(i)=='0')
			{
				count--;
				
			}else {
				flag=0;
			}
		}
    	int start=0;
    	if(reString.charAt(0)=='-')
    	{
    		result="-";
    		start=1;
    	}else {
    		
    		result="";
    		start=0;
    	}
    	for(int i=count;i>=start;i--)
    	{
    		result+=reString.charAt(i);
    	}
    	int myresult = 0;
    	try {
    		myresult=Integer.valueOf(result);
		} catch (Exception e) {
			// TODO: handle exception
		}
    	return myresult;
        
    }
}