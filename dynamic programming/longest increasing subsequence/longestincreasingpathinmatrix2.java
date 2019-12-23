class Solution {
        static class point
		{
			int x;
			int y;
			point(int x,int y)
			{
				this.x=x;
				this.y=y;
			}
		}
    	boolean isSafe(int n,int m,int i,int j)
		{
			if(i<n && j<m && i>=0 && j>=0)
				return true;
			return false;
		}
    	 int dfs(int mat[][],int n,int m)
		{
			int dp[][]=new int[n][m];
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					dp[i][j]=1;
				}
			}
			Stack<point> s=new Stack<>();
            for(int i1=0;i1<n;i1++)
            {
                for(int j1=0;j1<m;j1++)
                {
                    s.push(new point(i1,j1));
                    while(!s.isEmpty())
                    {
                        point rv=s.pop();
                        int i=rv.x;
                        int j=rv.y;
                        if(isSafe(n,m,i+1,j))
                        {
                            if(mat[i+1][j]>mat[i][j])
                            {
                                dp[i+1][j]=Math.max(dp[i+1][j],dp[i][j]+1);
                                s.push(new point(i+1,j));
                            }
                        }
                        if(isSafe(n,m,i,j+1))
                        {
                            if(mat[i][j+1]>mat[i][j])
                            {
                                dp[i][j+1]=Math.max(dp[i][j+1],dp[i][j]+1);
                                s.push(new point(i,j+1));
                            }

                        }
                        if(isSafe(n,m,i-1,j))
                        {
                            if(mat[i-1][j]>mat[i][j])
                            {

                                dp[i-1][j]=Math.max(dp[i-1][j],dp[i][j]+1);
                                s.push(new point(i-1,j));
                            }

                        }
                         if(isSafe(n,m,i,j-1))
                        {
                            if(mat[i][j]<mat[i][j-1])
                            {

                                dp[i][j-1]=Math.max(dp[i][j-1],dp[i][j]+1);
                                s.push(new point(i,j-1));
                            }

                        }


                    } 
                }
            }
			
			int max=Integer.MIN_VALUE;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					max=Math.max(max,dp[i][j]);
				}
			}
			return max;

		}
    public int longestIncreasingPath(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        return dfs(matrix,n,m);
        
    }
}