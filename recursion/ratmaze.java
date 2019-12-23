// rat in a maze questions
class ratmaze
{	static int count=0;
	static boolean isSafe(int board[][],int i,int j,int n,int m)
	{
		if(i<n && j<m && i>=0 && j>=0)
		{
			return true;
		}
		return false;

	}
	static boolean mazeSolver(int board[][],int sol[][],int i,int j,int n,int m)
	{
		if(i==n-1 && j==m-1)
		{
			count++;
			sol[i][j]=1;
			// for(int x=0;x<n;x++)
			// {
			// 	for(int y=0;y<m;y++)
			// 	{
			// 		System.out.print(sol[x][y]);
			// 	}
			// 	System.out.println();
				
			// }
			// System.out.println();
			return true;
		}
		if(!isSafe(board,i,j,n,m))
		{
			return false;
		}
		if(board[i][j]==0)
			{
				sol[i][j]=1;
				mazeSolver(board,sol,i,j+1,n,m);
				mazeSolver(board,sol,i+1,j,n,m);
				sol[i][j]=0; 
			} 

		if(board[i][j]==1)
		{
			sol[i][j]=0;
			return false;	
		}
			

		return false;
	}
	public static void main(String[] args) {
		int n=4;
		int m=4;
		int board[][]={{0,0,0,0},{0,0,1,0},{0,0,0,1},{0,1,0,0}};
		int sol[][]=new int[n][m];
		mazeSolver(board,sol,0,0,n,m);
		System.out.print(count);
		// if(ans==false)
		// {
		// 	System.out.print("Paths doesnt exist");
		// }
	}
}