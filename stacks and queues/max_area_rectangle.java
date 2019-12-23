	

/*This is a function problem.You only need to complete the function given below*/
/*Complete the function given below*/
class GfG{
    static int histogramSolver(int a[],int n)
    {   int max_area_so_far=Integer.MIN_VALUE;
        Stack<Integer> s=new Stack<>();
        s.push(0);
        for(int i=1;i<n;i++)
        {
            if(a[i]<a[i-1])
            {
                while(a[s.peek()]>a[i])
                {
                    int x=s.pop();
                     
                    if(s.isEmpty())
                    {
                        int z=a[x]*i;
                        if(z>max_area_so_far)
                        {
                            max_area_so_far=z;
                        }
                        break;
                       
                    }
                    else
                    {
                        int z=a[x]*(i-s.peek()-1);
                        if(z>max_area_so_far)
                        {
                            max_area_so_far=z;
                        }
                        
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
            
                    int x=s.pop();
                     
                    if(s.isEmpty())
                    {
                        int z=a[x]*n;
                        if(z>max_area_so_far)
                        {
                            max_area_so_far=z;
                        }
                    }
                    else
                    {
                        int z=a[x]*(-s.peek()-1);
                        if(z>max_area_so_far)
                        {
                            max_area_so_far=z;
                        }
                    }
        }
        return max_area_so_far;
    }
    public int maxArea(int a[][],int m,int n)
    {
        int max=Integer.MIN_VALUE;
        int array[]=new int[n];
      for(int i=0;i<m;i++)
      { 
          for(int j=0;j<n;j++)
       {
           array[j]+=a[i][j];
           if(a[i][j]==0)
           {
               array[j]=0;
           }
           
           
       }
       if(max<histogramSolver(array,n))
           {
               max=histogramSolver(array,n);
           }
          
      }
      return max;
        
    }
}