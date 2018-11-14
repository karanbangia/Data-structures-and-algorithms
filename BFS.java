/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	
	Graph g=new Graph(5);
    	g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
        System.out.print("Starting BFS from vertex 2");
        g.BFS(2);
	}
	static class Graph
	{
	    int V;
	    LinkedList<Integer> adj[];
	    Graph(int V)
	    {
	        V=this.V;
	        adj=new LinkedList[V];
	        for(int i=0;i<V;i++)
	        {
	          adj[i]=new LinkedList<>();  
	        }
	    }
	    void addEdge(int src,int dest)
	    {
	        adj[src].add(dest);
	    }
	    void BFS(int s)
	    {
	        boolean visited[]=new boolean[V];
	        LinkedList<Integer> Queue=new LinkedList<>();
	        visited[s]=true;
	        Queue.add(s);
	        while(Queue.size()!=0)
	        {
	            s=Queue.poll();
	            System.out.print(s+" ");
	            Iterator<Integer> i=adj[s].listIterator();
	            while(i.hasNext())
	            {
	                int n=i.next();
	                if(!visited[n])
	                {
	                    visited[n]=true;
	                    Queue.add(n);
	                }
	            }
	        }
	    }
 	}
 	
}
