class Solution {
    public String reverseStr(String s, int k) {
        int n=s.length();
        if(n<k)
        {
             StringBuilder sb = new StringBuilder(s);
             sb.reverse();
            return String.valueOf(sb);
        }
        if(n>k && n<2*k)
        {
            StringBuilder sb = new StringBuilder(s.substring(0,k));
            sb.reverse();
            return String.valueOf(sb)+s.substring(k,n);
            
        }
        if(n==k)
        {
             StringBuilder sb = new StringBuilder(s);
             sb.reverse();
             return String.valueOf(sb);
        }
        else
        {
            String ans="";
            int i;
            for(i=0;i<n;i+=(2*k))
            {
                if(i+(2*k)<n)
                {
                     StringBuilder sb = new StringBuilder(s.substring(i,i+k));
                     sb.reverse();
                     ans+=String.valueOf(sb)+s.substring(i+k,i+2*k);
                }
               
            }
            i=i-2*k;
            if(n-i>k)
            {
                StringBuilder sb = new StringBuilder(s.substring(i,i+k));
                sb.reverse();
                ans+=String.valueOf(sb)+s.substring(i+k,n);

            }
            else if(n-i==k)
            {
                  StringBuilder sb = new StringBuilder(s.substring(i,i+k));
                  sb.reverse();
                  ans+=String.valueOf(sb);
            }
            else
            {
                StringBuilder sb = new StringBuilder(s.substring(i,n));
                sb.reverse();
                ans+=String.valueOf(sb);
            }
            
            return ans;
        }
        
    }
}