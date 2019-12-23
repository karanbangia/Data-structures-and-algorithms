import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int sum=0;
    static int best=Integer.MIN_VALUE;

    // static int zigzag(int a[][],int n)
    // {
    //     if(n==0)return 0;
    //     for(int i=1;i<=n;i++)
    //     {
    //         for(int j=1;j<=n;j++)
    //         {
    //             sum+=a[n-i][n-j]+zigzag(a,n-1);
    //         }
    //         best=Math.max(best,sum);
    //     }
    //     return best;
        
    // }
    static int zigzag(int a[][],int n,int row,int col,int sum)
    {
        if(row==n)return sum;
        for(int i=0;i<n;i++)
            {
                if(i!=col)
                {
                    int tempsum=a[row][i]+sum;
                    int ans=zigzag(a,n,row+1,i,tempsum);
                    best=Math.max(best,ans);
                 }   
                
            }
           
        
        return best;
    }
   
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    int n=Integer.parseInt(br.readLine());
		    int a[][]=new int[n][n];
		    String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+");
            int k=0;
            for(int i=0;i<n;i++)
		    {
		        for(int j=0;j<n;j++)
		        {
		            a[i][j]=Integer.parseInt(strs[k]);
		            k++;
		        }
		    }
		    System.out.println(zigzag(a,n,0,-1,0));
        }
        br.close();
    }
}