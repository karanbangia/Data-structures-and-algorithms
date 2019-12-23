import java.util.*;
class totaldecodingmessage
{

	static int ans(String a,int i,int n,HashMap<String,Character>  hm)
	{
		int count=0;
		if(i==n)
		{
			return 1;
		}
		for(int k=i;k<n;k++)
		{
			if(hm.containsKey(Character.toString(a.charAt(k))))
			{
				//int n=count+
				count+=ans(a,k+1,n,hm);
			}
			if(hm.containsKey(a.substring(k,k+1)))
			{
				count+=ans(a,k+2,n,hm);
			}
		}
		return count;

	}
	public static void main(String[] args) {
		String a="123";
		HashMap<String,Character> hm=new HashMap<>();
		String alphabets="abcdefghijklmnopqrstuvwxyz";
		for(int i=1;i<=26;i++)
		{
			hm.put(Integer.toString(i),alphabets.charAt(i-1));
		}
		int n=a.length();
		System.out.println(ans(a,0,n,hm));
		
	}
}