import java.util.*;  
class quicksort
{
	public static void swap(int a,int b)
	{
		a=a^b;
		b=a^b;
		a=a^b;
	}
	public static int partition(int arr[],int strt,int end)
	{
		int pivot=arr[end];
		int pindex=strt;
		for(int i=strt;i<end;i++)
		{
			if(arr[i]<=pivot)
			{
				
				int temp=arr[i];
				arr[i]=arr[pindex];
				arr[pindex]=arr[i];
				pindex++;

				
			}
		}
		int temp=arr[pindex];
		arr[pindex]=arr[end];
		arr[end]=temp;
		return pindex;	

	} 
	public static void sort(int arr[],int strt,int end)
	{
		if(strt<end)
		{
			int pindex=partition(arr,strt,end);
			sort(arr,strt,pindex-1);
			sort(arr,pindex+1,end);
		}
	}
	public static void main(String[] args) {
		int arr[]={7,6,5,4,3,2,1};
		int n=arr.length;
		sort(arr,0,n-1);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}