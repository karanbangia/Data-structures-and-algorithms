class xxx
{
	static void hello(int x,int arr[])
	{
		arr[0]=2;
	}
	public static void main(String[] args) {
		int arr[]={0};
		hello(arr[0],arr);
		System.out.print(arr[0]);
	}
}