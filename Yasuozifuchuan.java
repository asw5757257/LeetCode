package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Yasuozifuchuan {
	
	    public int compress(char[] chars) {
	        int i=0;
	        int len=0;
	        for(i=0;i<chars.length;i++)
	        {   int num=1;
	           while(i+1<chars.length&&chars[i]==chars[i+1])
	           {
	               num++;
	               i++;
	           }
	            chars[len]=chars[i];
	            len++;
	            if(num==1)continue;
	            else 
	            {
	                for(int k=0;k<Integer.toString(num).length();k++)
	                {
	                    chars[len++]=Integer.toString(num).charAt(k);
	                }
	            }
	        }
	        Arrays.sort(a);
	        return len;
	        int k=Integer.MIN_VALUE
	        List<Integer> ssIntegers = new ArrayList<Integer>()
	    }
}
