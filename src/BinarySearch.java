import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int   item,  first, last, middle;
	   
	      Scanner in = new Scanner(System.in);
	      System.out.println("Enter number of elements:");
	       int num = in.nextInt(); 
	      int[] arr = new int[num];
         System.out.println("Enter " + num + " integers");
	  for (int i = 0; i < arr.length; i++)
	      arr[i] = in.nextInt();
        System.out.println("Enter the search value:");
	      item = in.nextInt();
	      first = 0;
	      last = num - 1;
	      middle = (first + last)/2;

	      while( first <= last )
	      {
	         if ( arr[middle] < item )
	           first = middle + 1;
	         else if ( arr[middle] == item )
	         {
	           System.out.println(item + " found at location " + (middle + 1));
	           break;
	         }
	         else
	         {
	             last = middle - 1;
	         }
	         middle = (first + last)/2;
	      }
	      if ( first > last )
	          System.out.println(item + " is not found");

	}

}
