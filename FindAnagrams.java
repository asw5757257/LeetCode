package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAnagrams {
	
	  public List<Integer> findAnagrams(String s, String p) { 
		  char[] ch = p.toCharArray(); 
		  List<Integer> ll = new ArrayList<Integer>();
		  List<Character> list = new ArrayList<Character>();
		  int index=0,i=0,len=s.length();
		  while(i<len)
		  {	for(char c:ch)
		  	{
			  	list.add(c);
		  	}
		  	if(list.contains(s.charAt(i)))
		  	{	int j=i+1;
		  		while(j<len)
		  		{
		  			list.remove(s.charAt(i));
		  			if(list.contains(s.charAt(j)))
		  			{	list.remove(s.charAt(j));
		  				j+=1;
		  				
		  			}
		  			else {
		  				{
		  					i=j+1;
		  					break;
		  				}
					}
		  			if(list.size()==0)
		  			{
		  				ll.add(i);
		  			}
		  		}
		  	}
		  }
		  return ll;
		  
	  }
	 
	public static void main(String[] args) {
		
		String string = "abc";
		char[] ch = string.toCharArray();
		System.out.println(ch[0]);
	}

}
