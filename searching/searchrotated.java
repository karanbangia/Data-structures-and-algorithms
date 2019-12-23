class searchrotated
{	static int searchelement(int arr[],int strt,int end,int key)
	{
		int mid;
		int result=-1;
		while(strt<=end)
		{
			mid=(strt+end)/2;
			if(arr[mid]==key)
			{
				result=mid;
				break;
			}
			if(arr[strt]<=arr[mid])
			{
				if(arr[strt]<=key && key<=arr[mid])
				{
					end=mid-1;
				}
				else
				{
					strt=mid+1;
				}	
			}

			if(arr[mid]<=key && key<=arr[end])
			{
					strt=mid+1;
			}
			else
			{
					end=mid-1;
			}
		
		}
		return result;
	}
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6};
		int x=arr.length;
		System.out.println(searchelement(arr,0,x-1,40));
	}
}