import java.util.*;
import java.lang.*;
import java.io.*;

class sortarray01 {
    public static void swap(int arr[],int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    int n=Integer.parseInt(br.readLine());
		    int a[]=new int[n];
		    String line = br.readLine(); 
            String[] strs = line.trim().split(" ");
            for(int i=0;i<n;i++)
		    {
		        a[i] = Integer.parseInt(strs[i]);
		    }
		    int p1=0;
		    int p2=0;
		    while(p2<n)
		    {
		        if(a[p2]==0)
		        {
		            swap(a,p2,p1);
		            p2++;
		            p1++;
		        }
		        else
		        {
		            p2++;
		        }
		    }
		    for(int i=0;i<n;i++)
		    {
		        System.out.print(a[i]+" ");
		    }
		    System.out.println();
		   
		    
		    
        }
        br.close();
    }
}