import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
     static int Binaryfirst(int a[],int n,int k)
    {   
        int low=0;
        int high=n-1;
        int result=-1;
        while(high>=low)
        {
            int mid=(high+low)/2;
            if(a[mid]==k)
            {
                result=mid;
                high=mid-1;
            }
            if(a[mid]<k)
            {
                low=mid+1;
            }
            if(a[mid]>k)
            {
                high=mid-1;
            }
        }
        return result;
    }
    static int Binarylast(int a[],int n,int k)
    {
        int low=0;
        int high=n-1;
        int result=-1;
        while(high>=low)
        {
            int mid=(high+low)/2;
            if(a[mid]==k)
            {
                result=mid;
                low=mid+1;
            }
            if(a[mid]<k)
            {
                low=mid+1;
            }
            if(a[mid]>k)
            {
                high=mid-1;
            }
        }
        return result;   
    }
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String s=br.readLine();
			String strl[]=s.trim().split("\\s+");
		    int n=Integer.parseInt(strl[0]);
		    int k=Integer.parseInt(strl[1]);
		    int a[]=new int[n];
		    String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+");
            for(int i=0;i<n;i++)
		    {
		        a[i] = Integer.parseInt(strs[i]);
		    }
		    int firstoccur=Binaryfirst(a,n,k);
		    int lastoccur=Binarylast(a,n,k);
		    if(firstoccur==-1 && lastoccur==-1)
		    {
		        System.out.println("-1");
		    }
		    else
		    {System.out.println(lastoccur-firstoccur+1);}
        }
        br.close();
    }
}