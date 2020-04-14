import java.util.Scanner;

public class DifferntiateinputasStringIntegerorBoolean {

	public static void main(String[] args) {
           Scanner in=new Scanner(System.in);
           System.out.println("Enter the String");
           String str=in.nextLine();
/*           if (str.isEmpty() )
           {        	   
        	   System.out.println("Please Enter some input");

           }*/
           
           if (str.equalsIgnoreCase("true") || str.equalsIgnoreCase("false"))
           {        	   
        	   System.out.println("Input is boolean");

           }
           
           
	      else if(isdigit(str))
           {
        	   System.out.println("Input is Integer");
           }
           else
           {
        	   System.out.println("Input is String");
           }
          }
           

	
	public static boolean isdigit(String s)
    {    
		for(int i=0;i<s.length();i++) {
		if(Character.isDigit(s.charAt(i))==false)

			return false;
		}
    	 return true;
	}
       
}

