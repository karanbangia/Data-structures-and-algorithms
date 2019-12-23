import java.util.*;
import java.lang.*;
import java.io.*;

class max_of_all_subarrays {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String s=br.readLine();
			String strl[]=s.trim().split("\\s+");
		    int n=Integer.parseInt(strl[0]);
		    int k=Integer.parseInt(strl[1]);
		    int a[]=new int[n];
		    String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+");
            for(int j=0;j<n;j++)
		    {
		        a[j] = Integer.parseInt(strs[j]);
		    }
		    PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		    int i=0;
		    for(i=0;i<k;i++)
		    {
		        pq.add(a[i]);
		    }
		    System.out.print(pq.peek()+" ");
		    for(;i<n;i++)
		    {
		    	pq.remove(a[i-k]);
		    	pq.add(a[i]);
		        System.out.print(pq.peek()+" ");
		        
		      
		    }
		    System.out.println();
        }
        br.close();
    }
}
