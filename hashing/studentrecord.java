import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
     public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) 
    { 
        // Create a list from elements of HashMap 
        List<Map.Entry<String, Integer> > list = 
               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() { 
            public int compare(Map.Entry<String, Integer> o1,  
                               Map.Entry<String, Integer> o2) 
            { 
                return (o2.getValue().compareTo(o1.getValue())); 
            } 
        }); 
          
        // put data from sorted list to hashmap  
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
        for (Map.Entry<String, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    } 
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        int t = Integer.parseInt(br.readLine());
        while(t-->0)
        {   int n=Integer.parseInt(br.readLine());
            String a[]=new String[n]; 
            for(int i=0;i<n;i++)
            {
                a[i] =br.readLine();
            }
          HashMap<String, Integer> hm = new HashMap<String, Integer>(); 
            for(int i=0;i<n;i++)
            {
                 if(hm.containsKey(a[i]))
                {
                    hm.put(a[i],hm.get(a[i])+1);
                }
                else
                {
                    hm.put(a[i],1);
                }
            }

          Map<String, Integer> hm1 = sortByValue(hm);
            
          for (Map.Entry<String, Integer> en : hm1.entrySet()) { 
            System.out.println( en.getKey() +" "+ en.getValue()); 
        } 
        }
        br.close();
    }
}
