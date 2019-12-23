import java.util.*;

import java.lang.*;
import java.io.*;
class Edge
{
	int src, dest;

	public Edge(int src, int dest) {
		this.src = src;
		this.dest = dest;
	}
};

// A queue node
class Node
{
	// stores number associated with graph node
	int ver;

	// minDist stores minimum distance of node from starting vertex
	int minDist;

	public Node(int ver, int minDist) {
		this.ver = ver;
		this.minDist = minDist;
	}
};

// class to represent a graph object
class Graph
{
	// A List of Lists to represent an adjacency list
	List<List<Integer>> adjList = null;

	// Constructor
	Graph(List<Edge> edges, int N)
	{
		adjList = new ArrayList<>(N);
		for (int i = 0; i < N; i++) {
			adjList.add(i, new ArrayList<>());
		}

		// add edges to the graph
		for (int i = 0; i < edges.size(); i++)
		{
			int src = edges.get(i).src;
			int dest = edges.get(i).dest;

			// Please note that directed is directed
			adjList.get(src).add(dest);
		}
	}
}

class snakesandladder
{
	// Perform DFS on graph g starting from given source vertex
	public static void BFS(Graph g, int source, int N)
	{
		// create a queue used to do BFS
		Queue<Node> q = new ArrayDeque<>();

		// stores vertex is discovered or not
		boolean[] discovered = new boolean[N + 1];

		// mark source vertex as discovered
		discovered[source] = true;

		// assign minimum distance of source vertex as 0 and
		// push it into the queue
		Node node = new Node( source, 0 );
		q.add(node);

		// run till queue is not empty
		while (!q.isEmpty())
		{
			// pop front node from queue
			node = q.poll();

			// Stop BFS if we have reached last node
			if (node.ver == N)
			{
				System.out.println(node.minDist);
				break;
			}

			// do for every adjacent node of current node
			for (int u : g.adjList.get(node.ver))
			{
				if (!discovered[u])
				{
					// mark it discovered & push it into queue
					discovered[u] = true;

					// assign minimum distance of current node
					// as minimum distance of parent node + 1
					Node n = new Node(u, node.minDist + 1);
					q.add(n);
				}
			}
		}
	}

	public static void findSolution(Map<Integer, Integer> ladder,
								   Map<Integer, Integer> snake)
	{
		int N = 30;
		

		List<Edge> edges = new ArrayList<>();
		for (int i = 0; i < N; i++)
		{
			for (int j = 1; j <= 6 && i + j <= N; j++)
			{
				int src = i;

				// update destination if there is any ladder
				// or snake from current position.
				int dest;

				int _ladder = (ladder.get(i + j) != null) ?
								ladder.get(i + j): 0;

				int _snake = (snake.get(i + j) != null) ?
								snake.get(i + j): 0;

				if (_ladder != 0 || _snake != 0)
					dest = _ladder + _snake;
				else
					dest = i + j;

				// add edge from src to dest
				edges.add(new Edge(src, dest));
			}
		}

		// construct directed graph
		Graph g = new Graph(edges, N);

		// Find Shortest path between 1 and 100 using BFS
		BFS(g, 0, N);
	}

	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine());


		while(t-->0)
		{
			 Map<Integer, Integer> ladder = new HashMap();
			Map<Integer, Integer> snake = new HashMap();
		    int n=Integer.parseInt(br.readLine());
		    int a[]=new int[2*n];
		    String s=br.readLine();
		    String[] strs = s.trim().split(" ");

		    for(int i=1;i<n;i+=2)
		    {
		    	ladder.put(a[i-1],a[i]);
		    }
		     for(int i=n+1;i<2*n;i+=2)
		    {
		    	snake.put(a[i-1],a[i]);
		    }
                	findSolution(ladder, snake);
		}
	
	}
}