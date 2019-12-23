import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int[] maxSlidingWindow(int[] nums, int k) {
    if(nums==null||nums.length==0)
        return new int[0];
 
    int[] result = new int[nums.length-k+1];
 
    LinkedList<Integer> deque = new LinkedList<Integer>();
    for(int i=0; i<nums.length; i++){
        if(!deque.isEmpty()&&deque.peekFirst()==i-k) 
            deque.poll();
 
        while(!deque.isEmpty()&&nums[deque.peekLast()]>nums[i]){
            deque.removeLast();
        }    
 
        deque.offer(i);
 
        if(i+1>=k)
            result[i+1-k]=nums[deque.peek()];
    }
 
    return result;
    }
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    int n=Integer.parseInt(br.readLine());
		    int a[]=new int[n];
		    String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+");
            for(int i=0;i<n;i++)
		    {
		        a[i] = Integer.parseInt(strs[i]);
		    }
		    
		    for(int i=1;i<=n;i++)
		    {
		            int max=Integer.MIN_VALUE;
		            int al[]=maxSlidingWindow(a,i);
		            for(int j:al)
		            {
		               if(max<j)
		               {
		                   max=j;
		               }
		            }
		            System.out.print(max+" ");
		    }
		    System.out.println();
        }
        br.close();
    }
}