import java.util.Scanner;
// Given a string print the reverse of the words string.(Input: Java Code Output: Code Java) *


public class ReversewordsString {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=in.nextLine();
		String[] arr=str.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		
		}
	

	}

}
