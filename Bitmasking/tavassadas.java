public class tavassadas
{
	public static void main(String[] args) {
		int a[]={7,7};
		int x=a.length;
		int ans1=(1<<x)-2;
		int count=0;
		for(int i=x-1;i>=0;i--)
		{
			if(a[i]==7)
			{
				count+=(1<<(x-i-1));
			}
		}
		int finalans=ans1+count+1;
		System.out.println("ans1 :"+ans1+" count :"+count);
		System.out.println("final ans"+finalans);
	}
}