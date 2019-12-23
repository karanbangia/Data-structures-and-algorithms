//implement merge sort in java
public class inversioncount
{	static int count=0;
	static int merge(int a[],int strt,int mid,int end)
	{
		int x=0;
		int i=strt;
		int j=mid+1;
		int k=strt;
		int temp[]=new int[100];
		while(i<=mid && j<=end)
		{
			if(a[i]<a[j])
			{
				temp[k++]=a[i++];
			}
			else
			{
				temp[k++]=a[j++];
				x=x+mid-i+1;
			}

		}
		while (i<=mid)
		 {

			temp[k++]=a[i++];
		}
		while(j<=end)
		{
			temp[k++]=a[j++];
		}
		for(int m=strt;m<=end;m++)
		{
			a[m]=temp[m];
		}
		return x;

	}
	static void sort(int arr[], int l, int r) 
    { 
    	if(l>=r)
    	{
    		return ;
    	}     
        int m = l+(r-l)/2; 
        sort(arr, l, m);
        sort(arr , m+1, r);
        count+=merge(arr, l, m, r);
        
    } 
	public static void main(String[] args)
	 {
		
		int a[]={5 ,4, 3, 2, 1};
		int n=a.length;
		sort(a,0,n-1);
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	
		System.out.print(count);
		
	}
}