class nqueen
{
	static boolean isSafe(int board[][],int i,int j,int n)
	{
		for(int row=0;row<i;row++)

		{
			if(board[row][j]==1)
			{
				return false;
			}
		}
		int x=i;
		int y=j;
		while(x>=0 && y>=0 && x<n && y<n)
		{
			if(board[x][y]==1)
			{
				return false;
			}
			x--;
			y--;

		}
		while(x>=0 && y<n && y>=0 && x<n)
		{
			if(board[x][y]==1)
			{
				return false;
			}
			x--;
			y++;
		
		}
		return true;
	}
	static boolean solveQueen(int board[][],int i,int n)
	{
		if(i==n)
		{
			for(int l=0;l<n;l++)
			{
				for(int m=0;m<n;m++)
				{
					System.out.print(board[l][m]+"");
				}
				System.out.println();
			}
			System.out.println();
			return false;
		}
		//recursive case
		//try to place in current row and call on remaining part
		for(int j=0;j<n;j++)
		{
			if(isSafe(board,i,j,n))
			{
				board[i][j]=1;
				boolean nextQueen=solveQueen(board,i+1,n);
				if(nextQueen)
				{
					return true;
				}
				//means our asumption is wrong
				board[i][j]=0;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int n=4;
		int board[][]=new int[n][n];
		solveQueen(board,0,n);
	
	}
}