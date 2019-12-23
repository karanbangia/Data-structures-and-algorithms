import java.util.*;
import java.lang.*;
import java.io.*;

class zerosumsubarrays {
    static long ans(long arr[],int n)
    {
        HashMap<Long,Long> hm=new HashMap<>();
        hm.put((long)0,(long)1);
        long count=0;
        long sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(hm.containsKey(sum))
            {
                count+=hm.get(sum);
                long num=hm.get(sum);
                hm.put(sum,num+1);
            }    
            else
            {
                hm.put(sum,(long)1);
            }
        }
        return count;
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
            System.out.println(ans(a,n));
        }
        br.close();
    }
}
//6 3 -1 -3 4 -2 2 4 6 -12 -7