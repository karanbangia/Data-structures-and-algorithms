import java.util.*;
import java.lang.*;
import java.io.*;
class karan
{
    int x;
    int y;
    karan(int x,int y)
    {	
    	this.x=x;
    	this.y=y;

   }
}
class sort2arrays {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    int n=Integer.parseInt(br.readLine());
		   	int m=Integer.parseInt(br.readLine());
		    int  a[]=new int[n];
		    String line = br.readLine(); 
            String[] strs = line.trim().split("");
            int pa[]=new int[n];
		   	karan ob[]=new karan[n];
            for(int i=0;i<n;i++)
		    {
		        a[i] = Integer.parseInt(strs[i]);
		        pa[i]=Math.abs(a[i]-m);
		   		ob[i]=new karan(a[i],pa[i]);
		    }
		   	Arrays.sort(ob,new Comparator<karan>()
		    {
		        public int compare(karan a,karan b)
		        {
		           if(a.y>b.y)
		           {
		           	return 1;
		           }
		           else if(a.y<b.y)
		           {
		           	return -1;
		           }
		           else
		           {
		           	return	0;
		           	// if(a.x>b.x)
		           	// {
		           	// 	return 1;
		           	// }
		           	// else if(a.x<b.x)
		           	// {
		           	// 	return -1;
		           	// }
		           	// else
		           	// {
		           	// 	return 0;
		           	// }
		           }
		        }
		    });
		    for(int i=0;i<n;i++)
		    {
		        System.out.print(ob[i].x+" ");
		    }
		    System.out.println();
        }
        br.close();
    }
}