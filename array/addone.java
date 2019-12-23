/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class addone {
	public static void main (String[] args) throws IOException  {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String a=br.readLine();
		    String s[]=a.trim().split(" ");
		    int n=Integer.parseInt(s[0]);
		    int k=Integer.parseInt(s[1]);
		    a=br.readLine();
		    String str[]=a.trim().split(" ");
		    int arr[]=new int[k];
		    for(int i=0;i<k;i++)
		    {
		        arr[i]=Integer.parseInt(str[i])-1;
		    }
		    int mainarr[]=new int[n];
		    for(int i=0;i<k;i++)
		    {
		        for(int j=0;j<n;j++)
		        {
		            if(j>=arr[i])
		            {
		                mainarr[j]+=1;
		            }
		        }
		    }
		    for(int i=0;i<n;i++)
		    {
		        System.out.print(mainarr[i]+" ");
		    }
		}
	}
}