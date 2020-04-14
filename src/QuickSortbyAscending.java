
public class QuickSortbyAscending {

	public static void main(String[] args) {

			        int i;  
			        int[] arr={400,335,90,23,101,45,50}; 
			        System.out.println("Array Elements Are");
			        for( i=0;i<arr.length;i++)
			        {
			        	System.out.print(arr[i]+" ");
			        }
			        quickSort(arr, 0, arr.length-1);  
			        System.out.println("\nThe Quick Sorted Ascended array is");  
			        for(i=0;i<arr.length;i++)  
			        System.out.print(arr[i]+" ");  
			    }  
	public static int partition(int a[], int beg, int end)  {  
			          
			        int  temp, pivot, flag;     
			        pivot = beg;  
			        flag = 0;  
			        while(flag != 1)  
			        {  
			            while((a[pivot] <= a[end]) && (pivot!=end))  
			            end--;  
			            if(pivot==end)  
			            flag =1;  
			            else if(a[pivot]>a[end])  
			            {  
			                temp = a[pivot];  
			                a[pivot] = a[end];  
			                a[end] = temp;  
			                pivot = end;  
			            }  
			            if(flag!=1)  
			            {  
			                while((a[pivot] >= a[beg]) && (pivot!=beg))  
			                beg++;  
			                if(pivot==beg)  
			                flag =1;  
			                else if(a[pivot] <a[beg])  
			                {  
			                    temp = a[pivot];  
			                    a[pivot] = a[beg];  
			                    a[beg] = temp;  
			                    pivot = beg;  
			                }  
			            }  
			        }  
			        return pivot;  
			    }  
	
	static void quickSort(int a[], int beg, int end)  {  
			          
			        int pivot;  
			        if(beg<end)  
			        {  
			        	pivot = partition(a, beg, end);  
			            quickSort(a, beg, pivot-1);  
			            quickSort(a, pivot+1, end);  
			        }  
			    }  
	}

