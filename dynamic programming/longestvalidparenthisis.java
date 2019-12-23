public class Solution {
    public int longestValidParentheses(String A) {
        char a[]=A.toCharArray();
        Stack<Integer> s =new Stack<>();
        s.push(-1);
        int max=0;
        int n=A.length();
        for(int i=0;i<n;i++)
        {
            if(a[i]=='(')
            {
                s.push(i);
            }
            else
            {   s.pop();  
                if(!s.isEmpty())
                {
                   
                    max=Math.max(max,i-s.peek());
                }
                else
                {
                    s.push(i);
                }
                
            }
        }
        return max;
        
    }
}
