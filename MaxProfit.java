package leetcode;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/*����һ�����飬���ĵ� i ��Ԫ����һ֧������Ʊ�� i ��ļ۸�
��������ֻ�������һ�ʽ��ף������������һ֧��Ʊ�������һ���㷨�����������ܻ�ȡ���������
ע���㲻���������Ʊǰ������Ʊ*/
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
		// TODO �Զ����ɵķ������
		int[] m= {7,1,5,3,6,4};
		int n=maxProfit(m);
		
			System.out.println(n);
		
	}

}
