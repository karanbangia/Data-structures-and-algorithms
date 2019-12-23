class insertionsort
{
	public static void sort(int arr[],int n)
	{
		for(int i=1;i<n;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
	public static void main(String[] args) {
		int arr[]={663,6,4,74,3,67,5,74,3,5,8,985,43};
		int n=arr.length;
		sort(arr,n);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}