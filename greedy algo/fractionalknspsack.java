import java.util.*;
import java.lang.*;
import java.io.*;
// import java.math.RoundingMode;
// import java.text.DecimalFormat;
class knap
{
	double value;
	double weight;
	double ratio;
	
	knap(double value,double weight,double ratio)
	{
	    this.value=value;
	    this.weight=weight;
	    this.ratio=ratio;
	}
}

class fractionalknapsack {
	// private static DecimalFormat df2 = new DecimalFormat("#.##");
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        // taking input of number of testcase 
        int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+");
		    int n=Integer.parseInt(strs[0]);
		    int k=Integer.parseInt(strs[1]);
		    double a[]=new double[2*n];
		    String l = br.readLine(); 
            String m[] = l.trim().split("\\s+");
            for(int i=0;i<(2*n);i++)
		    {
		        a[i] = Double.parseDouble(m[i]);
		    }
		    knap ob[]=new knap[n];
		    
		    for(int i=0;i<(2*n);i=i+2)
		    {
		    	ob[i/2]=new knap(a[i],a[i+1],(double)(a[i]/a[i+1]));
		    }
		    
		    Arrays.sort(ob,new Comparator<knap>()
		    {
		    	public int compare(knap a,knap b)
		    	{
		    		if(a.ratio>b.ratio)
		    			return -1;
		    		else if(a.ratio<b.ratio)
		    			return 1;
		    		else
		    			return 0;
		    	}
		    });
		    
		    /*for(knap i:ob)
		    {
		        System.out.print(i.ratio+" ");
		    }*/
		    double profit=0.00;

		    for(int i=0;i<n;i++)
		    {
		    	if(ob[i].weight<=k)
		    	{
		    		profit+=ob[i].ratio*(ob[i].weight);
		    		k=(int)(k-ob[i].weight);	
		    	}
		    	else if(ob[i].weight>k && k>0)
		    	{
		    		profit+=ob[i].ratio*(k);
		    		k=0;
		    		break;
		    	}
		    }

		    System.out.println(String.format("%.2f", profit));

        }
        br.close();
    }
}