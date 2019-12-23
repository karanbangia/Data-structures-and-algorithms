import java.io.*;
import java.util.*;
import java.lang.*;
class Edge
{
	int src,dest;
	Edge(int src,int dest)
	{
		this.src=src;
		this.dest=dest;
	}
}

class graphcoloring
{
	// string array to store colors (10-colorable graph)
	private static String COLORS[] = {"", "BLUE", "GREEN", "RED", "YELLOW",
					"ORANGE", "PINK", "BLACK", "BROWN", "WHITE", "PURPLE"};

	private static boolean isSafe(Graph graph,int []color,int v,int c)
	{
		for(int u:graph.adjList.get(v))
		{
			if(color[u]==c)
				return false;
		}
		return true;
	}
	public static void kcolorable(Graph graph,int color[],int k,int v,int N)
	{
		if(v==N)
		{
			for(int i=0;i<N;i++)
			{
				System.out.printf("%-8s",COLORS[color[i]]);
			}
			System.out.println();
			return;
		}
		for(int c=1;c<=k;c++)
		{
			if(isSafe(graph,color,v,c))
			{
				color[v]=c;
				kcolorable(graph,color,k,v+1,N);
				color[v]=0;
			}
		}
	}
	public static void main(String[] args) {
		List<Edge> edges=Arrays.asList(
			new Edge(0, 1), new Edge(0, 4),
			new Edge(0, 5), new Edge(4, 5),
			new Edge(1, 4), new Edge(1, 3),
			new Edge(2, 3), new Edge(2, 4)
			);
		final int N=6;
		int k=3;
		Graph g=new Graph(edges,N);
		int color[]=new int[N];
		kcolorable(g,color,k,0,N);
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