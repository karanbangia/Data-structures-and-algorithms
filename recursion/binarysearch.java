public class binarysearch
{
	static boolean binarysearch(int a[],int first,int last,int key)
	{
		if(last>=first)
		{
			int mid=(first+last)/2;

			if(a[mid]==key)
			{	
				System.out.print("index is :"+ mid);
				return true;
			}
			if(a[mid]>key)
			{
				return binarysearch(a,first,mid-1,key);
			}
			if(a[mid]<key)
			{
				return binarysearch(a,mid+1,last,key);
			}
		}
		
		return false;
	}
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6,7,8,9,10};
		int n=a.length;
		int first=0;
		int last=n-1;
		int key=1;
		if(binarysearch(a,first,last,key))
		{
			System.out.print("Key found");
		}
		else
		{
			System.out.print(" key not found");
		}
	}
}