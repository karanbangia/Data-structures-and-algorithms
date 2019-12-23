class selectionsort
{
	public static void sort(int arr[],int n)
	{
		int loc=0;
		for(int i=0;i<n;i++)
		{
			int min_idx=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min_idx])
				{
					min_idx=j;
				}
			}
			int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
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