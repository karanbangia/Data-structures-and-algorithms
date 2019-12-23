import java.util.*;
import java.lang.*;
import java.io.*;

class minimumjumpstoreachend {
	static int ans(int a[],int n)
	{
		if(a[0]==0)return -1;
		int jump[]=new int[n];
		Arrays.fill(jump,Integer.MAX_VALUE);
		jump[0]=0;
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(j+a[j]>=i)
				{
					jump[i]=Math.min(jump[j]+1,jump[i]);
				}
				
			}
		}
		if(jump[n-1]==Integer.MAX_VALUE)
		{
		    return -1;
		}
		return jump[n-1];

	}
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    int n=Integer.parseInt(br.readLine());
		    int a[]=new int[n];
		    String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+");
            for(int i=0;i<n;i++)
		    {
		        a[i] = Integer.parseInt(strs[i]);
		    }
		    System.out.println(ans(a,n));
        }
        br.close();
    }
}