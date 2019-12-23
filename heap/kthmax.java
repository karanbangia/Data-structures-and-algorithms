import java.util.*;
import java.lang.*;
import java.io.*;
class activity
{
    int x;
}
class kthmax {
	
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
	        activity ob[]=new activity[n];
            for(int i=0;i<n;i++)
		    {
		        a[i] = Integer.parseInt(strs[i]);
		        ob[i]=new activity();
		        ob[i].x=a[i];
		    }
		    PriorityQueue<activity> pq=new PriorityQueue<activity>(ob,new Comparator<activity>()
		    {
		        public int compare(activity a,activity b)
		        {
		            return a.x-b.x;
		        }
		    });
	        for(int i=0;i<k-1;i++)
	        {
	            pq.poll();
	        }
	        System.out.println(pq.poll());
    }
}
}