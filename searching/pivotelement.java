//find maximum element(index) in rotated array in logn(n)
class pivotelement
{
	static int findpivotindex(int a[],int strt,int end)
	{

		int mid;
		int pivot=0;
		while(strt<=end)
		{
			mid=(strt+end)/2;
			if(a[mid]<a[mid-1])
			{
				pivot=mid-1;
				break;
			}
			if(a[mid]>a[mid+1])
			{
				pivot= mid;
				break;
			}
			if(a[strt]>=a[mid])
			{
				end=mid-1;
			}
			else
			{
				strt=mid+1;
			}
		}
		return pivot;

	}
	public static void main(String[] args) {
		int arr[]={7,8,9,2,3,4,5,6};
		int x=arr.length;
		System.out.println(findpivotindex(arr,0,x-1));

	}
}