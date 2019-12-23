
import java.util.*;
import java.lang.*;
import java.io.*;



class GFG {
        static long steps(int n)
{
    if(n==0 || n==1 ||n==2)
    {
        return n;
    }
    long first=1;
    long second=2;
    for(int i=3;i<=n;i++)
    {
     long ans=(first%1000000007+second%1000000007)%1000000007;
     first=second;
     second=ans;
    }
    return second;
}
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    int n=Integer.parseInt(br.readLine());
		   System.out.println(steps(n));
        }
        br.close();
    }
}