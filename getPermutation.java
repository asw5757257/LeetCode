package leetcode;

import java.util.ArrayList;

//第k个排列
public class getPermutation {
	public static String getPermutationss(int n, int k)
	{	int[] nn=new int[n];
		for(int i=0;i<n;i++)
		{
			nn[i]=i+1;
		}
	 	ArrayList<Integer> ss=new ArrayList<>();
	 	ArrayList<ArrayList<Integer>> list=new ArrayList<>();
	 	Permutation(nn,ss,0,list,k,0);
	 	//System.out.println(list.get(k-1));
	 	StringBuffer s=new StringBuffer();
	 	for(int i=0;i<list.get(k-1).size();i++)
	 	{
	 		s.append(list.get(k-1).get(i));
	 	}
	 	//s.append(list.get(0));
	 	String cString=s.toString();
	 	System.out.println(s);
		return cString;
		
	}
	public static void Permutation(int[] nn,ArrayList<Integer> ss,int level,ArrayList<ArrayList<Integer>> list,int k,int m)
	{
		if(level==nn.length)
		{
			list.add(new ArrayList<Integer>(ss));
			
		}
		
		for(int i=0;i<nn.length;i++)
		{
			if(ss.contains(nn[i]))
			{
				continue;
			}
			ss.add(nn[i]);
			Permutation(nn, ss, level+1, list,k,m);
			ss.remove(ss.size()-1);
		}
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n=4,k=9;
		
		String string=getPermutationss(n,k);
		//System.out.println(string);*/
		
	}

}
