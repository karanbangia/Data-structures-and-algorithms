import java.util.*;
import java.io.*;
class Edge
{
	int src,dest;
	Edge(int src,int dest)
	{
		this.src=src;
		this.dest=dest;
	}
}
class Graph
{
	List<List<Integer>> adjList=null;
	Graph(List<Edge> edges,int N)
	{
		adjList=new ArrayList<>(N);
		for(int i=0;i<N;i++)
		{
			adjList.add(i,new ArrayList<>());
		}
		for(int i=0;i<edges.size();i++)
		{
			int src=edges.get(i).src;
			int dest=edges.get(i).dest;
			adjList.get(src).add(dest);
			adjList.get(dest).add(src);
		}
	}
}
public class printallnodeswithindistancek
{

	
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
			for(int i:graph.adjList.get(rv))
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
	public static void main(String[] args) {
		List<Edge> edges=Arrays.asList(
			new Edge(1, 0), new Edge(1, 4),
			new Edge(4, 3), new Edge(4, 6),
			new Edge(3, 2), new Edge(6, 5)
			);
		int V = 7; 
        Graph graph = new Graph(edges,V); 
        int node=3;
        int k=2;
        print_under_dist(graph,node,k,V);
		
	}
}