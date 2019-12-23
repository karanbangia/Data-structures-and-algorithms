//solve bubble sort recursively
public class bubblesort
{	
	static void bubbleadvance(int a[],int j,int n)
	{
		if(n==1)
		{
			return;
		}
		if(j==n-1)
		{
			bubbleadvance(a,0,n-1);
		}
		if(a[j]>a[j+1])
		{
			a[j]=a[j]^a[j+1];
			a[j+1]=a[j+1]^a[j];
			a[j]=a[j+1]^a[j];
		}
		bubbleadvance(a,j+1,n);
		return;
	}
	// static void swap(int a,int b)
	// {
	// 	int temp;
	// 	temp=a;
	// 	a=b;
	// 	b=temp;
	// }

	public static void main(String[] args) {
		int a[]={6,5,4,3,2,1};
		int n=a.length;
		bubbleadvance(a,0,n);
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]);
		}
	}
}