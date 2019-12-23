
import java.util.*;
import java.io.*;
class Graph 
{ 
	 int V; 
	 ArrayList<Integer> adjListArray[];
	 
	Graph(int V) 
	{ 
		this.V = V; 
		adjListArray = new ArrayList[V]; 
		for(int i = 0; i < V ; i++){ 
			adjListArray[i] = new ArrayList<Integer>(); 
		} 
	} 
} 
class GFG 
{ 
	
	static void addEdge(Graph graph, int src, int dest) 
	{ 
		graph.adjListArray[src].add(dest); 
		graph.adjListArray[dest].add(src); 
	} 

	static void print_under_dist(Graph graph,int node,int k,int V)
	{
		boolean visited[]=new boolean[V];
		int level[]=new int[V];
		Queue<Integer> q=new LinkedList<>();
		q.add(node);
		visited[node]=true;
		level[node]=0;
		while(!q.isEmpty())
		{
			int rv=q.remove();
			if(level[rv]<=k)
			{
				System.out.println(rv+" ");
			}
			for(int i:graph.adjListArray[rv])
			{
				if(!visited[i])
				{
					q.add(i);
					visited[i]=true;
					level[i]=level[rv]+1;
				}
			}
		}
	}
	public static void main(String args[]) 
	{ 
	
		int V = 7; 
		Graph graph = new Graph(V); 
		addEdge(graph, 1, 0); 
        addEdge(graph, 1, 4); 
        addEdge(graph, 4, 3); 
        addEdge(graph, 4, 6); 
        addEdge(graph, 3, 2); 
        addEdge(graph, 6, 5);  
        int node=3;
        int k=2;
        print_under_dist(graph,node,k,V);
	} 
} 
