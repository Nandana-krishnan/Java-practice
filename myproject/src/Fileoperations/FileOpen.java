package Fileoperations;
import java.io.*;
public class FileOpen {

	public static void main(String[] args) throws IOException {
		FileInputStream fi = null;
		int i;
		try
		{
			fi = new FileInputStream("Data.txt");
			do
			{
				i = fi.read();
				if(i!=-1)
					System.out.print((char)i);
			}while(i!=-1);
			
		}
		catch (FileNotFoundException e)
		{
			System.out.println("no File");
			return;
		}
		fi.close();
	}

}
