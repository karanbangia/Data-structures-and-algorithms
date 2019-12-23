public class oddevenswap
{
	public static void main(String[] args) {
		int n=23;
		int l=n &(0xAAAAAAAA);
		l=l>>1;
		int r=n &(0x55555555);
		r=r<<1;
		int ans=l|r;
		System.out.print(ans);
	}
}