import java.util.*;
import java.lang.*;
import java.io.*;

class bookeeping {
	static boolean isValid(int a[],int n,int k,int ans)
	{
		int student=1;
		int current_pages=0;
		for(int i=0;i<n;i++)
		{
			if((current_pages+a[i])>ans)
			{
				current_pages=a[i];
				student++;
				if( student>k)
				{
					return false;
				}			}
				else
				{
					current_pages+=a[i];
				}
			}
			return true;
		}
		static int binarysearchbook(int a[],int max,int m)
		{

			int mid;
			int strt=0;
			int end=a[a.length-1];
			int final_ans=0;
			while(strt<=end)
			{
				mid=(strt+end)/2;
				if(isValid(a,a.length,m,mid))
					{	final_ans=mid;
						end=mid-1;
					}
					else
					{
						strt=mid+1;

					}
				}
				return final_ans;
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
					int a[]=new int[k];
					String line = br.readLine(); 
					String[] strs = line.trim().split("\\s+");
					for(int i=0;i<k;i++)
					{
						a[i] = Integer.parseInt(strs[i]);
					}
					int max=Arrays.stream(a).sum();
					int x=binarysearchbook(a,max,n);
					System.out.println(x);
					System.out.println
				}
				br.close();

			}
			return;
		}