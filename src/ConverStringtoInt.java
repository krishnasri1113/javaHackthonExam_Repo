//WJP to convert string to int *

import java.util.Scanner;

public class ConverStringtoInt {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=in.nextLine();
		int result=Integer.parseInt(str);
		System.out.println("String to int: "+result);
		

	}

}
