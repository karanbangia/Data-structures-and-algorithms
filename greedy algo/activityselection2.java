
import java.util.*;
import java.lang.*;
import java.io.*;

class Meeting implements Comparable<Meeting>
{
    int index;
    int start;
    int finish;
    
    Meeting(int index,int start,int finish)
    {
        this.index = index;
        this.start = start;
        this.finish = finish;
    }
    
    public int compareTo(Meeting obj)
    {
        if(this.finish > obj.finish)
        return 1;
        else if(this.finish < obj.finish)
        return -1;
        else 
        return 0;
    }
}
class activityselection2   {
   
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int n = sc.nextInt();
		    int s[] = new int[n];
		    int f[] = new int[n];
		    for(int i=0;i<n;i++)
		    s[i] = sc.nextInt();
		    for(int i=0;i<n;i++)
		    f[i] = sc.nextInt();
		    ArrayList<Meeting> al = new ArrayList<Meeting>();
		    for(int i=0;i<n;i++)
		        al.add(new Meeting(i,s[i],f[i]));
		    
		    Collections.sort(al);
		    
		    System.out.print((al.get(0).index+1)+" ");
		    int j=0;
		    for(int i=1;i<n;i++)
		    {
		        if(al.get(j).finish  <= al.get(i).start)
		        {
		            System.out.print((al.get(i).index+1)+" ");
		            j=i;
		        }
		    }
		   System.out.println(); 
		}
	}
}