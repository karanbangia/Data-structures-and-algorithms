
import java.util.*;
import java.lang.*;
import java.io.*;
class point
{
	int x;
	int y;
	point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
}
class number_of_island
{
	static int findIslands(int mat[][], int N, int M)
    {
        
         boolean isVisited[][]=new boolean[N][M];
         int count=0;
         for(int i=0;i<N;i++)
         {
             for(int j=0;j<M;j++)
             {
                 if(!isVisited[i][j] && mat[i][j]==1)
                 {
                    isVisited[i][j]=true;
                    dfs(mat,isVisited,i,j,N,M); 
                    count++;
                 }
             }
         }
         return count;     
    }
	 static void dfs(int mat[][],boolean isVisited[][],int a,int b,int N,int M)
    {
        int count=0;
        Stack<point> s=new Stack<>();
        s.push(new point(a,b));
        while(!s.isEmpty())
        {
            point rv=s.pop();
            int i=rv.x;
            int j=rv.y;
            traverseNodes(mat,isVisited,i,j,N,M,s);
           	
        }
      
    }
	static void traverseNodes(int mat[][],boolean isVisited[][],int a,int b,int N,int M,Stack<point> s)
	{

		if(isAllowed(a+1,b,N,M))
			{
				if(!isVisited[a+1][b] && mat[a+1][b]!=0)
				{
					
					isVisited[a+1][b]=true;
					s.push(new point(a+1,b));
					
				}
			}
			if(isAllowed(a,b+1,N,M))
			{
				if(!isVisited[a][b+1] && mat[a][b+1]!=0)
				{
					
					isVisited[a][b+1]=true;
					s.push(new point(a,b+1));
					
				}
			}
			if(isAllowed(a,b-1,N,M))
			{
				if(!isVisited[a][b-1] && mat[a][b-1]!=0)
				{
					
					isVisited[a][b-1]=true;
					s.push(new point(a,b-1));
					
				}
			}
			if(isAllowed(a-1,b,N,M))
			{
				if(!isVisited[a-1][b] && mat[a-1][b]!=0)
				{
					
					isVisited[a-1][b]=true;
					s.push(new point(a-1,b));
					
				}
			}
			if(isAllowed(a-1,b-1,N,M))
			{
				if(!isVisited[a-1][b-1] && mat[a-1][b-1]!=0)
				{
					
					isVisited[a-1][b-1]=true;
					s.push(new point(a-1,b-1));
					
				}
			}
				if(isAllowed(a+1,b+1,N,M))
			{
				if(!isVisited[a+1][b+1] && mat[a+1][b+1]!=0)
				{
					
					isVisited[a+1][b+1]=true;
					s.push(new point(a+1,b+1));
					
				}
			}

	}

	
	static boolean isAllowed(int x,int y,int N,int M)
	{
		
		if(x>=0 && x<M && y>=0 && y<M)
		{
			return true;
		}
		return false;
	}
	
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
	        // taking input of number of testcase 
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String line = br.readLine(); 
			String[] strl = line.trim().split(" ");
			int n=Integer.parseInt(strl[0]);
			int m=Integer.parseInt(strl[1]);
			int a[][]=new int[n][m];
			line = br.readLine(); 
			String[] strs = line.trim().split(" ");
			int k=0;
			int count=0;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					a[i][j] = Integer.parseInt(strs[k++]); 
					
				}
				
			}

			int ans=findIslands(a,n,m);
			System.out.println(ans);
			
			
		}
	}
}