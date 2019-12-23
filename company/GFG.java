/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int findoptimal(int n)
    {
        
		if(n<=6)
		{
			return n;
		}
		int max=0;
		for(int i=n-3;i>=1;i--)
		{
			int curr=(n-i-1)*findoptimal(i);
			if(curr>max)
			{
				max=curr;
			}
		}
		return max;
    }
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
	    int arr[]=new int[t];
	    for(int i=0;i<t;i++)
	    {
	     arr[i]=sc.nextInt();  
	    }
	    for(int i=0;i<t;i++)
	    {
	      int ans=findoptimal(arr[i]);
	      System.out.println(ans);  
	    }
		   
		
		
	}
}