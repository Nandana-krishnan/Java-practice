package exm;
import java.util.Scanner;
public class CharFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		System.out.println("Enter the sentence");
		String s =  sc.nextLine();
		System.out.println("Enter the char to search:");
		char ch = sc.next().charAt(0);
		int count =0;
		for(int i=0; i < s.length();i++)
		{
			if(s.charAt(i) == ch)
			{
				count++;
			}
		}
		if(count == 0)
			System.out.println("no such character!!");
		else
			System.out.println("Number of frequency of char :" +count);
	}

}
