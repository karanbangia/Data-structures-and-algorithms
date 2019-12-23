//find distinct permuations of all the string
class permutations
{	static int count=0;
	static boolean swappable(String str,int start,int end)
	{
		char arr[]=str.toCharArray();
		for(int i=start;i<end;i++ )
		{
			if(arr[i]==arr[end])
			{
				return false;
			}
		}	
		return true;
	}
	static void permute(String str,int l,int r)
	{	
		if(l==r)
		{
			System.out.println(str);
			count++;
			System.out.println(count);
			return;
		}

		for(int i=l;i<=r;i++)
		{	
			if(swappable(str,l,i))
			{
				str=swap(str,l,i);
				permute(str,l+1,r);
				str=swap(str,l,i);
			}
			

		}
	}
	static String swap(String str,int i,int j)
	{
		char arr[]=str.toCharArray();
		char temp;
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		return String.valueOf(arr);
	}
	public static void main(String[] args) {
		String str="ABCA";
		int size=str.length();
		permute(str,0,size-1);
	}
}