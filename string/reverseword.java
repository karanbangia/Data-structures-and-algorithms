import java.util.*;
import java.lang.*;
import java.io.*;

class reverseword {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{ 
            String line=br.readLine();
            line=line.replace("."," ");
            String[] a = line.trim().split(" ");
            for(int i=a.length-1;i>0;i--)
            {
               System.out.print(a[i]+".");
            }
            System.out.println(a[0]);

            
        }
    }
}