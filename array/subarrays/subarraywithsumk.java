import java.util.*;
import java.lang.*;
import java.io.*;

class subarraywithsumk {
    static void ans(int a[],int n,int k)
    {
        int prefix[]=new int[n];
        prefix[0]=a[0];
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(prefix[0],1);
        for(int i=1;i<n;i++)
        {
            prefix[i]=prefix[i-1]+a[i];
            hm.put(prefix[i],i+1);
        }
        int flag=0;
        for(int i=0;i<n;i++)
        {
            if(prefix[i]==k)
            {
                int end=i+1;
                System.out.println(1+" "+end);
                flag=1;
                break;
            }
           if(hm.containsKey(prefix[i]-k))
            {
                int strt=hm.get(prefix[i]-k)+1;
                int end=i+1;
                System.out.println(strt+" "+end);
                flag=1;
                break;
            }
            
            
        }
        if(flag==0)
        {
            System.out.println(-1);
        }
        
    }
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String line=br.readLine();
		    String s[]=line.trim().split(" ");
		    int n=Integer.parseInt(s[0]);
		    int k=Integer.parseInt(s[1]);
		    int a[]=new int[n];
		    line = br.readLine(); 
            String[] strs = line.trim().split(" ");
            for(int i=0;i<n;i++)
		    {
		        a[i] = Integer.parseInt(strs[i]);
		    }
		    ans(a,n,k);
        }

    }
}