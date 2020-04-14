 //write a program to find factorial (Non Recursive) *

import java.util.Scanner;

public class Factorialofanum {

	public static void main(String[] args) {
	  Scanner in=new Scanner(System.in);
	  System.out.println("Enter the number");
	  int num=in.nextInt();
	  int fact=1;
	  if(num<0)
	  {
		  System.out.println("Number should ne non negative");
	  }
	  else
	  {
		  for(int i=1;i<=num;i++)
		  {
			  fact=fact*i;
		  }
		  System.out.println("Factorial of given num is "+fact);
	  }
	  

	}

}
