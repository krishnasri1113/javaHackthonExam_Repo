import java.util.Scanner;

public class RemovecharatcerfromtheString {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        System.out.println("Enter the given String");
        String str=in.nextLine();
        System.out.println("enter the character to remove");
        char ch=in.next().charAt(0);
          
        for(int i=0;i<str.length();i++)
        {
        	if(str.charAt(i)!=ch)
        	{
        		System.out.print(str.charAt(i));
            	
        	}
        	
        		
        }
       
          

	}

}
