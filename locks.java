import java.util.*;
import java.io.*;
class locks
{
	public static void main(String[] args) {
		char nuts[] = {'@', '#', '$', '%', '^', '&'};
		int n=nuts.length;
		Arrays.sort(nuts);
		for(int i=0;i<n;i++)
		{
			System.out.print(nuts[i]);
		}
	}
}