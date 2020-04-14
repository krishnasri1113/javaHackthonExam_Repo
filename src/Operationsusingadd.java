import java.util.Scanner;

public class Operationsusingadd {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=in.nextInt();
		System.out.println("Enter b value");
		int b=in.nextInt();
	     Multiply(a,b);
		  Sub(a,b);
		 System.out.println("Division of two nums is "+divide(a,b));
		  
	}

	public static void Multiply(int a,int b)
	{
		int i=5,multi=0;
		for(int j=1;j<5;j++)
		{
		 multi=multi+i;
		}
		System.out.println("Multiply of two numbers is "+multi);
	}
	
	public  static void Sub(int a,int b)
	{
		System.out.println("bitwise of b: "+~b);
		int sub = a+~b+ 1; 
		 System.out.println("Substraction: "+sub);
		}
	static int divide(int dividend, int divisor)  
    { 
          
   
        int i = ((dividend < 0) ^  
                   (divisor < 0)) ? -1 : 1; 
      
      
        dividend = Math.abs(dividend); 
        divisor = Math.abs(divisor); 
      
   
        int quotient = 0; 
          
        while (dividend >= divisor) 
        { 
            dividend = dividend-divisor; 
            quotient++; 
        } 
      
        return i * quotient; 
    }     
	}
		
	



