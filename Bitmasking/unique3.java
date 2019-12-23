//array with 3 no's duplictate and only one none dupplicate
import java.util.*;
public class unique3
{
	static int findUnique(int a[],int n)
	{
		int cnt[]=new int[64];
		for(int i=0;i<n;i++)
		{
			int no=a[i];
			int j=0;
			while(no>0)
			{
				cnt[j]+=(no&1);
				j++;
				no=no>>1;
			}
		}
		int p=1;
		int ans=0;
		for(int i=0;i<63;i++)
		{
			cnt[i]%=3;
			ans+=cnt[i]*p;
			p=p<<1;
		}
		return ans;
	}
	public static void main(String[] args) {

		int a[]={7,7,3,4,12,3,3,4,6,4,6,7,6};
		int n=a.length;
		int ans=findUnique(a,n);
		System.out.print("the unique no is: "+ans);
		
	}
}