// /*package whatever //do not write package name here */
// Given an array arr[] of size N where every element is in range from 0 to n-1. Rearrange the given array so that arr[i] becomes arr[arr[i]]. This should be done with O(1) extra space.

// Input:
// First line contains an integer denoting the test cases 'T'. First line of each test case contains an integer value depicting size of array 'N' and next line contains N space separated integers denoting the elements of the array.

// Output:
// Print all elements of the array after rearranging, each separated by a space, in separate line for each test case
import java.util.*;
import java.lang.*;
import java.io.*;

class rearrarange {
	public static void main (String[] args) throws IOException {
// 		Scanner sc=new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int t=Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    int n=Integer.parseInt(br.readLine()); 
		    int a[]=new int[n];
		    String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+"); 
		    for (int i = 0; i < n; i++) 
		    {
                a[i] = Integer.parseInt(strs[i]); 
		    }
		    for(int i=0;i < n;i++)
		    {
		        a[i]+=(a[a[i]]%n)*n;
		        
		     }

		     for(int i=0;i<n;i++)
		     {
		         a[i]=a[i]/n;
		         System.out.print(a[i]+" ");
		     }
		     System.out.println();
		}
		
	}
}