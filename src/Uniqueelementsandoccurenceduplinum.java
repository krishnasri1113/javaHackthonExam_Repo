import java.util.Scanner;

public class Uniqueelementsandoccurenceduplinum {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the elements you  in the array");
	int n=in.nextInt();
	int[] arr=new int[n];
	System.out.println("Enter all the elments");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=in.nextInt();
	}
	System.out.println("Elements in the array is");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("Unique nums are");
	{    
		for (int i = 0; i < arr.length; i++) {
			boolean isdistinct=false;
	         for (int j = 0; j < i; j++)
	         {
	            if (arr[i] == arr[j])
	            {
	            isdistinct=true;
	            break;
	            }
	         }
	            if (!isdistinct)
	            {
	               System.out.print( arr[i] + " ");
	            }
	      }
	         }
	System.out.println("");
	System.out.println("Occurrence of numbers");
	for(int i=0;i<arr.length;i++)
	 { 
	if(arr[i]!=0)
	{
	boolean bvalFound=false;
	int count=1;
	for(int j=(i+1);j<arr.length;j++)
	{
		if(arr[i]==arr[j])
		{
			arr[j]=0;
			bvalFound=true;
			count++;
		}
	}
	
	if(bvalFound)
	{
    System.out.println("The character "+arr[i]+" occured "+count+" times");	
	}
     }
	}
	}
}
