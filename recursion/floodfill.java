// Flood fill Algorithm
// Given a 2D screen, location of a pixel in the screen ie(x,y) and a color(K), your task is to replace color of the given pixel and all adjacent(excluding diagonally adjacent) same colored pixels with the given color K.
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class floodfill {
    static void fill(int a[][],int i,int j,int l,int n,int m,int k)
    {
        //agr end mai pahuch gyaa yaa strting mai rhee gyaa toh point 
        if(i==n || j==m || i<0 || j<0)
        return;

        
        if(a[i][j]==k)
        {
            return;
        }
        
        if(i>=0 && i<n && j>=0 && j<m && a[i][j]==l)
        {
            a[i][j]=k;
            fill(a,i+1,j,l,n,m,k);
            fill(a,i,j+1,l,n,m,k);
            fill(a,i,j-1,l,n,m,k);
            fill(a,i-1,j,l,n,m,k);
            
        }

    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    int a[][]=new int[n][m];
		    for(int i=0;i<n;i++)
		    {
		        for(int j=0;j<m;j++)
		        {
		            a[i][j]=sc.nextInt();
		        }
		    }
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int k=sc.nextInt();
		    int l=a[x][y];
		    fill(a,x,y,l,n,m,k);
		     for(int i=0;i<n;i++)
		    {
		        for(int j=0;j<m;j++)
		        {
		            System.out.print(a[i][j]+" ");
		        }
		        System.out.println();
		    }
		    
		    
		   
		  }
	}
}