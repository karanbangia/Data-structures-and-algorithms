import java.io.*;
import java.util.*;

class containing123{
	public static void main(String args[]) throws IOException{
		containing123 g = new containing123();
		BufferedReader br  =new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			int n = Integer.parseInt(br.readLine());
			int arr[] = new int[n];
			String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+");
			for(int i = 0;i<n;i++){
				arr[i] = Integer.parseInt(strs[i]);
			}
			
			g.printRequiredElements(arr,n);
			System.out.println();
		}
	}
	
	void printRequiredElements(int arr[],int n){
		HashMap<Integer,Boolean> nums = new HashMap<Integer,Boolean>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		int no=0;
		nums.put(1,true);
		nums.put(2,true);
		nums.put(3,true);
		for(int i = 0;i<n;i++){
			no = arr[i];
			while(no>0){
				if(!nums.containsKey(no%10))
					break;
				else{
					no /=10;
				}
			}
			if(no==0)
				result.add(arr[i]);
		}
		for(Integer num:result)
		{
				System.out.print(num+" ");
		}

	}
}

/*another approach

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
   
    public static void solve(LinkedHashMap<Integer,Integer> map)
    {
       ArrayList<Integer> l=new ArrayList<>();
       l.add(1);l.add(2);l.add(3);
       int i=0;
       int j=3;
       int count=1;
       while(l.size()<4200)
       {
       for(int k=i;k<j;k++)
       {
           int p=l.get(k);
           map.put(p,0);
           l.add(10*p+1);l.add(10*p+2);l.add(10*p+3);
       }
       i=j;
       j=(int)(j+Math.pow(3,count));
       count++;
       }
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
	        int a[]=new int[n];
	        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
	        solve(map);
	        for(int i=0;i<n;i++)
	        {
	            int z=Integer.parseInt(g[i]);
	                if(map.containsKey(z))
	                {
	                    map.put(z,map.get(z)+1);
	                }
	            
	        }
	        int flag=0;
	        StringBuffer b1=new StringBuffer();
	        for(Map.Entry<Integer,Integer> it:map.entrySet())
	        {
	            int h=it.getValue();
	            if(h>0)
	            {
	                flag=1;
	                while(h-->0)
	                {
	                    b1.append(it.getKey()+" ");
	                }
	            }
	            else
	            continue;
	        }
	        if(flag==0)
	        System.out.println(-1);
	        else
	        System.out.println(b1);
	    }
	}
}
*/