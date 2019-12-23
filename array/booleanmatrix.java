import java.util.*;
import java.lang.*;
import java.io.*;

class booleanmatrix {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String line = br.readLine(); 
            String[] strs = line.trim().split(" ");
		    int n=Integer.parseInt(strs[0]);
		    int m=Integer.parseInt(strs[1]);
		    int mat[][]=new int[n][m];
            int row[]=new int[n];
		    int col[]=new int[m];
            for(int i=0;i<n;i++)
		    {
		        
		        	line = br.readLine(); 
            		String[] str = line.trim().split(" ");
            		for(int j=0;j<m;j++)
		      	    {
		             mat[i][j] = Integer.parseInt(str[j]);
		             if(mat[i][j]==1)
		             {
		                 row[i]=1;
		                 col[j]=1;
		             }
		        }
		       
		    }
		    for(int i=0;i<n;i++)
		    {
		        for(int j=0;j<m;j++)
		        {
		             if(row[i]==1 || col[j]==1)
		             {
		                 mat[i][j]=1;
		             }
		        }
		       
		    }
		    for(int i=0;i<n;i++)
		    {
		        for(int j=0;j<m;j++)
		        {
		            System.out.print(mat[i][j]);
		        }
                System.out.println();
		    }
		    
        }
        br.close();
    }
}