/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;

class GFG {
    
    public static double s(double mid,double a[])
    {
        double ans=0;
        for(int i=0;i<a.length;i++)
        {
            ans+=(1/(mid-a[i]));
            //System.out.println("--"+ans+"");
        }
        return ans;
    }
    
    public static double solve(double l,double r,double a[])
    {
        double ans=0;
        double mid=0;
        while(l<r)
        {
            mid=(l+r)/2;
            
            ans=s(mid,a);
            //System.out.println(mid+" "+ans);
            
            if(Math.abs(ans)<0.0000000000001)
            return mid;
            
            if(ans>0)
            l=mid;
            else
            r=mid;
        }
        return mid;
    }
    
	public static void main (String[] args) throws IOException {
	    BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	    int t=Integer.parseInt(input.readLine());
	    while(t-->0)
	    {
	        String pi=input.readLine();
	        String p[]=pi.split(" ");
	        int n=Integer.parseInt(p[0]);
	        String gi=input.readLine();
	        String g[]=gi.split(" ");
	        double a[]=new double[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i]=Double.parseDouble(g[i]);
	        }
	        for(int i=1;i<n;i++)
	        {
	        DecimalFormat df2 = new DecimalFormat("#.##");
	        System.out.print(String.format("%.2f",solve(a[i-1],a[i],a))+" ");
	        }
	        System.out.println();
	    }
	}
}