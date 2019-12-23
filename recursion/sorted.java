public class sorted
{
	 static boolean isSorted(int a[],int f,int n)
		{
			if(n==1)
			{
				return true;
			}
			if(a[f]<a[f+1] && isSorted(a,f+1,n-1))
			{
				return true;
			}
			return false;
		}
	public static void main(String[] args) {
		
		int a[]={3,2,1,4,5};
		int n=a.length;
		int first=0;
		if(isSorted(a,first,n)==true)
		{
			System.out.print("True");
		}
		else
		{
			System.out.print("false");
		}
	}
}