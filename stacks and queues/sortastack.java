	public Stack<Integer> sort(Stack<Integer> s)
	{   
	    Stack<Integer> helper=new Stack<>();
	    helper.push(s.pop());
	    while(!s.isEmpty() || helper.isEmpty())
	    {
	        int curr=s.pop();
	        if(curr>=helper.peek())
	        {
	            helper.push(curr);
	        }
	        else
	        {
	            while(!helper.isEmpty() && curr<helper.peek())
	            {
	                s.push(helper.pop());
	                
	            }
	            helper.push(curr);
	        }
	        
	    }
	    return helper;
				