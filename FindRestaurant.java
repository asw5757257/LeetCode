package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindRestaurant {
	public String[] findRestaurant(String[] list1, String[] list2)
	{
		int len = list1.length+list2.length;
		List<String> ss = new ArrayList<String>();
		int x=0;
		for(int i=0;i<list1.length;i++)
		{
			for(int j=0;j<list2.length;j++)
			{
				if(list1[i]==list2[j]&&i+j<len)
				{
					len=i+j;
					ss.add(list1[i]);
					
				}
			}
		}
		String[] list = new String[ss.size()];
		String[] k = ss.toArray(list);
		return k;
	}
}
