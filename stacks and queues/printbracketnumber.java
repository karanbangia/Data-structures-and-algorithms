import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    Stack<Integer> s=new Stack<>();
		    String line = br.readLine();
		    int count=0;
            for(int i=0;i<line.length();i++)
		    {
		        if(line.charAt(i)=='(')
		        {
		           s.push(++count);
		           System.out.print(count+" ");
		        }
		        else if(line.charAt(i)==')')
		        {
		            int x=s.pop();
		            System.out.print(x+" ");
		            
		            
		        }
		    }
		    System.out.println();
		    
		    
        }
        br.close();
    }
}