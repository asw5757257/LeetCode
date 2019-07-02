package leetcode;

import java.math.BigDecimal;

public class multi {
	public static String multiple(String s1,String s2)
	{
		int l1=s1.length();
		int l2=s2.length();
		double mm=0;
		for(int i=l1-1;i>=0;i--)
		{	int carry=0;
		    double sum=0;
			for(int j=l2-1;j>=0;j--)
			{
				int multi=(s1.charAt(i)-'0')*(s2.charAt(j)-'0')+carry;
				carry=multi/10;
				int gewei=multi%10;
				sum+=gewei*Math.pow(10,l2-j-1);
			}
			sum+=carry*Math.pow(10,l2);
			mm+=sum*Math.pow(10,l1-i-1);
		}
		String x=String.valueOf(mm);
		return x;
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s1="987654321";
		String s2="123456789";
		//String s1="2";
		//String s2="3";
		String x=multiple(s1, s2);
		String []a = x.split("[.]");
		System.out.println(a[0]);

	}

}
