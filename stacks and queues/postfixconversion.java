import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int func(int x,int y,Character a)
    {
        if(a=='-')
        {
            return y-x;
        }
         if(a=='+')
        {
            return y+x;
        }
         if(a=='/')
        {
            return y/x;
        }
        return y*x;
    }
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    Stack<Integer> s=new Stack<>();
		    String line = br.readLine();
		    char a[]=line.toCharArray();
		    for(int i=0;i<a.length;i++)
		    {
		        if(a[i]=='1'|| a[i]=='2'|| a[i]=='3'|| a[i]=='4'|| a[i]=='5'|| a[i]=='6'||a[i]=='7'|| a[i]=='8'||a[i]=='9'|| a[i]=='0')
		        {
		            s.push((int)a[i]-(int)'0');
		        }
		        if(a[i]=='*'|| a[i]=='/'|| a[i]=='+'|| a[i]=='-')
		        {
		            int x=s.pop();
		            int y=s.pop();
		            s.push(func(x,y,a[i]));
		        }
		    }
		    int q=s.pop();
		    System.out.println(q+" ");
		    
		}
        br.close();
    }
}