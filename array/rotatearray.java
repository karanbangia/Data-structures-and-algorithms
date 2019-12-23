/* input is a string*/
/*package whatever //do not write package name here */

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
		    String[] splitStr = s.split("\\s+");
		    int n=Integer.parseInt(splitStr[0]);
		    int d=Integer.parseInt(splitStr[1]);
		    int a[]=new int[n];
		    String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+");
		    for(int i=0;i<n;i++)
		    {
		        a[i] = Integer.parseInt(strs[i]);
		    }
		    StringBuffer sb = new StringBuffer(); 
		    for(int i=0;i<n;i++)
		    {
		        sb.append(a[(i+d)%n] + " "); 
		    }
		    System.out.println(sb);
		}
		br.close();
		
	}
}