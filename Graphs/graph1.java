import java.util.*;
public class graph1
{
	private class Vertex
	{
		HashMap<String,Integer> nbrs=new HashMap<>();
	}
	HashMap<String,Vertex> vtces;
	public graph1()
	{
		vtces=new HashMap<>();

	}
	public int noofVertex()
	{
		return this.vtces.size();
	}
	public void addVertex(String vname)
	{
		Vertex vtx=new Vertex();
		vtces.put(vname,vtx);

	}
	public void addEdge(String vname1,String vname2,int cost)
	{
		Vertex vtx1=vtces.get(vname1);//2k
		Vertex vtx2=vtces.get(vname2);//4k
		if(vtx1==null || vtx2==null || vtx1.nbrs.containsKey(vname2))
		{
			System.out.println("not possible");
			return;
		}
		vtx1.nbrs.put(vname2,cost);//2k nbrs put c with cost
		vtx2.nbrs.put(vname1,cost); //4k nbrs put a wiht cost
	}
	public void removeVertex(String vname)
	{
		if(!vtces.containsKey(vname))return;
		Vertex vtx=vtces.get(vname);
		ArrayList<String> keys=new ArrayList<>(vtx.nbrs.keySet());
		for(String key:keys)
		{
			Vertex nbrVtx=vtces.get(key);
			nbrVtx.nbrs.remove(vname);
		}
		vtces.remove(vname);
	}
	public void removeEdge(String vname1,String vname2)
	{
		Vertex vtx1=vtces.get(vname2);//2k
		Vertex vtx2=vtces.get(vname1);//4k
		if(vtx1==null || vtx2==null || !vtx1.nbrs.containsKey(vname2))
		{
			System.out.println("not possible");
			return;
		}
		vtx1.nbrs.remove(vname1);//2k nbrs put c with cost
		vtx2.nbrs.remove(vname2); //4k nbrs put a wiht cost
	}
	public boolean containsVertex(String vname)
	{
		return this.vtces.containsKey(vname);

	}
	public int noofEdges()
	{
		int count=0;
		ArrayList<String> keys=new ArrayList<>(vtces.keySet());
		for(String key:keys)
		{
			Vertex vtx=vtces.get(key);
			count=count+vtx.nbrs.size();
		}
		return count/2;
	}
	
	
	public boolean containsEdge(String vname1,String vname2)
	{
		// Vertex vtx1=vtces.get(vname1);
		// if(vtx1.containsKey(vname2))
		// {
		// 	return true;
		// }
		// return false;
		Vertex vtx1=vtces.get(vname1);
		Vertex vtx2=vtces.get(vname2);
		if(vtx1==null || vtx2==null || !vtx1.nbrs.containsKey(vname2))
		{
			return false;
		}
		return true;

	}
	
