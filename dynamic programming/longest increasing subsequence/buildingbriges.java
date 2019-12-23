//most important thing is the values of arrays are indices so  ai<aj and bi<bj else the bridges will intersect
import java.io.*;
import java.util.*;
class pair
{
	int x;
	int y;
	pair(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
}
class buildingbriges
{
	public static void main(String[] args) {
		int arr[][]={{6, 2}, {4, 3}, {2, 6}, {1, 5}};
		int n=arr.length;
		pair p[]=new pair[n];
		for(int i=0;i<n;i++)
		{
			p[i]=new pair(arr[i][0],arr[i][1]);
		}
		Arrays.sort(p,new Comparator<pair>()
		{
			public int compare(pair a,pair b)
			{
				return a.y-b.y;
			}
		});

		int dp[]=new int[n];
		Arrays.fill(dp,1);
		int best=0;

		for(int i=1;i<arr.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(p[j].x<=p[i].x)
				{
					dp[i]=Math.max(1+dp[j],dp[i]);
				}
			}
			best=Math.max(best,dp[i]);
		}
		System.out.println(best);
	}
}