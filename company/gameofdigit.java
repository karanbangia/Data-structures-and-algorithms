/*package whatever //do not write package name here */
/*Given a number N. Find a number K such that product of digits of K must be equal to N.
Note : K must be as small as possible.

Input: First line of input contains number of testcases T. For each testcase, there will be a single line containing N.

Output: For each testcase, output single integer. If K is not possible, print "-1" (without quotes).

Constraints:
1 <= T <= 100
1 <= N <= 1015

Example:
Input:
2
12
5

Output:
26
5

Explanation:
Testcase 1: 26 is the smallest number, and product of 2 and 6 is 12.
Testcase 2: 5 is the smallest number which is itself equal to 5.

 */
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static long gamedigit(long n)
    {
        if(n>=0 && n<=-9)
        {
            return n;
        }
        Stack<Long> digits=new Stack<>();
        for(long i=9;i>=2 && n>1;i--)
        {
            while(n%i==0)
            {
                digits.push(i);
                n=n/i;
            }
        }
        if(n!=1)
        {
            return -1;
        }
        long k=0;
        while(!digits.isEmpty())
        {
            k=k*10+digits.peek();
            digits.pop();
            
        }
        return k;
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    long n=sc.nextLong();
		    System.out.println(gamedigit(n));
		    
		    
		}
	}
}