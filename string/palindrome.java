/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class palindrome {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int temp=0;
		    char a[]=new char[n];
		    for(int i=0;i<n;i++)
		    {
		        char c=sc.next().charAt(0); 
		        a[i]= c;
		    }
		    for(int i=0;i<n/2;i++)
		    {
		        if(a[i]!=a[n-i-1])
		        {
		            temp=1;
		            break;
		        }
		    }
		    if(temp==1)
		    {
		        System.out.println("No");
		    }
		    else
		    {
		        System.out.println("Yes");
		    }
		}
	}
}