import java.util.*;
import java.lang.*;
import java.io.*;

class nextpermutation {
   static void swap(int ar[], int i, int j)  
    { 
        int temp = ar[i]; 
        ar[i] = ar[j]; 
        ar[j] = temp; 
    } 
  

    static void fun(int ar[], int n)  
    { 
        int i; 
          
      
        for (i = n - 1; i > 0; i--)  
        { 
            if (ar[i] > ar[i - 1]) { 
                break; 
            } 
        } 
          

        if (i == 0)  
        { 
            Arrays.sort(ar); 

        }  
        else 
        { 
            int x = ar[i - 1], min = i; 
    
            for (int j = i + 1; j < n; j++)  
            { 
                if (ar[j] > x && ar[j] < ar[min])  
                { 
                    min = j; 
                } 
            } 
            swap(ar, i - 1, min); 
            Arrays.sort(ar, i, n); 
            
        } 
    } 
  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine());
    while(t-->0)
    {
        int n=Integer.parseInt(br.readLine());
        int a[]=new int[n];
        String line = br.readLine(); 
        String[] strs = line.trim().split("\\s+");
        for(int i=0;i<n;i++)
        {
            a[i] = Integer.parseInt(strs[i]);
        }
        fun(a,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        
        
            
        }
        br.close();
    }
}