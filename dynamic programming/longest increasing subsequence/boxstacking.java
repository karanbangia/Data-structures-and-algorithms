{
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class gfg
{
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    
    //sc.next();
    while(t-- > 0)
    {
        int n = sc.nextInt();
        
        int A[]  =new int[1000];
        int B[] = new int[1000];
        int C[] = new int[1000];
        
        for(int i = 0; i < n; i++)
        {
            int a =sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            A[i] = a;
            B[i] = b;
            C[i] = c;
        }
        
        Geeks ob = new Geeks();
        System.out.println(ob.maxHeight(A,B,C,n));
    }
   }
}
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class box
{
    int h;
    int w;
    int l;
    int area;
    box(int h,int w,int l)
    {
       this.h=h;
       this.w=w;
       this.l=l;
    }
}
class Geeks 
{
    public static int maxHeight(int height[], int width[], int length[], int n)
   {
       box ob[]=new box[n];
       for(int i=0;i<n;i++)
       {
           ob[i]=new box(height[i],width[i],length[i]);
       }
       
       box rot[]=new box[3*n];
       for(int i=0;i<n;i++)
       {
            rot[3*i] = new box(ob[i].h, Math.max(ob[i].w,ob[i].l),  
                                    Math.min(ob[i].w,ob[i].l));
            rot[3*i + 1] = new box(ob[i].w, Math.max(ob[i].h,ob[i].l),  
                                       Math.min(ob[i].h,ob[i].l));
            rot[3*i + 2] = new box(ob[i].l, Math.max(ob[i].w,ob[i].h), 
                                       Math.min(ob[i].w,ob[i].h));
       }
       for(int i=0;i<3*n;i++)
       {
           rot[i].area=rot[i].w*rot[i].l;
       }
       Arrays.sort(rot,new Comparator<box>()
       {
           public  int compare(box a,box b)
           {
               return b.area-a.area;
           }
           
           });
        int dp[]=new int[3*n];
        for(int i=0;i<3*n;i++)
        {
            dp[i]=rot[i].h;
        }
        int best=0;
        for(int i=0;i<3*n;i++)
        {
            int val=0;
            for(int j=0;j<i;j++)
            {
                if(rot[j].w<rot[i].w && rot[j].l<rot[i].l)
                {
                    dp[i]=Math.max(dp[i],dp[j]+rot[i].h);
                }
            }
            best=Math.max(best,dp[i]);
        }
        return best;
       
   }
}
