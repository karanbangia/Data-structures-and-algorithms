	import java.util.*;
	import java.lang.*;
	import java.io.*;

	class commonelements {
		public static void main (String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	  
	        // taking input of number of testcase 
	        int t = Integer.parseInt(br.readLine());
			while(t-->0)
			{
			    String s[]=br.readLine().trim().split(" ");
			    long a[]=new long[Integer.parseInt(s[0])];
			    String line[] = br.readLine().trim().split(" ");
			    LinkedHashMap<Long,Integer> hm=new LinkedHashMap<>();
	            for(int i=0;i<a.length;i++)
			    {
			        a[i] = Long.parseLong(line[i]);
			       
			        hm.put(a[i],1);
			        
			    }
			    long b[]=new long[Integer.parseInt(s[1])];
			    line = br.readLine().trim().split(" ");
	            for(int i=0;i<b.length;i++)
			    {
			        b[i] = Long.parseLong(line[i]);
			         if(hm.containsKey(b[i]))
			        {
			            if(hm.get(b[i])==1)
			            {
			                hm.put(b[i],2);
			            }
			           
			        }
			    }
			    long c[]=new long[Integer.parseInt(s[2])];
			    line= br.readLine().trim().split(" ");
	            for(int i=0;i<c.length;i++)
			    {
			        c[i] = Long.parseLong(line[i]);
			         if(hm.containsKey(c[i]))
			        {
			           if(hm.get(c[i])==2)
			            {
			                hm.put(c[i],3);
			            }
			        }

			    }
			    int count=0;
			    for(Map.Entry<Long,Integer> entry:hm.entrySet())
                {
                    if(entry.getValue()==3)
                    {
                        System.out.print(entry.getKey()+" ");
                        count++;
                    }
                }
                if(count==0)
                {
                    System.out.print(-1);
                }
                System.out.println();
			     
	        }
	    }
	}