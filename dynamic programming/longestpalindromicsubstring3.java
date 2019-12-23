import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static String lps(String a,int n)
    {
        int start=0;
        int max_length=1;
        int low=0;
        int high=0;
        
        for(int i=1;i<n;i++)
        {
            low=i-1;
            high=i;
            while(low>=0 && high<n && a.charAt(low)==a.charAt(high))
            {
                if(high-low+1>max_length)
                {
                    start=low;
                    max_length=high-low+1;
                }
                low--;
                high++;
                
            }
            low=i-1;
            high=i+1;
            while(low>=0 && high<n && a.charAt(low)==a.charAt(high))
            {
                if(high-low+1>max_length)
                {
                    start=low;
                    max_length=high-low+1;
                }
                low--;
                high++;
                
            }
            
        }
        return a.substring(start,start+max_length);
    }
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String a=br.readLine();
		    int n=a.length();
		    System.out.println(lps(a,n));
		    
		   
        }
        br.close();
    }
}