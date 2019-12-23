class sum
{
	public static void main(String[] args) {
		int a[]={2,3,1,1,2,1};
		int msf=0;
		int mte=0;
		int mcsf=0;
		int mcte=0;
		int k=5;
		for(int i=0;i<a.length;i++)
		{
			mte+=a[i];
			if(msf<=mte)
			{
				msf=mte;
				mcsf++;
			}
			if(msf==k)
			{
				if(mcte<mcsf)
				{
					mcte=mcsf;

				}
				mcsf=1;
				msf=0;
				mte=a[i];
			}
		}
		System.out.println(mcte);
	}
}