import java.util.*;

// Data structure to store graph edges
class Edge
{
	int source, dest;

	public Edge(int source, int dest) {
		this.source = source;
		this.dest = dest;
	}
};

// Class to represent a graph object
class Graph
{
	// A List of Lists to represent an adjacency list
	List<List<Integer>> adjList = null;

	// Constructor
	Graph(List<Edge> edges, int N) {
		adjList = new ArrayList<>(N);
		for (int i = 0; i < N; i++) {
			adjList.add(i, new ArrayList<>());
		}

		// add edges to the undirected graph
		for (int i = 0; i < edges.size(); i++)
		{
			int src = edges.get(i).source;
			int dest = edges.get(i).dest;

			// add an edge from source to destination
			adjList.get(src).add(dest);

			// add an edge from destination to source
			adjList.get(dest).add(src);
		}
	}
}

class BipartiteGraph
{
	// Perform BFS on graph starting from vertex v
	public static boolean BFS(Graph graph, int v, int N)
	{
		// stores vertex is discovered or not
		boolean[] discovered = new boolean[N];

		// stores level of each vertex in BFS
		int[] level = new int[N];

		// mark source vertex as discovered and
		// set its level to 0
		discovered[v] = true;
		level[v] = 0;

		// create a queue to do BFS and enqueue
		// source vertex in it
		Queue<Integer> q = new ArrayDeque<>();
		q.add(v);

		// run till queue is not empty
		while (!q.isEmpty())
		{
			// pop front node from queue and print it
			v = q.poll();

			// do for every edge (v -> u)
			for (int u : graph.adjList.get(v))
			{
				// if vertex u is explored for first time
				if (!discovered[u])
				{
					// mark it discovered
					discovered[u] = true;

					// set level as level of parent node + 1
					level[u] = level[v] + 1;

					// push the vertex into the queue
					q.add(u);
				}
				// if the vertex is already been discovered and
				// level of vertex u and v are same, then the
				// graph contains an odd-cycle & is not biparte
				else if (level[v] == level[u])
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args)
	{
		// List of graph edges as per above diagram
		List<Edge> edges = Arrays.asList(
							new Edge(1, 2), new Edge(2, 3), new Edge(2, 8),
							new Edge(3, 4), new Edge(4, 6), new Edge(5, 7),
							new Edge(5, 9), new Edge(8, 9)
							// if we add 2->4 edge, graph is becomes non-Bipartite
						);

		// Set number of vertices in the graph
		final int N = 10;

		// create a graph from edges
		Graph graph = new Graph(edges, N);

		// Do BFS traversal starting from vertex 1
		if (BFS(graph, 1, N))
			System.out.println("Bipartite Graph");
		else
			System.out.println("Not a Bipartite Graph");
	}
}