	public void display()
	{
		ArrayList<String> keys=new ArrayList<>(vtces.keySet());
		for(String key:keys)
		{
			Vertex vtx=vtces.get(key);
			System.out.println(key+":"+vtx.nbrs);
		}
	}
	HashSet<String> process=new HashSet<>();
	public boolean hasPath(String vname1,String vname2)
	{
		process.add(vname1);
		if(containsEdge(vname1,vname2))return true;
		Vertex vtx=vtces.get(vname1);
		ArrayList<String> nbrs=new ArrayList<>(vtx.nbrs.keySet());
		for(String nbr:nbrs)
		{
			if(!process.contains(nbr) && hasPath(nbr,vname2))
			{
				return true;
			}
		}
		return false;
	}
	private class pair
	{
		String vname;
		String psf;
	}
	public boolean bfs(String src,String dest)
	{
		HashMap<String,Boolean> processed=new HashMap<>();
		LinkedList<pair> queue=new LinkedList<>();
		pair sp=new pair();
		sp.vname=src;
		sp.psf=src;
		queue.addLast(sp);
		 while (!queue.isEmpty())
		 {

		 	pair rp=queue.removeFirst();
		 	if(processed.containsKey(rp.vname))
		 	{
		 		continue;
		 	}
		 	processed.put(rp.vname,true);
		 	if(containsEdge(rp.vname,dest))
		 	{	
		 		System.out.println(rp.psf+ dest);

		 		return true;
		 	}
		 	Vertex rpvtx=vtces.get(rp.vname);
		 	ArrayList<String> nbrs=new ArrayList<>(rpvtx.nbrs.keySet());
		 	for(String nbr:nbrs)
		 	{
		 		if(!processed.containsKey(nbr))
		 		{
		 			//make a new pair and addin  queue
		 			pair np=new pair();
		 			np.vname=nbr;
		 			np.psf=rp.psf+nbr;
		 			queue.addLast(np);
		 		}
		 	}
		 	

		 }
		 return false;
	}
	public boolean dfs(String src,String dest)
	{
		HashMap<String,Boolean> processed=new HashMap<>();
		LinkedList<pair> stack=new LinkedList<>();
		pair sp=new pair();
		sp.vname=src;
		sp.psf=src;
		stack.addFirst(sp);
		 while (!stack.isEmpty())
		 {

		 	pair rp=stack.removeFirst();
		 	if(processed.containsKey(rp.vname))
		 	{
		 		continue;
		 	}
		 	processed.put(rp.vname,true);
		 	if(containsEdge(rp.vname,dest))  
		 	{	
		 		System.out.println(rp.psf+ dest);

		 		return true;
		 	}
		 	Vertex rpvtx=vtces.get(rp.vname);
		 	ArrayList<String> nbrs=new ArrayList<>(rpvtx.nbrs.keySet());
		 	for(String nbr:nbrs)
		 	{
		 		if(!processed.containsKey(nbr))
		 		{
		 			//make a new pair and addin  queue
		 			pair np=new pair();
		 			np.vname=nbr;
		 			np.psf=rp.psf+nbr;
		 			stack.addFirst(np);
		 		}
		 	}
		 	

		 }
		 return false;
	}
	public void bft()
	{
		HashMap<String,Boolean> processed=new HashMap<>();
		LinkedList<pair> queue=new LinkedList<>();
		ArrayList<String> keys=new ArrayList<>(vtces.keySet());
		//for every node repeat the process
		for(String key:keys)
		{
			if(processed.containsKey(key))
			{
				continue;
			}
		pair sp=new pair();
		sp.vname=key;
		sp.psf=key;
		queue.addLast(sp);
		// pair rp=None;
		 while (!queue.isEmpty())
		 {

		 	pair rp=queue.removeFirst();
		 	if(processed.containsKey(rp.vname))
		 	{
		 		continue;
		 	}
		 	processed.put(rp.vname,true);

			System.out.println(rp.vname+" via " + rp.psf);

		 	
		 	Vertex rpvtx=vtces.get(rp.vname);
		 	ArrayList<String> nbrs=new ArrayList<>(rpvtx.nbrs.keySet());
		 	for(String nbr:nbrs)
		 	{
		 		if(!processed.containsKey(nbr))
		 		{
		 			//make a new pair and addin  queue
		 			pair np=new pair();
		 			np.vname=nbr;
		 			np.psf=rp.psf+nbr;
		 			queue.addLast(np);
		 		}
		 	}
		 	

		 
		}
	
	}
}
	
	public void dft()
	{

		HashMap<String,Boolean> processed=new HashMap<>();
		LinkedList<pair> queue =new LinkedList<>();
		ArrayList<String> keys=new ArrayList<>(vtces.keySet());
		//for every node repeat the process
		for(String key:keys)
		{
			if(processed.containsKey(key))
			{
				continue;
			}
		pair sp=new pair();
		sp.vname=key;
		sp.psf=key;
		queue.addFirst(sp);
		// pair rp=None;
		 while (!queue.isEmpty())
		 {

		 	pair rp=queue.removeFirst();
		 	if(processed.containsKey(rp.vname))
		 	{
		 		continue;
		 	}
		 	processed.put(rp.vname,true);

			System.out.println(rp.vname+" via " + rp.psf);

		 	
		 	Vertex rpvtx=vtces.get(rp.vname);
		 	ArrayList<String> nbrs=new ArrayList<>(rpvtx.nbrs.keySet());
		 	for(String nbr:nbrs)
		 	{
		 		if(!processed.containsKey(nbr))
		 		{
		 			//make a new pair and addin  queue
		 			pair np=new pair();
		 			np.vname=nbr;
		 			np.psf=rp.psf+nbr;
		 			queue.addFirst(np);
		 		}
		 	}
		 	

		 
		}
	}
}
	
