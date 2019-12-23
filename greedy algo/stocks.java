import java.util.*;
import java.lang.*;
import java.io.*;

class stocks {
	
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
		    int b[]=new int[n];
		    b[0]=a[0];
		   for(int i=1;i<n;i++)
		   {
		       b[i]=a[i]-a[i-1];
		   }
		   int x=0;
		   int y=0;
		   for(int i=0;i<n-1;i++)
		   {
		   	   if(i==n-2 && b[n-1]>=0)
		   	   {
		   	   	y=i+1;
		   	   	System.out.print("("+x+","+y+")"); 
		   	   	
		   	   }
		       if(b[i+1]<0)
		       {
		           y=i;
		           if(x==0 && y==0)
		           {
		               continue;
		           }
		          System.out.print("("+x+","+y+")"); 
		          x=0;
		          y=0;
		       }
		       if(b[i]<0)
		       {
	         
	               x=i;
	               //count++;
	           
		       }
		   }
        }
        br.close();
    }
}