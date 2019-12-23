	import java.util.*;
	import java.lang.*;
	import java.io.*;

	class nonrepeatingchar{
		public static void main (String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	  
	        // taking input of number of testcase 
	        int t = Integer.parseInt(br.readLine());
			while(t-->0)
			{
			    int n=Integer.parseInt(br.readLine().trim());
			    String s=br.readLine();
			    int count[]=new int[26];
			    Arrays.fill(count,-1);
			    for(int i=0;i<n;i++)
			    {
			        char c=s.charAt(i);
			        if(count[c-'a']==-1)
			        {
			            count[c-'a']=i;
			        }
			        else
			        {
			             count[c-'a']=-2;
			        }
			    }
			    int min=Integer.MAX_VALUE;
			    int k=0;
			    for(int i=0;i<26;i++)
			    {
			        if(count[i]>=0 && count[i]<min)
			        {
			            min=count[i];
			            k=i;
			        }
			        
			    }
			    if(min==Integer.MAX_VALUE)
			    {
			        System.out.println(-1);
			    }
			    else
			    {
			        char z=(char)(97+k);
			        System.out.println(z);
			    }
			    
			   
	        }
	        br.close();
	    }
	}