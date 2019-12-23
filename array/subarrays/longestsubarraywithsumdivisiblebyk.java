
//longestsubarraywithsumdivisiblebyk
import java.util.*;
import java.lang.*;
import java.io.*;

class longestsubarraywithsumdivisiblebyk
{
    public  static int ans(int arr[],int n,int k)
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int prefix[]=new int[n];
        prefix[0]=arr[0];
       // hm.put(prefix[0],0);
        int max_len=Integer.MIN_VALUE;
       // HashSet<Integer> hs=new HashSet<>();
       // hs.add(prefix[0]);
        for(int i=1;i<n;i++)
        {
            prefix[i]=prefix[i-1]+arr[i];
            // if(!.hs.contains(prefix[i]))
            // {
              //  hm.put(prefix[i],i); 
            //}
        }
        for(int i=0;i<n;i++)
        {
            int curr_rem=prefix[i]%k;
            if(curr_rem==0)
            {

                if(max_len<i+1)
                {
                    max_len=i+1;
                }
            }
            
           else if(hm.containsKey(curr_rem))
            {
               int len=i-hm.get(curr_rem)+1;
               if(len>max_len)
               {
                   max_len=len;
               }
            }

            if (!hm.containsKey(prefix[i]))
             { 
                hm.put(prefix[i], i); 
             } 
   
          
        }
        if(max_len==Integer.MIN_VALUE)
        {
            return 0;
        }
        return max_len;
        
    }
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine());
        while(t-->0)
        {
            
            String line = br.readLine(); 
            String[] str = line.trim().split("\\s+");
            int n=Integer.parseInt(str[0]);
            int k=Integer.parseInt(str[1]);
            int a[]=new int[n];
            line = br.readLine(); 
            String[] strs = line.trim().split("\\s+");
            for(int i=0;i<n;i++)
            {
                a[i] = Integer.parseInt(strs[i]);
            }
            System.out.println(ans(a,n,k));
        }
        br.close();
    }
}