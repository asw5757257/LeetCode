package leetcode;

import java.util.ArrayList;
import java.util.List;

public class tesy {
	public static boolean repeatedSubstringPattern(String s) {
		boolean bool = false;
        for(int i=1;i<s.length();i++)
        {	if(bool==true)
        	{
        		break;
        	}
        	bool=false;
            
            if(s.length()%i==0)
            {	
                int len=i;
                for(int k=0;k<s.length()-len-len;k+=len)
                {	System.out.println(s.substring(k,k+len));
                    if(s.substring(k,k+len).equals(s.substring(k+len,k+len+len))==true)
                    {
                        bool=true;
                    }
                    else {
                    	bool=false;break;
					}
                }
            }
        }
        return bool;
        
    }
	public static void main(String[] args) {
		String s = "abcabc";
		System.out.println(repeatedSubstringPattern(s));

	}

}
