import java.util.Scanner;

public class SelectionSortbyAsc {

	public static void main(String[] args) {
		int size, i, j, temp;  
	       int arr[] = new int[50];  
	       Scanner in = new Scanner(System.in);  
	         
	       System.out.print("Enter Array Size : ");  
	       size = in.nextInt();  
	         
	       System.out.println("Enter Array Elements : ");  
	       for(i=0; i<size; i++)  
	       {  
	           arr[i] = in.nextInt();  
	       }  
	         
	       System.out.println("Sorting Array using Selection Sort Technique");  
	       for(i=0; i<size; i++)  
	       {  
	           for(j=i+1; j<size; j++)  
	           {  
	               if(arr[i] > arr[j])  
	               {  
	                   temp = arr[i];  
	                   arr[i] = arr[j];  
	                   arr[j] = temp;  
	               }  
	           }  
	       }  
	         
	       System.out.println("Now the Array after Sorting is ");  
	       for(i=0; i<size; i++)  
	       {  
	           System.out.print(arr[i]+ "  ");  
	       }  

	}

}
