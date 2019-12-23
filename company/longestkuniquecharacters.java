import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int fun(char[] a,int m)
    {
        int n=a.length();
        int start=0;
        int end=0;
        int max_len=0;
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        map.put(a[0],0);
        for(int i=1;i<n;i++)
        {
            if(!map.containsKey(a[i]))
            {
                if(map.size()<m)
                {
                     map.put(a[i],i);
                     
                }
                else
                {
                    int size=i-start+1;
                    max=Math.max(max,size);
                    map.forEach((k,v)->{
                        start=v+1;
                        map.remove(k);
                        break;
                    });
                    
                    map.put(a[i],i);
                }
            }
            else
            map.put(a[i],i);
         
            
        }
        
    }
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		   String a=br.readLine();
		   int m=Integer.parseInt(br.readLine());
		   char b[]=a.toCharArray();
		   int x=fun(b,m);
        }
        br.close();
    }
}