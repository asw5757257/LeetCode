package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.io.File;
import java.math.BigDecimal;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class Test {
	 public static void heapfy(int[] nums,int i)
	    {
	        int left = i*2+1;
	        int right = i*2+2;
	        int largest = i;
	        if(left<nums.length&&nums[i]<nums[left]) largest = left;
	        if(right<nums.length&&nums[largest]<nums[right]) largest = right;
	        if(largest!=i)
	        {
	            int swap=nums[i];
	            nums[i]=nums[largest];
	            nums[largest]=swap;
	            heapfy(nums,largest);
	            
	        }
	    }
	    public static void build(int[] nums)
	    {
	        for (int i = nums.length/2-1; i >= 0; i--)
	        {
	            heapfy(nums,i);
	        }
	        
	    }
	public static void main(String[] args) {
		double a=1.1;
		double b=2.2;
		double c=a+b;
		
		System.out.println(c);
		
	}
	public static void printfile(File file,int level)
	{	for(int i=0;i<level;i++)
		{
			System.out.print("-");
		}
			System.out.println(file.getName());
		if(file.isDirectory())
		{	
			File[] files = file.listFiles();
			for(File f:files)
			{
			printfile(f, level+1);
			}
		}
		
	}

}
