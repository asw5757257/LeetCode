package leetcode;

import java.util.ArrayList;

public class Upstairs {
	    public static int climbStairs(int n) {
	        if(n==0)
	        {
	            return 0;
	        }
	        if(n==1)
	        {
	            return 1;
	        }
	        if(n==2)
	        {
	            return 2;
	        }
	        ArrayList<Integer> list=new ArrayList<>();
	        list.add(0);
	        list.add(1);
	        list.add(2);
	        for(int i=3;i<=n;i++)
	        {
	        	list.add(i,list.get(i-1)+list.get(i-2));
	        }
	        return list.get(n);
	        
	    }
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n=30;
		int k=climbStairs(n);
		System.out.print(k);
	}

}
