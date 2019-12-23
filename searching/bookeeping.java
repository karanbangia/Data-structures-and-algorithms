import java.util.*;
class bookeeping
{
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
		for(int i=0;i<a.length;i++)
		{
			strt=Math.max(strt,a[i]);
		}
		int end=max;
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
	public static void main(String[] args) {
		int arr[]={10,20,30,40};
		int m=4;
		int max=Arrays.stream(arr).sum();
		System.out.println(binarysearchbook(arr,max,m));
	}
}