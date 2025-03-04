package exceptions;
import java.util.Scanner;
class Election extends Exception
{
	Election(int a)
	{
		System.out.println("You cant vote baby");
	}
}
class Userdefined
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		try
		{
			if(age<18) 
			{
				throw new Election(age);
			}
			else 
				System.out.println("ELIGIBLE");
		}
		catch(Election a)
		{
			System.out.println("It should be greater than 18");
		}
	}
}