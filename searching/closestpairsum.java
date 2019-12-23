/*Given two arrays and a number x, find the pair whose sum is closest to x and the pair has an element from each array.

Input:
The first line consists of a single integer T, the number of test cases. For each test case, the first line contains 2 integers n & m denoting the size of two arrays. Next line contains n- space separated integers denoting the elements of array A and next lines contains m space separated integers denoting the elements of array B followed by an integer x denoting the number whose closest sum is to find.

Output:
For each test case, the output is 2 space separated integers whose sum is closest to x.  

Constraints:
1<=T<=100
1<=n,m<=50
1<=A[i],B[i]<=500

Example:
Input:
2
4 4
1 4 5 7
10 20 30 40
32
4 4
1 4 5 7
10 20 30 40
50
Output: 
1 30
7 40*/
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static void solver(int a1[],int a2[],int n,int m,int x)
    {
        int l=0;
        int r=m-1;
        int diff=Integer.MAX_VALUE;
        int xl=0;
        int xr=0;
        while(l<n && r>=0)
        {
            if(Math.abs(a1[l] +a2[r]-x)<diff)
            {
                diff=Math.abs(a1[l] +a2[r]-x);
                xl=a1[l];
                xr=a2[r];
            }
            if((a1[l]+a2[r])<x)
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        System.out.println(xl+" "+xr);
    }
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String s=br.readLine();
			String strl[]=s.trim().split("\\s+");
		    int n=Integer.parseInt(strl[0]);
		    int m=Integer.parseInt(strl[1]);
		    int a1[]=new int[n];
		    int a2[]=new int[m];
		    String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+");
            for(int i=0;i<n;i++)
		    {
		        a1[i] = Integer.parseInt(strs[i]);
		    }
		    String gi = br.readLine(); 
            String[] li = gi.trim().split("\\s+");
		    for(int i=0;i<m;i++)
		    {
		        a2[i] = Integer.parseInt(li[i]);
		    }
		    int x=Integer.parseInt(br.readLine());
		    solver(a1,a2,n,m,x);
		    
        }
        br.close();
    }
}