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
		    int n=Integer.parseInt(br.readLine());
		    int a[]=new int[n];
		    String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+");
            for(int i=0;i<n;i++)
		    {
		        a[i] = Integer.parseInt(strs[i]);
		    }
		    Stack<Integer> s=new Stack<>();
		    s.push(0);
		    int ans[]=new int[n];
		    ans[0]=1;
		    for(int i=1;i<n;i++)
		    {
		        if(a[i]<a[i-1])
		        {
		            s.push(i);
		            ans[i]=1;
		        }
		        else if(a[i]>=a[i-1])
		        {
		            int c=1;
		            while(!s.isEmpty() && a[s.peek()]<=a[i] )
		            {
		                int x=s.pop();
		                c+=ans[x];
		                
		                
		            }
		            s.push(i);
		            ans[i]=c;
		        }
		    }
		    for(int i=0;i<n;i++)
		    {
		        System.out.print(ans[i]+" ");
		    }
		    System.out.println();
        }
        br.close();
    }
}