	public boolean isCyclic()
	{
		HashMap<String,Boolean> processed=new HashMap<>();
		LinkedList<pair> queue=new LinkedList<>();
		ArrayList<String> keys=new ArrayList<>(vtces.keySet());
		//for every node repeat the process
		for(String key:keys)
		{
			if(processed.containsKey(key))
			{
				return true;
			}
		pair sp=new pair();
		sp.vname=key;
		sp.psf=key;
		queue.addLast(sp);
		// pair rp=None;
		 while (!queue.isEmpty())
		 {

		 	pair rp=queue.removeFirst();
		 	if(processed.containsKey(rp.vname))
		 	{
		 		continue;
		 	}
		 	processed.put(rp.vname,true);

			

		 	
		 	Vertex rpvtx=vtces.get(rp.vname);
		 	ArrayList<String> nbrs=new ArrayList<>(rpvtx.nbrs.keySet());
		 	for(String nbr:nbrs)
		 	{
		 		if(!processed.containsKey(nbr))
		 		{
		 			//make a new pair and addin  queue
		 			pair np=new pair();
		 			np.vname=nbr;
		 			np.psf=rp.psf+nbr;
		 			queue.addLast(np);
		 		}
		 	}
		 	

		 
		}
		
	}
	return false;
}
public boolean isConnected()
	{
		HashMap<String,Boolean> processed=new HashMap<>();
		LinkedList<pair> queue=new LinkedList<>();
		ArrayList<String> keys=new ArrayList<>(vtces.keySet());
		int flag=0;
		//for every node repeat the process
		for(String key:keys)
		{
			if(processed.containsKey(key))
			{
				continue;
			}
			flag++;
		pair sp=new pair();
		sp.vname=key;
		sp.psf=key;
		queue.addLast(sp);
		// pair rp=None;
		 while (!queue.isEmpty())
		 {

		 	pair rp=queue.removeFirst();
		 	if(processed.containsKey(rp.vname))
		 	{
		 		continue;
		 	}
		 	processed.put(rp.vname,true);

			

		 	
		 	Vertex rpvtx=vtces.get(rp.vname);
		 	ArrayList<String> nbrs=new ArrayList<>(rpvtx.nbrs.keySet());
		 	for(String nbr:nbrs)
		 	{
		 		if(!processed.containsKey(nbr))
		 		{
		 			//make a new pair and addin  queue
		 			pair np=new pair();
		 			np.vname=nbr;
		 			np.psf=rp.psf+nbr;
		 			queue.addLast(np);
		 		}
		 	}
		 	

		 
		}
		
	}
	if(flag>1)
	{
		return false;
	}
	else{
		return true;
	}
	
}
public boolean isTree()
{
	return !isCyclic() && isConnected();
}
public ArrayList<ArrayList<String>> getConnectedcomponents()
	{
		ArrayList <ArrayList<String>> ans=new ArrayList<>();
		HashMap<String,Boolean> processed=new HashMap<>();
		LinkedList<pair> queue=new LinkedList<>();
		ArrayList<String> keys=new ArrayList<>(vtces.keySet());
		//for every node repeat the process
		for(String key:keys)
		{
			if(processed.containsKey(key))
			{
				continue;
			}
			ArrayList<String> subans=new ArrayList<>();
		pair sp=new pair();
		sp.vname=key;
		sp.psf=key;
		queue.addLast(sp);
		// pair rp=None;
		 while (!queue.isEmpty())
		 {

		 	pair rp=queue.removeFirst();
		 	if(processed.containsKey(rp.vname))
		 	{
		 		continue;
		 	}
		 	processed.put(rp.vname,true);
		 	subans.add(rp.vname);
			// System.out.println(rp.vname+" via " + rp.psf);

		 	
		 	Vertex rpvtx=vtces.get(rp.vname);
		 	ArrayList<String> nbrs=new ArrayList<>(rpvtx.nbrs.keySet());
		 	for(String nbr:nbrs)
		 	{
		 		if(!processed.containsKey(nbr))
		 		{
		 			//make a new pair and addin  queue
		 			pair np=new pair();
		 			np.vname=nbr;
		 			np.psf=rp.psf+nbr;
		 			queue.addLast(np);
		 		}
		 	}
		 	

		 
		}
		ans.add(subans);
	
	}
	return ans;
}
	public static void main(String[] args) {
		graph1 g=new graph1();
		g.addVertex("A");
		g.addVertex("H");
		g.addVertex("C");
		g.addVertex("D");
		g.addVertex("E");
		g.addVertex("F");
		g.addVertex("G");
		// g.addVertex("H");
		g.addEdge("A","H",1);
		g.addEdge("A","D",12);
		g.addEdge("H","C",13);
		g.addEdge("C","D",41);
		// g.addEdge("D","E",41);
		g.addEdge("E","F",5);
		g.addEdge("E","G",2);
		g.addEdge("F","G",87);

		// g.display();
		// System.out.println("No of edges : "+g.noofEdges());
		// System.out.println("No of vertices : "+g.noofVertex());
		// System.out.println(g.containsEdge("A","B"));
		// System.out.println(g.containsEdge("X","Y"));
		// g.removeVertex("A");
		// g.addVertex("A");
		// g.addEdge("A","B",5);
		// g.display();
		// System.out.println(g.hasPath("A","F"));
		// System.out.println(g.bfs("A","F"));
		// System.out.println(g.dfs("A","F"));
		// g.bft();
		// g.dft();
		// System.out.println();
		// g.bft();
		// System.out.println(g.isCyclic());
		// System.out.println(g.isConnected());
		System.out.println(g.getConnectedcomponents());
	}

}