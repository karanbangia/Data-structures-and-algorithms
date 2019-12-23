import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    int n=Integer.parseInt(br.readLine());
		    int dp[]=new int[n+1];
		    
		    if(n==1 || n==0){
		        System.out.println(1);
		    }
		    else if(n==2)
		    {
		       System.out.println(2); 
		    }
		    else
		   { dp[0]=1;
		    dp[1]=1;
		    dp[2]=2;
		    for(int i=3;i<=n;i++)
		    {
		        dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
		    }
		    System.out.println(dp[n]);}
        }
        br.close();
    }
}