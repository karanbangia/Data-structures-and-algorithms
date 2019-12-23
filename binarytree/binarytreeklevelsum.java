/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
	public static void main (String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int t=Integer.parseInt(br.readLine().trim());
	    Scanner sc=new Scanner(System.in);
	    while(t-->0)
	    {
	         int k=Integer.parseInt(br.readLine().trim()); 
    	     String s=br.readLine();
    	     int level=-1;
    	     int sum=0;
    	     int strt=-1;
    		for(int i=0;i<s.length();i++)
    		{
    		    if(k==level && s.charAt(i)!='(' && s.charAt(i)!=')' && strt==-1)
    		    {
    		       strt=i;  
    		    }
    		    else if(k==level && s.charAt(i)=='('  && strt!=-1)
    		    {
    		        sum+=Integer.parseInt(s.substring(strt,i));
    		        level++;
    		        strt=-1;
    		    }
    		    else if(s.charAt(i)=='(')
    		    {
    		        level++;
    		    }
    		    else if(s.charAt(i)==')')
    		    {
    		        level--;
    		    }
    		}
	        System.out.println(sum);
	    
		
	    }
	}
}