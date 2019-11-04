

import java.util.HashSet;
import java.util.Set;

public class Solution3 {
	 public int lengthOfLongestSubstring(String s) {
		 int i=0;
		 int j=0;
		 int len=s.length();
		 int max=0;
		 Set<Character> set=new HashSet<Character>();
		 while(i<len&&j<len){
			 if(set.contains(s.charAt(j))==false)
			 {
				 set.add(s.charAt(j));
				 max=Math.max(max, j-i+1);
				 j++;
			 }else {
				 
				set.remove(s.charAt(i));
				i++;
			}
			 
			
		}
		return max;
	        
	    }
	}