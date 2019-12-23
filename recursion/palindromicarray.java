import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int count=0;
    
	static  void palindrome(int a[],int i,int j)
	{
	    if(i>j)return;
	    if(a[i]==a[j])
	    {
	        palindrome(a,i+1,j-1);
	    }
	    if(a[i]<a[j])
	    {
	        a[i+1]+=a[i];
	        count++;
	        palindrome(a,i+1,j);
	        
	    }
	       if(a[i]>a[j])
	    {
	        a[j-1]+=a[j];
	        count++;
	        palindrome(a,i,j-1);
	        
	    }
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
			    palindrome(a,0,n-1);
			    System.out.println(count);
		        count=0;
        }
        br.close();
    }
}