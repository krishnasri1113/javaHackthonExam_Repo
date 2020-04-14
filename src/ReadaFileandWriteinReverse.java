import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadaFileandWriteinReverse {

	public static void main(String[] args) throws Exception {
		String spathToread=System.getProperty("user.dir")+"\\testtoread.txt";
		String spathTowrite=System.getProperty("user.dir")+"\\testtowrite.txt";
		ReadFile(spathToread);
		WriteFile(spathTowrite);

	}
	public static void ReadFile(String spath) throws Exception 
	{
		FileReader 	fr = new FileReader(spath);
			BufferedReader br=new BufferedReader(fr);
			String sLine;
			while((sLine=br.readLine())!=null)
			{
				System.out.println(sLine);
			}
			br.close();
			
		} 
	public static void WriteFile(String spath) throws Exception 
	
	{
		
	
		
	 
		FileWriter 	fw = new FileWriter(spath);
			BufferedWriter bw=new BufferedWriter(fw);
			String str="Helli siri";
		   String reverse="";
		   for(int i=str.length()-1;i>=0;i--)
		   {
			   reverse=reverse+str.charAt(i);
		   }
			 bw.write(reverse);
			
			bw.close();
			System.out.println("==done==");
			
		} 

	
		
		
	}


