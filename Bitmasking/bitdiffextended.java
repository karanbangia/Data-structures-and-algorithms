import java.util.*;
import java.lang.*;
import java.io.*;

class bitdiffextended {
    static long diffbits(long a,long b)
    {
        long c=a^b;
        long count=0;
       while(c>0)
		{
			c=c&(c-1);
			count ++;
		}
        return count%1000000007;
    }
	
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    int n=Integer.parseInt(br.readLine());
		    long a[]=new long[n];
		    String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+");
            for(int i=0;i<n;i++)
		    {
		        a[i] = Long.parseLong(strs[i]);
		    }
		    long count=0;
		    for(int i=0;i<n;i++)
		    {
		        for(int j=0;j<n;j++)
		        {
		           count=(count%1000000007 +diffbits(a[i],a[j])%1000000007)%1000000007; 
		        }
		    }
		    System.out.println(count%1000000007);
        }
        br.close();
    }
}