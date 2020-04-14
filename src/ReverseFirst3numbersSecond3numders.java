
public class ReverseFirst3numbersSecond3numders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,2,4,7,0,3,1,5,8,10};
		int len=a.length;
		int setsize = 2;
		
		for (int i=0; i<=a.length-1 ; i=i+setsize) {
			int temp;
			

			temp = a[i+setsize-1];
			a[i+setsize-1] = a[i];
			a[i] = temp;
			
		}
		
		
		for (int i=0; i<len ; i++) {
		
			System.out.print(a[i]+" ");
		
		}

	}

}
