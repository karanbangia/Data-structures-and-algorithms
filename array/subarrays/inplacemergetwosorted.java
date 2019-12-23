//inplacemergetwosorted
class inplacemergetwosorted
{
	public static void merge(int a1[],int a2[])
	{
		int n=a1.length;
		int m=a2.length;
		for(int i=0;i<n;i++)
		{
			if(a1[i]>a2[0])
			{
				int temp=a1[i];
				a1[i]=a2[0];
				a2[0]=temp;
				int first=a2[0];
				int k;
				for(k=1;k<m && a2[k]<first;k++)
				{
					a2[k-1]=a2[k];
				}
				a2[k-1]=first;
			}
		}
	}
	public static void main(String[] args) {
		int a1[]={1,4,7,8,10};
		int a2[]={2,3,9};
		merge(a1,a2);
		String s="";
		for(int i=0;i<a1.length;i++)
		{
			s+=Integer.toString(a1[i])+" ";
		}
		for(int i=0;i<a2.length;i++)
		{
			s+=Integer.toString(a2[i])+" ";
		}
		System.out.print(s);

	}
}