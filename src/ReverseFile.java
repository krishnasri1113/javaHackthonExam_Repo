import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReverseFile {

	public static void main(String[] args) throws Exception {
		String spathToread=System.getProperty("user.dir")+"\\testtoread.txt";
		String spathTowrite=System.getProperty("user.dir")+"\\testtowrite.txt";
		FileReader fr = new FileReader(spathToread);  
		FileWriter fw = new FileWriter(spathTowrite);  
		BufferedReader br = new BufferedReader(fr);  
		           
		String data;  
		           
		while ((data = br.readLine()) != null){
		    String[] words = data.split(" ");
		    for(String a: words){
		        StringBuilder builder=new StringBuilder(a);
		        System.out.println(builder.reverse().toString());
		    }  
		}



	
}
}
