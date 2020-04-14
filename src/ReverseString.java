import java.util.Scanner;
//Given a string print the reverse of the string.(Input: Java Code Output: edoC avaJ) *


public class ReverseString {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=in.nextLine();
		int len=str.length();
		String reverse="";
		for(int i=len-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		System.out.println("Reverse of Given String is "+reverse);

	}

}
