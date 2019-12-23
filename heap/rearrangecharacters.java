/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
class KeyComparator implements Comparator<Key>
{
    public int compare(Key k1,Key k2)
    {
        if(k1.freq<k2.freq)
        {
            return 1;
        }
        else if(k1.freq>k2.freq)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
class Key
{
    int freq;
    char ch;
    Key(int val,char c)
    {
        this.freq=val;
        this.ch=c;
    }
}
class GFG {
	public static void main (String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String s=br.readLine();
		    char a[]=s.toCharArray();
		    int n=a.length;
		    int count[]=new int[26];
		    for(int i=0;i<n;i++)
		    {
		        count[(int)a[i]-(int)'a']++;
		    }
		    PriorityQueue<Key> pq =new PriorityQueue<>(new KeyComparator());
		    for(char c='a';c<='z';c++)
		    {
		        int val=c-'a';
		        if(count[val]>0)pq.add(new Key(count[val],c));
		    }
		    String str="";
		    Key prev=new Key(-1,'#');
		    while(pq.size()!=0)
		    {
		        Key k=pq.peek();
		        pq.poll();
		        str+=k.ch;
		        
		        if(prev.freq>0)
		        {
		            pq.add(prev);
		        }
		        (k.freq)--;
		        prev=k;
		        
		    }
		    if(n!=str.length())
		    {
		        System.out.println(0);
		    }
		    else
		    {
		       System.out.println(1); 
		    }
		}
		
	    
	}
}