	import java.util.*;
	import java.lang.*;
	import java.io.*;

	class GFG {
		public static void main (String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	  
	        // taking input of number of testcase 
	        int t = Integer.parseInt(br.readLine().trim());
			while(t-->0)
			{
			    int n=Integer.parseInt(br.readLine().trim());
			    int a[]=new int[n];
			    String line[] = br.readLine().trim().split(" ");
	            for(int i=0;i<n;i++)
			    {
			        a[i] = Integer.parseInt(line[i]);
			    }
	        }
	        br.close();
	    }
	}