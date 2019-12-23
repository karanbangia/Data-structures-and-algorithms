public class sparse
{
	public static void main(String[] args) {
		int n=40;
		int count=0;
		int temp=0;
		while(n>0)
		{
			if((n&1)==1)
			{
				count+=1;
				if(count==2)
				{	temp=1;
					break;
				}

			}
			if((n&1)==0)
			{
				count=0;
			}
			
			n=n>>1;
		}
		if(temp==1)
		{
			System.out.println(" not sparse");
		}
		else
		{
			System.out.println(" sparse");
		}

	}
}