import java.util.HashMap;
import java.util.Scanner;
// Given a string print the unique words of the string. *


public class Uniquewordsinstring {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=in.nextLine();
		HashMap<String,String> hm=new HashMap<String,String>();
		String[] strArray=str.split(" ");
		for(int i=0;i<strArray.length;i++)
		{
			if(!hm.containsKey(strArray[i]))
			{
				hm.put(strArray[i], "unique");
			}
		}
		System.out.println(hm);
		

	}

}
