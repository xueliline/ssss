

public class Solution8 {
	  public int myAtoi(String str) {
		  int index=0;
		  int i;
		for ( i = 0; i < str.length(); i++) {
			if(str.charAt(i)!=' ')
				break;
		}
		if(i==str.length())
			return 0;
		if(str.charAt(i)<'0'||str.charAt(i)>'9')
		{
			if(str.charAt(i)!='-'&&str.charAt(i)!='+')
			{
				return 0;
				}
			
			
		}
		int flag=1;
		int index1=0;
		if(str.charAt(i)=='-')
		{
			flag=-1;
			index1=1;
		}
		if(str.charAt(i)=='+')
		{
			flag=1;
			index1=1;
		}
		long res=0;
		
		for (int j =i+index1 ; j < str.length(); j++) {
			if(str.charAt(j)<'0'||str.charAt(j)>'9')
				break;
			res=res*10+flag*(str.charAt(j)-'0');
			if(res>Integer.MAX_VALUE||Integer.MAX_VALUE<Integer.MIN_VALUE)
				break;
			
		}System.out.println(res+"            ");
		if(res<Integer.MIN_VALUE||res>Integer.MAX_VALUE)
		{
			if(flag==1)  return (int)Integer.MAX_VALUE ;
			  if(flag==-1)return (int)Integer.MIN_VALUE ;
		}
			
		
				
				  return (int)res;
						  
	        
	    }
}
