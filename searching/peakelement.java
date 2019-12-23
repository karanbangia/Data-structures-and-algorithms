/*Given an array A of N integers. The task is to find a peak element in it.
An array element is peak if it is not smaller than its neighbours. For corner elements, we need to consider only one neighbour.

Note: There may be multiple peak element possible, in that case you may return any valid index.

Input Format:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains an integer N. Then in the next line are N space separated values of the array.

Output Format:
For each test case output will be 1 if the index returned by the function is an index with peak element.

User Task:
You don't have to take any input. Just complete the provided function peakElement() and return the valid index.

Constraints:
1 <= T <= 100
1 <= N <= 100
1 <= A[] <= 1000

Example:
Input:
2
3
1 2 3
2
3 4
Output:
1
1

Explanation:
Testcase 1: In the given array, 3 is the peak element.
Testcase 2: 4 is the peak element.
*/

// A Java program to find a peak element element using divide and conquer 
import java.util.*; 
import java.lang.*; 
import java.io.*; 

class PeakElement 
{ 
	// A binary search based function that returns index of a peak 
	// element 
	static int findPeakUtil(int arr[], int low, int high, int n) 
	{ 
		// Find index of middle element 
		int mid = low + (high - low)/2; /* (low + high)/2 */

		// Compare middle element with its neighbours (if neighbours 
		// exist) 
		if ((mid == 0 || arr[mid-1] <= arr[mid]) && (mid == n-1 || 
			arr[mid+1] <= arr[mid])) 
			return mid; 

		// If middle element is not peak and its left neighbor is 
		// greater than it,then left half must have a peak element 
		else if (mid > 0 && arr[mid-1] > arr[mid]) 
			return findPeakUtil(arr, low, (mid -1), n); 

		// If middle element is not peak and its right neighbor 
		// is greater than it, then right half must have a peak 
		// element 
		else return findPeakUtil(arr, (mid + 1), high, n); 
	} 

	// A wrapper over recursive function findPeakUtil() 
	static int findPeak(int arr[], int n) 
	{ 
		return findPeakUtil(arr, 0, n-1, n); 
	} 

	// Driver method 
	public static void main (String[] args) 
	{ 
		int arr[] = {1, 3, 20, 4, 1, 0}; 
		int n = arr.length; 
		System.out.println("Index of a peak point is " + 
							findPeak(arr, n)); 
	} 
} 
