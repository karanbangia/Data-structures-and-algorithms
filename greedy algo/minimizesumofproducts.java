import java.util.*;
import java.lang.*;
import java.io.*;
class karan
{
    long alpha;
  
}
class GFG {
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
		    line=br.readLine();
		    String k[]=line.trim().split("\\s+");
		    long b[]=new long[n];
		    karan ob[]=new karan[n];
		    for(int i=0;i<n;i++)
		    {
		        ob[i]=new karan();
		        b[i] = Long.parseLong(k[i]);
		        ob[i].alpha=b[i];
		        
		    }
		    Arrays.sort(a);
		    Arrays.sort(ob,new Comparator<karan>()
		    {
		        public int compare(karan a,karan b)
		        {
		            if(a.alpha>b.alpha)
		    			return -1;
		    		else if(a.alpha<b.alpha)
		    			return 1;
		    		else
		    			return 0;
		        }
		    });
		    long sum=0;
		    for(int i=0;i<n;i++)
		    {
		        sum+=a[i]*ob[i].alpha;
		    }
		    System.out.println(sum);
		    
		    
        }
        br.close();
    }
}