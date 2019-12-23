
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{
	public static void main (String[] args)
	{
	    Scanner k=new Scanner(System.in);
	    int t=k.nextInt();
	    while(t-->0)
	    {
	        double h=k.nextDouble();
	        double m=k.nextDouble();
	        if(h==12)
	        h=0;
	        if(m==60)
	        m=0;
	        double mh=m*6;
	        double hh=30*h+0.5*m;
	        double angle=Math.abs(mh-hh);
	        int res=(int)Math.floor(Math.min(360-angle,angle));
	        System.out.println(res);
	    }
		//code
	}
}