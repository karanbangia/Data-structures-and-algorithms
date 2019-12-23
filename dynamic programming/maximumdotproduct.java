import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
class GFG
 {
    public static void main (String[] args)
     {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0)
      {
          int m=sc.nextInt();
          int n=sc.nextInt();
          int a[]=new int[m];
          int b[]=new int[n];
          for(int i=0;i<m;i++)
          a[i]=sc.nextInt();
          for(int i=0;i<n;i++)
          b[i]=sc.nextInt();
          BigInteger dp[][]=new BigInteger[n+1][m+1];
          for(int i=0;i<=n;i++)
          {
              for(int j=0;j<=m;j++)
              {
                  dp[i][j]=BigInteger.valueOf(0);
              }
          }
          for(int i=1;i<=n;i++)
          {
              for(int j=i;j<=m;j++)
              {
                  BigInteger f=(dp[i-1][j-1].add((BigInteger.valueOf(a[j-1]).multiply(BigInteger.valueOf(b[i-1])))));
                  BigInteger g=dp[i][j-1];
                  dp[i][j]=f.max(g);
              }
          }
          System.out.println(dp[n][m]);
      }
     }
}