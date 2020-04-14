import java.util.Scanner;
//WJP to display number of occurrence of all character *


public class NoOfOccurenceofallcharacters {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=in.nextLine();
        //converting string to array of characters
        char[] chArray=str.toLowerCase().toCharArray();
        //comparing first element of character array with second element of character array
        for(int i=0;i<chArray.length;i++)
        	 { 
        	if(chArray[i]!=0)
        	{
        	boolean bvalFound=false;
        	int count=1;
        	for(int j=(i+1);j<chArray.length;j++)
        	{
        		if(chArray[i]==chArray[j])
        		{
        			chArray[j]=0;
        			bvalFound=true;
        			count++;
        		}
        	}
        	
        	if(bvalFound)
        	{
             System.out.println("The character "+chArray[i]+" occured "+count+" times");	
        	}
        	else
        	{
        		System.out.println("The character "+chArray[i]+" occured "+count+" times");
        	}
            
        	}
            	
        }
        


	}

}
