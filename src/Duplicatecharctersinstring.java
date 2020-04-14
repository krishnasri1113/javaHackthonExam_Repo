import java.util.Scanner;

public class Duplicatecharctersinstring {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=in.nextLine();
		//converting string to array of characters
		char[] chArray=str.toLowerCase().toCharArray();
		System.out.println("Duplicate characters are");
		for(int i=0;i<chArray.length;i++)
		{
			boolean b=false;
			if(chArray[i]!=0)
			{
			for(int j=(i+1);j<chArray.length;j++)
			{
				if(chArray[i]==chArray[j])
				{
					//System.out.println(chArray[i]+" ");
		          chArray[j]=0;
		          b=true;
				}
			

			}
			

		}
			if(b)
			{
				System.out.println(chArray[i]+" ");
			}
		
			
			
	}
		

	}

}
