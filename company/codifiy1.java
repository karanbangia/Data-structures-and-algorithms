import java.util.*;
class codifiy1
{
	static int ans(String s)
	{
		HashMap<Character,Integer> mp=new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			if(!mp.containsKey(s.charAt(i)))
			{
				mp.put(s.charAt(i),1);
			}
			else
			{
				mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
			}
		}
		HashSet<Integer> hs=new HashSet<>();
		int count=0;
		for(Map.Entry<Character,Integer> entry:mp.entrySet())
		{
			if(!hs.contains(entry.getValue()))
			{
				hs.add(entry.getValue());
			}
			else
			{
				int x=entry.getValue();
				while(true)
				{
					x=x-1;
					count+=1;
					if(x==0)
					{
						break;
					}
					if(!hs.contains(x))
					{
						hs.add(x);
						break;
					}

				}
				
			}
		}
		return count;
	}
	public static void main(String[] args) {
		String a="example";
		System.out.println(ans(a));
	}
}