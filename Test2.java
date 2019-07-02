package leetcode;
class testThread implements Runnable
{

	@Override
	public void run() {
		for(int i=0;i<1000;i++)
		{
			System.out.println("这是一个线程");
		}
	}
	
}
public class Test2 {
	static int i=0;
	public  int aMethod() 
{
	i++;return i;
}
public static void main (String args[]) 
{Test2 test = new Test2();
	test.aMethod();
	int j = test.aMethod();
	System.out.println(j);}
}

