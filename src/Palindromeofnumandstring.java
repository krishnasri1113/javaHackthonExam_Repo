import java.util.Scanner;

//Write a program to check palindrome (MalayalaM) for both numbers and string? *

public class Palindromeofnumandstring {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=in.nextLine();
		int len=str.length();
		String reverse = "";
		for(int i=len-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		if(str.equals(reverse))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
		System.out.println("String is not palindrome");
		}
		
		System.out.println("check num is palindrome or not");
		{
			System.out.println("Enter the num");
			int num=in.nextInt();
			int reversenum=0,reminder;
			int temp=num;
			while(num>0)
			{
				reminder=num%10;
				reversenum=(reversenum*10)+reminder;
				num=num/10;
				
			}
			if(temp==reversenum)
			{
				System.out.println("num is Palindrome");
			}
			else
			{
				System.out.println("num is not palindrome");
			}
			

		}
		

	}

}
