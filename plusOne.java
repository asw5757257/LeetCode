package leetcode;

import java.util.ArrayList;
import java.util.Stack;

public class plusOne {
	public static int[] Method(int[] digits)
	{	int z=0;
		int len=digits.length;
		
		int of=0;
		//System.out.print(digits[len-1]);
		for(int s:digits)
		{
			if(s!=9)
			{
				of=1;
				break;
			}
		}
		System.out.println("of"+of);
		if(of==0)
		{
			ArrayList<Integer> inte=new ArrayList<>();
			inte.add(1);
			for(int j=0;j<digits.length;j++)
			{
				inte.add(0);
			}
			int[] num=new int[inte.size()];
			for(int k=0;k<inte.size();k++)
			{
				num[k]=inte.get(k);
			}
			return num;
		}
		digits[len-1]+=1;
		if(digits[len-1]>9)
		{
			digits[len-1]=0;
			z=1;
		}
		int k=0;
		for(int i=digits.length-2;i>=0;i--)
		{
			digits[i]=digits[i]+z;
			if(digits[i]>9)
			{
				digits[i]=0;
				z=1;
			}
			else 
			{
				z=0;
			}
		}
		
		return digits;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] digits= {0};
		digits=Method(digits);
		for(int s:digits)
		{
			System.out.print(s+" ");
		}
		

	}

}
