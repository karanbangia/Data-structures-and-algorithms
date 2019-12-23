import java.util.*;

class Edge
{
	int source, dest;

	public Edge(int source, int dest) {
		this.source = source;
		this.dest = dest;
	}
};

class Graph
{

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
	public static int BFS(Graph graph, int v, int N)
	{
		
		boolean discovered[]=new boolean[N];
		for(int i=0;i<N;i++)
		{
			if(!discovered[i])
			{
				discovered[i]=true;

			}
		}
	}

	public static void main(String[] args)
	{
		// List of graph edges as per above diagram
		List<Edge> edges = Arrays.asList(
							new Edge(0, 5), new Edge(1, 4), new Edge(2, 0),
							new Edge(3, 3), new Edge(4, 1), new Edge(5, 6),
							new Edge(6, 2)
							// if we add 2->4 edge, graph is becomes non-Bipartite
						);

		// Set number of vertices in the graph
		final int N = 7;

		// create a graph from edges
		Graph graph = new Graph(edges, N);

		if (BFS(graph, 1, N))
			System.out.println("Bipartite Graph");
		else
			System.out.println("Not a Bipartite Graph");
	}
}