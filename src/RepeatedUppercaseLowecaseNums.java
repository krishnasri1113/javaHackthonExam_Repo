import java.util.Scanner;

public class RepeatedUppercaseLowecaseNums {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String");
          String s=in.nextLine();
	     char[] arr=s.toCharArray();
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
