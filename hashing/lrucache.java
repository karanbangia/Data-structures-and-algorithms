class Entry
{
    int value;
    Entry left;
    Entry right;
    int key;
    Entry(int key,int value)
    {
        this.key=key;
        this.value=value;
        left=null;
        right=null;
    }
    
}
class LRUCache {
    HashMap<Integer,Entry> hmap;
    Entry start,end;
    int capacity;
    public LRUCache(int capacity) {
        hmap=new HashMap<Integer,Entry>();
        this.capacity=capacity;
    }
    
    public int get(int key) {
        if(hmap.containsKey(key))
        {
            Entry entry=hmap.get(key); 
            remove(entry);
            add_to_top(entry);
            return entry.value;
        }
        return -1;
        
    }
    
    public void put(int key, int value) {
        
        //if(hmap.size()>)
        if(!hmap.containsKey(key))
        {
            Entry newnode=new Entry(key,value);
            if(hmap.size()==capacity)
            {
                hmap.remove(end.key);
                remove(end);
                add_to_top(newnode);
            }
            else
            {
                add_to_top(newnode);
            }
            hmap.put(key,newnode);
            
        }
        else
        {
            Entry entry=hmap.get(key);
            entry.value=value;
            remove(entry);
            add_to_top(entry);
        }
        
    }
    public void add_to_top(Entry node) {
		node.right = start;
		node.left = null;
		if (start != null)
			start.left = node;
		start = node;
		if (end == null)
			end = start;
	}

	public void remove(Entry node) {

		if (node.left != null) {
			node.left.right = node.right;
		} 
        else {
			start = node.right;
		}

		if (node.right != null) {
			node.right.left = node.left;
		} else {
			end = node.left;
		}
	}
    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */