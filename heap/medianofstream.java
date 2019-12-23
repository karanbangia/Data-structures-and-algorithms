import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class GFG {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(reader.readLine());
		int[] a = new int[t];
		int i = 0;
		while (t-- > 0) {
			int x = Integer.parseInt(reader.readLine());
			a[i++] = x;
		}
		int[] medians = runningMedian(a);
		for (int median : medians) {
			System.out.println(median);
		}
	}

	private static int[] runningMedian(int[] a) {
		int length = a.length;
		int n = length / 2 + 2;
		PriorityQueue<Integer> lowers = new PriorityQueue<>(n, Collections.reverseOrder()); // Max Heap
		PriorityQueue<Integer> highers = new PriorityQueue<>(n); // Min Heap
		int[] medians = new int[length];
		for (int i = 0; i < length; i++) {
			int number = a[i];
			addNumbers(number, lowers, highers);
			rebalance(lowers, highers);
			medians[i] = getMedian(lowers, highers);
		}
		return medians;
	}

	private static void addNumbers(int number, PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
		if (lowers.isEmpty() || number < lowers.peek()) {
			lowers.add(number);
		} else {
			highers.add(number);
		}
	}

	private static void rebalance(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
		PriorityQueue<Integer> biggerHeap = lowers.size() > highers.size() ? lowers : highers;
		PriorityQueue<Integer> smallerHeap = highers.size() < lowers.size() ? highers : lowers;
		if (biggerHeap.size() - smallerHeap.size() > 1) {
			smallerHeap.add(biggerHeap.poll());
		}
	}

	private static int getMedian(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
		PriorityQueue<Integer> biggerHeap = lowers.size() > highers.size() ? lowers : highers;
		PriorityQueue<Integer> smallerHeap = highers.size() < lowers.size() ? highers : lowers;
		if (biggerHeap.size() == smallerHeap.size()) {
			return (biggerHeap.peek() + smallerHeap.peek()) / 2;
		} else {
			return biggerHeap.peek();
		}
	}

}
