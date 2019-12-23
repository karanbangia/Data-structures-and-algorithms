import java.util.*;
import java.lang.*;
import java.io.*;

class minindex {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String a=br.readLine();
		    String b=br.readLine();
		    int min=Integer.MAX_VALUE;
		    int temp=0;
		    char x=0;
		    
		   for(int i=0;i<b.length();i++)
		   {
		       for(int j=0;j<a.length();j++)
		       {
		          if(b.charAt(i)==a.charAt(j))
		          {
		              if(min>j)
		              {
		                  min=j;
		                  x=a.charAt(j);
		                  temp=1;
		                  break;
		              }
		          }
		       }
		   }
		   if(temp==1)
		   {
		       System.out.println(x);
		   }
		   else
		   {
		       System.out.println("$");
		   }
        }
        br.close();
    }
}