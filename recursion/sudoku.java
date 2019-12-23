import java.lang.*;
class sudoku
{
	static boolean isSafe(int board[][],int i,int j,int n,int k)
	{	for(int x=0;x<n;x++)
		{
			if(board[x][j]==k || board[i][x]==k)
			{
				return false;
			}
		
		}
		int l=i/3;
		int m=j/3;
		int sx=l*3;
		int sy=m*3;
		for(int x=sx;x<sx+3;x++)
		{
			for(int y=sy;y<sy+3;y++)
			{
				if(board[x][y]==k)
				{
					return false;
				}
			}
		}
		return true;
	}

	static boolean solver(int board[][],int i,int j,int n)
	{
		if(i==n)
		{	
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					System.out.print(board[i][j]);
				}
				System.out.println();

			}
			return true;
		}
		if(j==n)
		{
			return solver(board,i+1,0 ,n);
		}
		if(board[i][j]==0)
		{
			return solver(board,i+1,j,n);
		}
		for(int k=1;k<=9;k++)
		{
			if(isSafe(board,i,j,n,k))
			{
				board[i][j]=k;
				boolean canwe=solver(board,i,j+1,n);
				if(canwe)
				{
					return true;
				}

			}
		}
		board[i][j]=0;
		return false;
	}
	public static void main(String[] args) {
		int board[][]={
			{5,3,0,0,7,0,0,0,0},
			{6,0,0,1,9,5,0,0,0},
			{0,9,8,0,0,0,0,6,0},
			{8,0,0,0,6,0,0,0,3},
			{4,0,0,8,0,3,0,0,1},
			{7,0,0,0,2,0,0,0,6},
			{0,6,0,0,0,0,2,8,0},
			{0,0,0,4,1,9,0,0,5},
			{0,0,0,0,8,0,0,7,9}
		};
		solver(board,0,0,8);
		// if(!ans)
		// {
		// 	System.out.print('x');
		// }
		

	}
}