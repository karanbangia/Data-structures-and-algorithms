import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static boolean ans(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                return true;
            }
            
        }
        HashSet<Integer> hs=new HashSet<>();
        int prefix[]=new int[n];
        prefix[0]=arr[0];
        hs.add(prefix[0]);
        for(int i=1;i<n;i++)
        {
            prefix[i]=prefix[i-1]+arr[i];
            if(prefix[i]==0)
            {
                return true;
            }
            if(!hs.contains(prefix[i]))
            {
                hs.add(prefix[i]);
            }
            
           else  if(hs.contains(prefix[i]))
            {
                return true;
            }
            
        }
        return false;
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
		    if(ans(a,n))
		    {
		        System.out.println("Yes");
		    }
		    else
		    {
		        System.out.println("No");
		    }
        }
        br.close();
    }
}