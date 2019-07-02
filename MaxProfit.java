package leetcode;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/*给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
注意你不能在买入股票前卖出股票*/
public class MaxProfit {
	public static int maxProfit(int[] prices) {
        if(prices.length==2)
        {
        	return prices[0]-prices[1]>0?(prices[0]-prices[1]):0;
        }
        int[] k=new int[prices.length+1];
        k[1]=prices[1]-prices[0]>0?(prices[1]-prices[0]):0;
        int min=Math.min(prices[0],prices[1]);
        for(int i=2;i<prices.length;i++)
        {	//int[] sort;
        	//sort=Arrays.copyOfRange(prices,0,i);
        	
        	//int sorts=Collections.min(Arrays.asList(sort));
        	//System.out.println(sorts);
        	k[i]=Math.max(k[i-1],prices[i]-min);
        	if(prices[i]<min)
        	{
        		min=prices[i];
        	}
        }
        return k[prices.length-1];
    }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] m= {7,1,5,3,6,4};
		int n=maxProfit(m);
		
			System.out.println(n);
		
	}

}
