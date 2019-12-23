	import java.util.*;
	import java.lang.*;
	import java.io.*;

	class GFG {
		public static void main (String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	  
	        // taking input of number of testcase 
	        int t = Integer.parseInt(br.readLine().trim());
			while(t-->0)
			{
			    int n=Integer.parseInt(br.readLine().trim());
			    String A=Integer.toBinaryString(n);
			    //System.out.println(A);
			    int max_len=0;
                int j=0;
                for(int i=0;i<A.length();i++)
                {
                    if(A.charAt(i)=='1')
                    {
                        max_len=Math.max(max_len,i-j+1);
                    }
                    if(A.charAt(i)=='0')
                    {
                        j=i+1;
                    }
                    
                }
                System.out.println(max_len);

	        }

	    }
	}