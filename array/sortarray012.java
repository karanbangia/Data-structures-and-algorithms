class sortarray012
{
	public static void swap(int arr[],int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void main(String[] args) {
		int arr[]={0,1,2,2,0,1,0,2,0,1,2,2,1,0,2,0};
		int strt=0;
		int end=arr.length-1;
		int mid=0;
		while(mid<=end)
		{
			if(arr[mid]>1)
			{
				swap(arr,mid,end);
				end--;
			}
			else if(arr[mid]<1)
			{
				swap(arr,mid,strt);
				mid++;
				strt++;
			}
			else
			{
				mid++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}