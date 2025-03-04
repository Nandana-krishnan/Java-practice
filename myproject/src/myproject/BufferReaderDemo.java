//Using BufferedReader to character 
package myproject;
import java.io.*;
public class BufferReaderDemo {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = new String[50];
		System.out.println("Enter\n'Quit' to stop");
		int i;
		for(i=0;i<10;i++)
		{
			str[i]=br.readLine();
			if(str[i].equals("Quit"))
				break;
		}
		System.out.println("Details");
		for(i=0;i<10;i++)
		{
			if(str[i].equals("Quit"))
				break;
			System.out.println(str[i]);
			
		}
	}
}
