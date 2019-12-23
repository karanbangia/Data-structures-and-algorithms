class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        if(n==0)return 0;
        Stack<Integer> s=new Stack<>();
        int max_area=-1;
        s.push(0);
        int i;
        for(i=1;i<n;i++)
        {
            if(heights[i]<heights[i-1])
            {
                
                while(heights[s.peek()]>heights[i])
                {
                    int rv=s.pop();
                    if(s.isEmpty())
                    {
                       max_area=Math.max(max_area,heights[rv]*i) ;
                        break;
                    }
                    else
                    {
                        max_area=Math.max(max_area,heights[rv]*(i-s.peek()-1));
                    }
                }
                 s.push(i);
            }
            else
            {
                s.push(i);
            }
           
            
               
        }
        while(!s.isEmpty())
        {
            int rv=s.pop();
            if(s.isEmpty())
            {
               max_area=Math.max(max_area,heights[rv]*i) ;
            }
            else
            {
                max_area=Math.max(max_area,heights[rv]*(i-s.peek()-1));
            }
        }
        return max_area;
        
        
    }
}