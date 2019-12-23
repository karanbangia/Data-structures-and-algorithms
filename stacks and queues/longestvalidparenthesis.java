/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    String a=sc.next();
		    Stack<Integer> s=new Stack<>();
		    s.push(-1);
		    int max_len=0;
		    for(int i=0;i<a.length();i++)
		    {
		        if(a.charAt(i)=='(')
		        {
		            s.push(i);
		        }
		        else
		        {
		            
		            s.pop();
		            if(!s.isEmpty())
		            {
		             max_len=Math.max(max_len,i-s.peek());     
		            }
		            else
		            {
		                s.push(i);
		            }    
		            
		        }
		    }
		    System.out.println(max_len);
		}
	}
}