/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class firstsetbit {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int count=0;
		    int temp=0;
		    while(n>0)
		    {
		        if((n&1)==1)
		        {
		         count++;
		         temp=1;
		         break;
		        }
		        
		    count++;
		    n=n>>1;
		    }
		    if(temp==1)
		    {
		        System.out.println(count);
		    }
		    else
		    {
		        System.out.println('0');
		    }

		}
	}
}