class xxx
{
	
	static int solution(int arr[])
	{
		int n=arr.length;
		int best=0;
		boolean visited[]=new boolean[n];
		for(int i=0;i<n;i++)
		{
			int count=0;
			visited[i]=true;
			int temp=i;
			int next=arr[i];
			while(true)
			{
				count++;
				if(visited[next])
				{
					best=Math.max(best,count);
					break;
				}
				visited[next]=true;
				next=arr[next];
			}
		}
		return best;
	}
	public static void main(String[] args) {
		int arr[]={5,4,0,3,1,6,2};
		System.out.println(solution(arr));
		
	}
}