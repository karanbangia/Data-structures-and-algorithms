/* Given an array A of positive integers. Your task is to sort them in such a way that the first part of the array contains odd numbers sorted in descending order, rest portion contains even numbers sorted in ascending order.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains an integer N denoting the size of the array. The next line contains N space separated values of the array.

Output:
For each test case in a new line print the space separated values of the modified array.

Constraints:
1 <= T <= 103
1 <= N <= 107
0 <= Ai <= 1018

Example:
Input:
2
7
1 2 3 5 4 7 10
7
0 4 5 3 7 2 1

Output:
7 5 3 1 2 4 10
7 5 3 1 0 2 4

Explanation:
Testcase1: Array elements 7 5 3 1 are odd and sorted in descending order, whereas 2 4 10 are even numbers and sorted in ascending order.*/


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String s=br.readLine();
		    String strl[]=s.trim().split("\\s+");
		    int n=Integer.parseInt(strl[0]);
		    int a[]=new int[n];
		    String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+");
            for(int i=0;i<n;i++)
		    {
		        a[i] = Integer.parseInt(strs[i]);
		    }
		    Arrays.sort(a);
		    Stack<Integer> stack=new Stack<Integer>();
		    for(int i=0;i<n;i++)
		    {
		        if(a[i]%2!=0)
		        {
		            stack.push(a[i]);
		        }
		    }
		    StringBuffer sb = new StringBuffer(); 
		    while(!stack.empty())
		    {
		        sb.append(stack.pop()+" ");
		    }
		    for(int i=0;i<n;i++)
		    {
		        if(a[i]%2==0)
		        {
		            sb.append(a[i]+" ");
		        }
		    }
		    System.out.println(sb);
        }
        br.close();
    }
}