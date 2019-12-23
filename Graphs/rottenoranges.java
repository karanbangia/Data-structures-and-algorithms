import java.util.*;
import java.lang.*;
import java.io.*;
class points
{
	int x;
	int y;
	points(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
}
class rottenoranges {
	public static void bfs(int a[][],int n,int k)
	{
		Queue<points> Q=new LinkedList<>();
		points p;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<k;j++)
			{
				if(a[i][j]==2)
				{
					Q.add(new points(i,j));
				}
			}
		}
		

	}
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String s=br.readLine();
			String strl[]=s.trim().split("\\s+");
		    int n=Integer.parseInt(strl[0]);
		    int k=Integer.parseInt(strl[1]);
		    int a[][]=new int[n][k];
		    String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+");
            int l=0; 
            for(int i=0;i<n;i++)
		    {
		    	for(int j=0;j<k;j++)
		    	{
		    		 a[i][j] = Integer.parseInt(strs[l++]);
		    	}
		       
		    }
		    bfs(an,k);

        }
        br.close();
    }
}
