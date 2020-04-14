
public class MergeSortedArraysBufferinA {

	public static void main(String[] args) {
	
	int[] arrayA = {2, 5, 7,11,0,0,0,0};
	        int[] arrayB = {3, 6, 8, 12};
	        System.out.println("FirstArray is");
	        for(int i=0;i<arrayA.length;i++)
	        {
	        	System.out.print(arrayA[i]+" ");
	        }
	        System.out.println();
	        System.out.println("Second Array is");
	        for(int i=0;i<arrayB.length;i++)
	        {
	        	System.out.print(arrayB[i]+" ");
	        }
	        System.out.println();
	        System.out.println("Merge two sorted arrays");
	        
	        inplaceMergeArrays(arrayA, arrayB);
	        for (int i = 0;  i < arrayA.length; i++)
	        {
         System.out.print(arrayA[i] + ", " );
	}
	}
	
		//final static int INVALID_NUM = 0;
			
			    public static void inplaceMergeArrays(int[] arrayA, int[] arrayB)
			    {
			         
			        int OriginalArrayIndex = arrayA.length - 1;
			        for (int i = arrayA.length - 1; i >= 0; i--)
			        {
			            if (arrayA[i] != 0)
			            {
		                arrayA[OriginalArrayIndex] = arrayA[i];
		                OriginalArrayIndex =OriginalArrayIndex-1;
			            }
			        }
			        
			         
			        int i = OriginalArrayIndex + 1;
			        int j = 0, k = 0;
			        
		         
			        while ((i < arrayA.length) && (j < arrayB.length))
			        {
			            if (arrayA[i] < arrayB[j])
			            {
		                arrayA[k++] = arrayA[i++];
			            }
			            else
			            {
			                arrayA[k++] = arrayB[j++];
			            }
			        }
			        
			         
			        while (j < arrayB.length)
			        {
			            arrayA[k++] = arrayB[j++];
			        }
			    }
			    
			   
			    

}
