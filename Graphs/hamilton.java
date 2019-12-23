/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
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
    Graph(List<Edge> edges,int V)
    {
        adjList=new ArrayList<>(V);
        for(int i=0;i<V;i++)
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
class hamilton {
    static boolean hamilton(Graph g,int strt,boolean visited[],List<Integer> path,int V)
    {
        if(path.size()==V)
        {
            return true;
        }
        for(int i:g.adjList.get(strt))
        {
            if(!visited[i])
            {
                visited[i]=true;
                path.add(i);
                if(hamilton(g,i,visited,path,V))
                {
                   return true;
                    
                }
                else
                {
                    visited[i]=false;
                    path.remove(path.size()-1);
                }
                

            }
        }
        return false;
        
    }
    public static void main (String[] args) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
           String s=br.readLine();
           String str[]=s.trim().split(" ");
           int v=Integer.parseInt(str[0]);
           int n=Integer.parseInt(str[1]);
           s=br.readLine();
           String s1[]=s.trim().split(" ");
           List<Edge> edge=new ArrayList<>();
           HashSet<Integer> hs=new HashSet<>();
           for(int i=1;i<2*n;i=i+2)
           {
               
               int a=Integer.parseInt(s1[i-1])-1;
               int b=Integer.parseInt(s1[i])-1;
               hs.add(a);
               hs.add(b);
               edge.add(new Edge(a,b));
           }
           Graph g=new Graph(edge,v);
           int strt=0;
           List<Integer> path=new ArrayList<>();
           boolean visited[]=new boolean[v];
           int flag=0;
           for(int i:hs)
           {
               path.add(i);
               visited[i]=true;
              if(hamilton(g,i,visited,path,v))
               {
                   System.out.println(1);
                   flag=1;
                   break;
               }
               path.remove(path.size()-1);
               visited[i]=false;
               
           }
           if(flag==0)
           {
               System.out.println(0);
           }
          
        }
    }
}