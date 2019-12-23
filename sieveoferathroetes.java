/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static void sieve(int n,boolean primes[])
    {
        primes[0]=false;
        primes[1]=false;;
        
        for(int i=2;i<=n;i++)
        {   if(primes[i])
            {
                for(int j=i*i;j<=n;j+=i)
                {
                        primes[j]=false;
                    
                }
            }
            
        }
        int count=0
        for(int i=0;i<=n;i++)
        {
            if(primes[i])
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            boolean primes[]=new boolean[n+1];
            for(int i=0;i<=n;i++)
            {
                primes[i]=true;
            }
            sieve(n,primes);
        }
	}
}