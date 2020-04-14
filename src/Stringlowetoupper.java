import java.util.Scanner;

public class Stringlowetoupper {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=in.nextLine();
      System.out.println("String in lowercase: "+str.toUpperCase());
      System.out.println("String Subsequence "+str.subSequence(0, 5));
      System.out.println("String split method");
      for(String s:str.split(" "))
      {
    	  System.out.println(s);
      }


	}

}
