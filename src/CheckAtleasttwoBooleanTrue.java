import java.util.Scanner;

public class CheckAtleasttwoBooleanTrue {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the a value: ");
		boolean a=in.nextBoolean();
		System.out.print("Enter the b value: ");
		boolean b=in.nextBoolean();
		System.out.print("Enter the c value: ");
		boolean c=in.nextBoolean();
		   int count=0;
		   if((a==true))
		   {
			 count++; 
	
		   }
		   if(b==true)
		   {   
			   count++;
		   }
		   if (c==true)

		   {    
			   count++;
		   }
		   
		   System.out.println("count " +count);
		   
		  

		   
		   if(count>=2)
		   {
			   System.out.println("you have entered two or more bool values as true");
		   }
		   
		   else {
			   System.out.println("you have entered less than two bool value as true");

			   
		   }
		   
		   
		}
	}
		
	
  
