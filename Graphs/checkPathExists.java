
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
class checkPathExists
{
	static boolean isAllowed(int x,int y,int n)
	{
		
		if(x>=0 && x<n && y>=0 && y<n)
		{
			return true;
		}
		return false;
	}
	static boolean pathExists(int arr[][],point a,point b,int n)
	{
		Stack<point> s=new Stack<>();
		boolean isVisited[][]=new boolean[n][n];
		isVisited[a.x][a.y]=true;
		s.push(a);
		while(!s.isEmpty())
		{
			point rv=s.pop();
			if(arr[rv.x][rv.y]==arr[b.x][b.y])
			{
				return true;
			}
			if(isAllowed(rv.x+1,rv.y,n))
			{
				if(!isVisited[rv.x+1][rv.y] && arr[rv.x+1][rv.y]!=0)
				{
					
					isVisited[rv.x+1][rv.y]=true;
					s.push(new point(rv.x+1,rv.y));
					
				}
			}
			if(isAllowed(rv.x,rv.y+1,n))
			{
				if(!isVisited[rv.x][rv.y+1] && arr[rv.x][rv.y+1]!=0)
				{
					
					isVisited[rv.x][rv.y+1]=true;
					s.push(new point(rv.x,rv.y+1));
					
				}
			}
			if(isAllowed(rv.x,rv.y-1,n))
			{
				if(!isVisited[rv.x][rv.y-1] && arr[rv.x][rv.y-1]!=0)
				{
					
					isVisited[rv.x][rv.y-1]=true;
					s.push(new point(rv.x,rv.y-1));
					
				}
			}
			if(isAllowed(rv.x-1,rv.y,n))
			{
				if(!isVisited[rv.x-1][rv.y] && arr[rv.x-1][rv.y]!=0)
				{
					
					isVisited[rv.x-1][rv.y]=true;
					s.push(new point(rv.x-1,rv.y));
					
				}
			}
			
			
		}
		return false;
		
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
			String[] strs = line.trim().split(" ");
			int k=0;
			point ob1=null;
			point ob2=null;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					a[i][j] = Integer.parseInt(strs[k++]); 
					if(a[i][j]==1)
					{
						ob1=new point(i,j);
						
					}
					if(a[i][j]==2)
					{
						ob2=new point(i,j);
					}
				}
				
			}
			if(pathExists(a,ob1,ob2,n))
			{
				System.out.println(1);
			}
			else
			{
				System.out.println(0);
			}
			
		}
	}
}