
public class MergeTwoArrayswithoutUsingThirdArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println();
		//System.out.println(mergesortedarrays({1,3,5,6},{2,4,7,8},4,4);
		int[] arr1= {1,3,5,6};
		int[] arr2= {2,4,7,9};
		int m=arr1.length;
		int n=arr2.length;
		mergeSortedArrays(arr1,arr2,m,n);
		
		
	
	}
	
	
		 static void mergeSortedArrays(int arr1[],int arr2[],int m,int n)
		{
		    int i,j,k;
		    i=m-1;
		    j=n-1;
		    k=m+n-1;
		    while(i>=0&&j>=0)
		    {
		        if(arr1[i]>arr2[j])
		        arr1[k]=arr1[i--];
		        else
		        arr1[k]=arr2[j--];
		        k--;
		    }
		    while(j>=0)
		    arr1[k--]=arr2[j--];
		}
	}


