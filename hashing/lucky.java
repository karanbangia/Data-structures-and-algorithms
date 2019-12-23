import java.util.*;
import java.lang.*;
import java.io.*;
class lucky
 {
	public static void main (String[] args)
	 {
	 Scanner o=new Scanner(System.in);
	 int q=o.nextInt();
	 while(q-->0){
	 HashSet<Integer>hs=new HashSet<>();
	 
	 //long n=o.next();
	 String s=o.next();
	// s=s+n;
	 for(int i=0;i<s.length();i++){
	     hs.add(Character.getNumericValue(s.charAt(i)));
	 }
	 
	 if(hs.size()<s.length()|| hs.contains(0)|| hs.contains(1)){
	     System.out.println(0);
	 //    f=1;
	 }
	 
	 
	else{
	for(int i=0;i<s.length();i++){
	    for(int j=i+1;j<s.length();j++){
	        hs.add(Character.getNumericValue(s.charAt(i))*Character.getNumericValue(s.charAt(j)));
	    }
	}
	
	if(hs.size()<(s.length()*(s.length()+1))/2)
	System.out.println(0);
	else
	System.out.println(1);
	
	
	 
	 
	}
	 }
	 
	 }
}