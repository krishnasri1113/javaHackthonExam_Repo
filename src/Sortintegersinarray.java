// Given an array of integers, sort the integer values. *

import java.util.Scanner;

public class Sortintegersinarray {

	public static void main(String[] args) {
		int temp=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int len=in.nextInt();
		int arr[]=new int[len];
		System.out.println("Enter all the elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println("Before sorting the elements are");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++)
		{
		
		for(int j=i+1;j<arr.length;j++)
		{
		 if(arr[i]<arr[j])
		 {
         temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
		 }
	        }
		}
		 System.out.println();
         System.out.println("Array after sorting");
         {
        	 for(int i=0;i<arr.length;i++)
        	 {
        	 System.out.print(arr[i]+" ");
        	 }
         }
		
	}
}