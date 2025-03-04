package Fileoperations;
import java.io.*;
public class Bufferex {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a line of text:");
		String s [] = new String[100];
		for(int i=0;i<=10;i++)
		{
			s[i] = br.readLine();
			if(s.equals("quit"))
			{
				break;
				System.out.println("herw is the string:"+s[i]);
			}	
		}
	}
}
