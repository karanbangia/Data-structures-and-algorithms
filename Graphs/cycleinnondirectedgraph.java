{
//Initial Template for Java
import java.util.*;
import java.io.*;
import java.lang.*;
class DriverClass
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int nov = sc.nextInt();
            int edg = sc.nextInt();
            
            for(int i = 0; i < nov+1; i++)
                list.add(i, new ArrayList<Integer>());
                
            for(int i = 1; i <= edg; i++)
            {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
                list.get(v).add(u);
            }
            if(new DetectCycle().isCyclic(list, nov) == true)
                System.out.println("1");
            else System.out.println("0");
        }
    }
}
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
/*
ArrayList<ArrayList<Integer>> list: represent graph containing 'V' number of
                                    vertices and edges between them
V: represent number of vertices
*/
class DetectCycle
{
    static boolean isCyclic(ArrayList<ArrayList<Integer>> list, int V)
    {
       boolean visited[]=new boolean[V];
       int strt=0;
       visited[strt]=true;
       Queue<Integer> s=new LinkedList<>();
       s.add(strt);
       int parent[]=new int[V];
       Arrays.fill(parent,-1);
       while(!s.isEmpty())
       {
           int rv=s.poll();
           for(Integer u:list.get(rv))
           {
               if(rv==u)return true;
             
               if(visited[u]==true && u!=parent[rv])return true;
               if(!visited[u])
               {
                   visited[u]=true;
                   
                   s.add(u);
                     parent[u]=rv;
               }
           }
       }
       return false;
    }
} 