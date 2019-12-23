{
import java.util.Scanner;
class GfG
{
	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
		 {
			MyQueue obj = new MyQueue();
			int Q = sc.nextInt();
			while(Q>0)
			{
				int QueryType = 0;
				QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					
					obj.push(a);
					
				}else if(QueryType == 2)
				{
				System.out.print(obj.pop()+" ");
				}
				Q--;
			}
			System.out.println("");
			t--;
		 }
	}
}

}
/*This is a function problem.You only need to complete the function given below*/
class MyQueue {
    int front, rear;
	int arr[] = new int[1000];
    MyQueue()
	{
		front=0;
		rear=0;
	}
	
	/* The method push to push element
	   into the queue */
	void push(int a)
	{
	    if(rear==1000)
	    {
	        System.out.print(-1);
	    }
	    int ai=(front+rear)%1000;
	    arr[ai]=a;
	    rear++;
	    
	} 
    /* The method pop which return the 
       element poped out of the queue*/
	int pop()
	{
	    if(rear==0)
	    {
            return -1;
	    }
		int rv=arr[front];
		arr[front]=0;
		front=(front+1)%1000;
		rear--;
		return rv;
	} 
}