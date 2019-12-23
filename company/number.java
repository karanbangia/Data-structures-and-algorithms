//print 2048 in alphabets
import java.util.*;
public class number
{	static void print(int n,HashMap<Integer,String> map)
	{
		if(n==0)
		{
			return;
		}
		print(n/10,map);
		System.out.print(map.get(n%10)+" ");
	}

	public static void main(String[] args)
	{	
		int n=2048;
		HashMap<Integer,String> map=new HashMap<>();
		map.put(0,"zero");
		map.put(1,"one");
		map.put(2,"two");
		map.put(3,"three");
		map.put(4,"four");
		map.put(5,"five");
		map.put(6,"six");
		map.put(7,"seven");
		map.put(8,"eight");
		map.put(9,"nine");
		print(n,map);

	}
}