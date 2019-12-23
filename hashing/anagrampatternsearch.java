import java.util.*;
import java.lang.*;
import java.io.*;

class anagrampatternsearch{
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String text=br.readLine();
		    String patt=br.readLine();
		    HashMap<Character,Integer> hmpatt=new HashMap<>();
		    HashMap<Character,Integer> hm=new HashMap<>();
		    for(int i=0;i<patt.length();i++)
		    {
		        if(!hmpatt.containsKey(patt.charAt(i)))
		        {
		            hmpatt.put(patt.charAt(i),1);
		        }
		        else
		        {
		            hmpatt.put(patt.charAt(i),hmpatt.get(patt.charAt(i))+1); 
		        }
		    }
		    // for(Map.Entry<Character,Integer> entry:hmpatt.entrySet())
		    // {
		    //     System.out.println(entry.getKey()+" "+ entry.getValue()+" ");
		    // }
		    int j=0;
		    int count=0;
		    int k;
		    for(k=0;k<patt.length();k++)
		    {
		        if(!hm.containsKey(text.charAt(k)))
		        {
		            hm.put(text.charAt(k),1);
		        }
		        else
		        {
		            hm.put(text.charAt(k),hm.get(text.charAt(k))+1); 
		        } 
		        
		    }
		    if(hmpatt.equals(hm))
		    {
		        count++;
		    }
		    for(;k<text.length();k++)
		    {
		       
		        if(hm.get(text.charAt(j))==1)
		        {
		        	hm.remove(text.charAt(j));
		        }
		        else
		        {
		        	hm.put(text.charAt(j),hm.get(text.charAt(j))-1);
		        }
	           
	            j++;
	            if(!hm.containsKey(text.charAt(k)))
    		        {
    		            hm.put(text.charAt(k),1);
    		        }
		        else
		        {
		            hm.put(text.charAt(k),hm.get(text.charAt(k))+1); 
		        }
		         if(hmpatt.equals(hm))
		        {
		            count++;
		        }
	        
		    }
		    
		 
		    
		          System.out.println(count);
		  
        }
        br.close();
    }
}