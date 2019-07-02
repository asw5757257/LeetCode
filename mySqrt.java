package leetcode;

public class mySqrt {
	public static int mySqrt(int x)
	{
		if(x<0)
		{
			return 0;
		}
		double err=1e-15;
		double t=x;
		while(Math.abs(t-x/t)>err*t)
		{
			t=(x/t+t)/2.0;
		}
		return (int)t;
	}
	public static void main(String args[])
	{
		int x=8;
		int t=mySqrt(x);
		System.out.println(t);
	}

}
