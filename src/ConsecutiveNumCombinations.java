import java.util.Scanner;

public class ConsecutiveNumCombinations {

	public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         System.out.println("Enter the num");
         int num=in.nextInt();
         findconsecutive(num);
         

	}
	public  static void findconsecutive(int n)
	
	{
		int first = 1; 
	    int last = (n + 1) / 2; 
	  
	    while (first < last) 
	    { 
	        
	        int sum = 0; 
	        for (int i = first; i <= last; i++) 
	        { 
	            sum = sum + i; 
	  
	             
	            if (sum == n) 
	            { 
	                
	                for (int j = first; j <= i; j++) 
	                      
	                    System.out.print(j + " "); 
	                    System.out.println(); 
	                break; 
	            } 
	  
	            
	            if (sum > n) 
	                break; 
	        } 
	        sum = 0; 
	       first++; 
	    } 
	} 
	
}

