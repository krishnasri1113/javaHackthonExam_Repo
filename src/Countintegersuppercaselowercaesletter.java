import java.util.Scanner;

public class Countintegersuppercaselowercaesletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int uppercase = 0,lowercase=0,digitscount=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=in.nextLine();
		for(int i=0;i<str.length();i++)
		{
			 char ch = str.charAt(i); 
			 
	            if (ch >= 'A' && ch <= 'Z')
	            {
	                uppercase++; 
	            }
	            else if (ch >= 'a' && ch <= 'z') 
	            {
	                lowercase++; 
	            }
	            else if (ch >= '0' && ch <= '9') 
	            {
	                digitscount++; 
	            }
			
			
		}
		System.out.println("No. of lowercase letters : " + lowercase);
		System.out.println("No. of uppercase lettesr : " + uppercase);
		System.out.println("No. of digits : " +digitscount );
		

	}

}
