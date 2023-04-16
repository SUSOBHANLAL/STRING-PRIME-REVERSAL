package primeREVERSAL;
import java.util.*;
public class susobhsn {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc =  new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int k = 0;k<t;k++){
		    int n  = sc.nextInt();
		    
		    String s1 = sc.next();
		    String s2 = sc.next();
		    
		    
		    int count =0;
		    int st =0;
		    for(int i =0;i <n;i++){
		        char k1 = s1.charAt(i);
		        char k2 = s2.charAt(i);
		        if(k1== '1'){
		            count++;
		        }if(k2 == '1'){
		            st++;
		        }
		    }
		    
		  //  System.out.println(count);
		  //  System.out.println(st);
		    
		    
		    if(count==st){
		        System.out.println("YES");
		    }else{
		         System.out.println("NO");
		    }
		  
		}
	}

}
