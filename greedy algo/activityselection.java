import java.util.*;
import java.lang.*;
import java.io.*;

class activity
{
	int ano;
    int finish;
    int start;
    
}
class activityselection {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    int n=Integer.parseInt(br.readLine());
		    int startingt[]=new int[n];
		    String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+");
            for(int i=0;i<n;i++)
		    {
		        startingt[i] = Integer.parseInt(strs[i]);
		    }
		    String s = br.readLine(); 
            String[] k = s.trim().split("\\s+");
            int finishingt[]=new int[n];
            for(int i=0;i<n;i++)
		    {
		        finishingt[i] = Integer.parseInt(k[i]);
		    }

		    activity ob[]=new activity[n];
		    for(int i=0;i<n;i++)
		    {
		        ob[i]=new activity();
		        ob[i].ano=i+1;
		        ob[i].start=startingt[i];
		        ob[i].finish=finishingt[i];
		    }
		    Arrays.sort(ob,new Comparator<activity>(){
		        public int compare(activity a,activity b)
		        {
		            return a.finish-b.finish;
		        }
		    });
		    // for(activity i:ob)
		    // System.out.println(i.finish+" "+i.start);
		    int count=1;
		    int timeF=ob[0].finish;
		    System.out.print(ob[0].ano);
		    for(int i=1;i<n;i++)
		    {
		    	if(ob[i].start>=timeF)
		    	{
		    		timeF=ob[i].finish;
		    		System.out.print(ob[i].ano+" ");
		    	}

		    }
		    // System.out.println(count);
		    // {
		    // 	// System.out.println(i.start+" "+i.finish);

		    // }
		    
        }
        br.close();
    }
}