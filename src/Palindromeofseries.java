//Given an array of integers check the Palindrome of the series. *

import java.util.Scanner;

public class Palindromeofseries {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the elements");
		 int[] arr=new int[4];
		 for(int i=0;i<arr.length;i++)
		 {
			 arr[i]=in.nextInt();
		 }
		 System.out.println("Elements are");
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.print(arr[i]+" ");
		 }
		 System.out.println();
		 for(int i=0;i<arr.length;i++)
		 {
			 int num=arr[i];
			 int reversenum=0;
			 int reminder=0;
		 
		 while(num>0)
		 {
			 reminder=num%10;
			 num = num / 10;
			 reversenum = reversenum * 10 + reminder;
			 
			 }
		 
		   if(arr[i] == reversenum)
			 System.out.println(arr[i] + " is a palindrome number");
			 else 
			 System.out.println(arr[i] + " is not a palindrome number");
			 }
			 
	}

}
