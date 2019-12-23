import java.util.*;
public class Heap
{
	ArrayList<Integer> data=new ArrayList<>();
		public void add(int item)
		{
			data.add(item);
			upheapify(data.size()-1);

		}
		private void upheapify(int ci)
		{
			if(ci==0)return;
			int pi=(ci-1)/2;
			if(data.get(ci)<=data.get(pi))
			{
				swap(ci,pi);
				upheapify(pi);
			}

		}
		private void swap(int i,int j)
		{
			int ith=data.get(i);
			int jth=data.get(j);
			data.set(i,jth);
			data.set(j,ith);

		}
		public void display()
		{
			System.out.println(data);
		}
		public int size()
		{
			return this.data.size();
		}
		public boolean isEmpty()
		{
			return this.data.size()==0;
		}
		public int remove()
		{
			swap(0,this.data.size()-1);
			int rv=this.data.remove(this.data.size()-1);
			downheapify(0);
			return rv;

		}
		private void downheapify(int pi)
		{
			int lci=2*pi+1;
			int rci=2*pi+2;
			int mini=pi;
			if(lci< this.data.size() && data.get(lci)<data.get(mini))
			{
				mini=lci;
			}
			if(rci < this.data.size() && data.get(rci)<data.get(mini))
			{
				mini=rci;
			}
			if(mini!=pi)
			{
				swap(mini,pi);
				downheapify(mini);
			}
			

		}
		 
		public static void main(String[] args) {
			Heap h=new Heap();
			h.add(10);
			h.add(20);
			h.add(30);
			h.add(40);

			h.display();
			h.add(5);
			h.display();
		}
}