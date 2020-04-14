import java.util.Scanner;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=in.nextInt();
		System.out.println("Factorial using Recursion "+factorial(num));
		

	}
	public static int factorial(int n)
	{
		if(n==1)
			return 1;
		else return n*factorial(n-1);
					
	}

}
