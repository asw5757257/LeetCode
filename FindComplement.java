package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindComplement {
	public static int findComplement(int num)
	{
		String string = Integer.toBinaryString(num);
		StringBuffer stringBuffer = new StringBuffer();
		for(Character c:string.toCharArray())
		{
			if(c=='0')
			{
				c='1';
			}
			if(c=='1')
			{
				c='0';
			}
			stringBuffer.append(c);
		}
		List<Integer> list = new ArrayList<Integer>();
		
		return Integer.parseInt(stringBuffer.toString(), 2);

	}
	public static void main(String[] args) {
		int num=5;
		System.out.println(findComplement(num));

	}

}
