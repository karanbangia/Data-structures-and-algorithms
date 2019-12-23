/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

class combinationsum {
    static boolean combination(int a[],int sum,int i,int n,int sum2)
    {
        if(sum==0)
        { 
        	System.out.print("("+a[i]);
            return true;
        }

        for(int j=0;j<=n;j++)
        {  
            if((sum-a[j])>=0)
            {
	             sum-=a[j];
	             int ans=combination(a,sum,j,n);  
	             if(ans==true)
	             {
	             	System.out.print(a[j]);
	             	return true;
	             }
	             else
	             {
	             	sum=sum+a[j];
	             	combination(a,sum,j,n);
	             }


            }
       
            
        }
         if(sum==sum2)
        {
        	System.out.print(a[i]+")");
        	return true;
        }
        return false;
   
    }
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    int sum=sc.nextInt();
		    Arrays.sort(arr);
		    HashMap<Integer,Integer> hm=new HashMap<>();
		    for(int i=0;i<n;i++)
		    {
		        if(hm.get(arr[i])==null)
		        {
		            hm.put(arr[i],1);
		        }
		    }
		    int n2=hm.size();
		    int a[]=new int[n2];
		    int j=0;
		   for (Map.Entry<Integer,Integer> entry : hm.entrySet())  
            {
                a[j]=entry.getKey();
                j++;
            }
		    combination(a,sum,0,n2-1,sum);
		}
	}
}