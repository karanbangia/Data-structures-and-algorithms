public class Solution {
    public String solve(String s) {
        int count[]=new int[26];
        Queue<Character> q=new LinkedList<>();
        String k="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            count[c-'a']++;
            if(count[c-'a']==1)q.add(c);
            while(!q.isEmpty() && count[q.peek()-'a']>1)
            {
                q.poll();
                
            }
            if(q.isEmpty())
            {
                k+="#";
            }
            else
            {
                k+=Character.toString(q.peek());
            }
        }
        return k;
        
    }
}
