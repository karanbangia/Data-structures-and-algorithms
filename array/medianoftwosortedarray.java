import java.util.*;
import java.io.*;
class medianoftwosortedarray
{
	public static void main(String[] args) {
		int a1[]={1,3,4,6,8,9,34,64,78};
		int a2[]={3,5,8,9,22,45,67};
		int l1=a1.length;
		int l2=a2.length;
		int k=0;
		int i=0;
		int j=0;
		int a3[]=new int[l1+l2];
		//Arrays.sort(a1,Collection.reverseOrder());
		while(i<l1 && j<l2)
		{
			if(a1[i]<a2[j])
			{
				a3[k++]=a1[i++];
			}
			else
			{
				a3[k++]=a2[j++];
			}
		}
		while(i<l1)
		{
			a3[k++]=a1[i++];
		}
		while(j<l2)
		{
			a3[k++]=a1[j++];
		}
		int median=0;
		if(a3.length%2==0)
		{
			median=a3[a3.length/2]+a3[(a3.length+1)/2];

		}
		else
		{
			median=a3[a3.length/2];
		}
		System.out.println(median);
	}
}