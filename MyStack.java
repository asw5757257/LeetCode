package leetcode;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
	 /** Initialize your data structure here. */
	public Queue<Integer> q1;
	public Queue<Integer> q2;
    public MyStack() {
        q1= new LinkedList<Integer>();
         q2= new LinkedList<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
    	q1.offer(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
    	int k=0;
        while(q1.size()!=1)
        {
        	q2.offer(q1.peek());
        	q1.poll();
        }
        k=q1.peek();
        q1.poll();
        while(q2.isEmpty())
        {
        	q1.offer(q2.peek());
        	q2.poll();
        }
        return k;
        
    }
    
    /** Get the top element. */
    public int top() {
    	int k=0;
        while(q1.size()!=1)
        {
        	q2.offer(q1.peek());
        	q1.poll();
        }
        k=q1.peek();
        q2.offer(q1.peek());
        q1.poll();
        while(q2.isEmpty())
        {
        	q1.offer(q2.peek());
        	q2.poll();
        }
        return k;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }
}
