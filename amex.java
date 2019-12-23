import java.util.*;
class amex
{
	// static int ans(int M,int i,HashSet<Integer> hm,int count)
	// {
	// 	if(M==0)
	// 	{
	// 		return count;
	// 	}
	// 	for(int k=i;k<=M;k++)
	// 	{
	// 		if(!hm.contains(k))
	// 		{
	// 			if(M-k>=0 && M-k>=k)
	// 			{
	// 				count=1+ans(M-k,k,hm,count);
	// 			}
	// 			return count;
			
				
	// 		}
	// 	}
	// 	return count;
	// }
	static int helper(int M,int arr[],int n)
	{
		HashSet<Integer> mp=new HashSet<>();
		for(int i=0;i<n;i++)
		{
			mp.add(arr[i]);
		}
		return ans(M,mp);
	}
	static int ans(int M,HashSet<Integer> hs)
	{
		int best=0;
		int count=0;
		int sum=0;
		for(int i=1;i<=M;i++)
		{
			if(!hs.contains(i))
			{
				sum=0;
				count=0;
				for(int j=i;j<=M;j++)
				{
					if(!hs.contains(j))
					{
						if(sum+j<=M)
						{
							sum+=j;
							count++;
						}
					}
				}
				best=Math.max(best,count);
			}
			
		}
		return best;
	}

	public static void main(String[] args) {
		int M=14;
		int n=4;
		int arr[]={4,6,8,9};
		System.out.println(helper(M,arr,n));

	}
}