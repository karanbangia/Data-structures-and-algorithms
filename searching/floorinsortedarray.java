/*Given a sorted array arr[] of size N without duplicates, and given a value x. Find the floor of x in given array. Floor of x is defined as the largest element K in arr[] such that K is smaller than or equal to x.

Input:
First line of input contains number of testcases T. For each testcase, first line of input contains number of elements in the array and element whose floor is to be searched. Last line of input contains array elements.

Output:
Output the index of floor of x if exists, else print -1.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 107
1 ≤ arr[i] ≤ 1018
0 ≤ X ≤ arr[n-1]

Example:
Input:
3
7 0
1 2 8 10 11 12 19
7 5
1 2 8 10 11 12 19
7 10
1 2 8 10 11 12 19

Output:
-1
1
3

Explanation:
Testcase 1: No element less than 0 is found. So output is "-1".*/
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int floorsolver(long a[],int n,long k)
    {
        int l=0;
        int r=n-1;
        int result=-1;
        while(r>=l)
        {
            int mid=(l+r)/2;
            if(a[mid]==k)
            {
                result=mid;
                return result;
            }
            if(a[mid]>k)
            {
                r=mid-1;
            }
            if(a[mid]<k)
            {
              l=mid+1;
              result=mid;
            }
           
            
        }
         return result;
    }
	public static void main (String[] args)throws IOException {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(input.readLine());
		while(t-->0)
		{
		    String s=input.readLine();
		    String sl[]=s.split(" ");
		    int n=Integer.parseInt(sl[0]);
		    long k=Long.parseLong(sl[1]);
		    String g=input.readLine();
		    String gi[]=g.split(" ");
		    long a[]=new long[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=Long.parseLong(gi[i]);
		    }
		    int ans=floorsolver(a,n,k);
		    System.out.println(ans);  
		    
		}
		input.close();
	}
}