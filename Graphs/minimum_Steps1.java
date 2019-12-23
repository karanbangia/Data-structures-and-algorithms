import java.util.*; 
class Pair 
{ 
    int first , second; 
    Pair(int a, int b) 
    { 
        first = a; 
        second = b; 
    } 
} 
class minimum_Steps1
{ 
      
static int n= 3 ; 

static int minSteps(int arr[][])  
{  
    Pair p;
    boolean v[][] = new boolean[n][n]; //intially saare false; 
    
    Queue<Pair> q = new LinkedList<Pair>();  
  
    // Initializing queue  
    q.add(new Pair( 0, 0 ));  
  
    // To store the depth of search  
    int depth = 0;  
    
    while (q.size() != 0)  
    {  
  

        int x = q.size();  
        while (x-->0)  
        {  
  
            Pair y = q.peek();  
            int i = y.first, j = y.second;  
            q.remove();  
            if (v[i][j])  
                continue;  
   
            if (i == n - 1 && j == n - 1)  
                return depth;  

            v[i][j] = true;  
  
            if (i + arr[i][j] < n)  
                q.add(new Pair( i + arr[i][j], j ));  
            if (j + arr[i][j] < n)  
                q.add(new Pair( i, j + arr[i][j] ));  
        }  
        depth++;  
    }  
    return x-1;  
}  
  
// Driver code  
public static void main(String args[]) 
{  
    int arr[][] = { { 1, 1, 1 },  
                    { 1, 1, 1 },  
                    { 1, 1, 1 } };  
  
    System.out.println(minSteps(arr));  
} 
} 